package com.dam.escuela.controllers;

import com.dam.escuela.model.Profesor;
import com.dam.escuela.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/teachers")
    public String teachersList(Model model){
        model.addAttribute("teachers", profesorService.listaProfesores());
        return "teachersListView";
    }

    @GetMapping("/teacher/{id}")
    public String findTeacherById(@PathVariable Long id, Model model){

        Profesor profesor = profesorService.buscarProfesorPorId(id);

        if(profesor == null){
            model.addAttribute("idNotFound" , "El profesor no existe");
            return "errors/errorPage";
        }
        model.addAttribute("teacher", profesor);
        return "teacherView";
    }

    @GetMapping("/teacher/eliminar/{id}")
    public String deleteTeacher(@PathVariable Long id, Model model){
        profesorService.eliminarProfesor(id);
        return "redirect:/teachers";
    }

    @GetMapping("/teacher/form")
    public String form(Profesor profesor, Model model){
        model.addAttribute("teacher" , profesor);
        return "form";
    }

    @PostMapping("/teacher/save")
    public String save(Profesor profesor){
        profesorService.guardarProfesor(profesor);
        return "redirect:/teachers";
    }

}
