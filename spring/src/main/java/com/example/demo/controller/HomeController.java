package com.example.demo.controller;


import com.example.demo.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {



    // http://localhost:8080/home


    @GetMapping("/inicio")    //     http://localhost:8080/home/inicio
    public String inicio(){
        return "home";
    }

    @GetMapping("/admin")    //     http://localhost:8080/home/admin
    public String admin(){
        return "admin";
    }


    @GetMapping("/animales")
    public String animal(Model model){


        List<String> depredadores = new ArrayList<>();

        depredadores.add("Tigre");
        depredadores.add("León");

        String nombreDepredador = "León";
        String nombreAve = "Paloma";

        model.addAttribute("depredadores", depredadores);
        model.addAttribute("ave", nombreAve);
        return "animales";

    }

    @GetMapping("/personas")
    public String getAllPeople(Model model){

        List<Persona> personas =  new ArrayList<>();

        personas.add(new Persona("Juan", "juan@es.es"));
        personas.add(new Persona("Sandra", "sandra@es.es"));


        model.addAttribute("listaPersonas", personas);


        return "personas";




    }




}
