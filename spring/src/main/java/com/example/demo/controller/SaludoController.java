package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SaludoController {

    @GetMapping("/rest")
    public Map<String,String> home(){

        Map<String,String> persona = new HashMap<>();

        persona.put("nombre" , "Pepe");
        persona.put("email" , "pepe@es.es");
        persona.put("telefono" , "987766554");


        return persona;
    }
}
