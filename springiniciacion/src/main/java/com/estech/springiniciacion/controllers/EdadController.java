package com.estech.springiniciacion.controllers;

import com.estech.springiniciacion.service.IsAdultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EdadController {

    @Autowired
    private IsAdultService isAdultService;

    @GetMapping("/get-edad")
    public String getMayoriaEdad(@RequestParam Integer edad, Model model){
        String isAdult = isAdultService.getAge(edad);
        model.addAttribute("isAdult" , isAdult);

        return "isAdult";
    }
}
