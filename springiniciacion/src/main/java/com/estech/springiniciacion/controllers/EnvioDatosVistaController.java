package com.estech.springiniciacion.controllers;

import com.estech.springiniciacion.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/envio")
public class EnvioDatosVistaController {

    @GetMapping("")
    public String inicio(Model model){
        model.addAttribute("persona", "Juan");
        return "inicio";
    }

    @GetMapping("/empleados")
    public String listaEmpleados(Model model){

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1l,"Lucas", "Pérez" , "López", 981655443));
        empleados.add(new Empleado(2l,"Marta", "Gómez" , "Arousa", 656544332));

        model.addAttribute("lista", empleados);

        return "listaEmpleados";
    }
}
