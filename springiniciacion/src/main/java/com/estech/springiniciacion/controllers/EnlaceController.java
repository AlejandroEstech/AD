package com.estech.springiniciacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnlaceController {


    @GetMapping("/links")
    public String links(){
        return "linksView";
    }

    @GetMapping("/get-car")
    public String getCar(@RequestParam String coche, Model model){
        model.addAttribute("car", coche);
        return "cars";
    }
}
