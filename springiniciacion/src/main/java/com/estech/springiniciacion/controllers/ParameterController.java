package com.estech.springiniciacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("parameter")
public class ParameterController {


    // Captura de un parámetro de la url (get)

    @GetMapping("")
    public String getParameter(@RequestParam(name = "nombre")String nombre, Model model){
        model.addAttribute("parametro", nombre);
        return "parameterView";
    }

    // Captura de un parámetro get donde el nombre del parámetro coincide con el nombre de la variable donde se almacene
    @GetMapping("/otro")
    public String getOtherParameter(@RequestParam String nombre, Model model){
        model.addAttribute("parametro", nombre);
        return "parameterView";
    }

    // Captura de varios parámetros get- opcionales
    @GetMapping("/varios")
    public String getSeveralParameter(@RequestParam(required = false) String nombre, @RequestParam(required = false) Integer edad, Model model){
        model.addAttribute("parametro", nombre);
        model.addAttribute("edad", edad);
        return "parameterView";
    }


    // Método que despliega la vista de un formulario
    @GetMapping("/form")
    public String form(){
        return "formView";
    }

    // Método para obtener los parámetros del formulario
    @GetMapping("/get-data")
    public String formData(@RequestParam(required = false)String nombre, @RequestParam(required = false)String email, Model model){
        model.addAttribute("nom", nombre);
        model.addAttribute("email", email);

        return "getData";
    }




}
