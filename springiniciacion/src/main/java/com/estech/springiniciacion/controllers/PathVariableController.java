package com.estech.springiniciacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class PathVariableController {

    @GetMapping("/pathvariable-link")
    public String links(){
        return "pathVaraibleLinks";
    }

    @GetMapping("/get-dni/{dni}/{edad}")     //    http://localhost:8080/get-dni/33291523W/25
    public String getDni(@PathVariable String dni, @PathVariable Integer edad, Model model){
        model.addAttribute("dni" , dni);
        model.addAttribute("edad" , edad);
        return "dniView";
    }
}
