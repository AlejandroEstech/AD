package com.estech.springiniciacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DevolverJsonController {

    @GetMapping("/get-json")
    public Map<String, String> getEmployees(){

        Map<String,String> mapa = new HashMap<>();

        mapa.put("Nombre" , "Pedro");
        mapa.put("Email" , "pedro@es.es");

        return mapa;
    }


}
