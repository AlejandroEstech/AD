package com.agenda.agenda.controller;

import com.agenda.agenda.model.Contacto;
import com.agenda.agenda.service.ContactoService;
import com.agenda.agenda.service.UpdateService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @Autowired
    private UpdateService updateService;


    @PostMapping
    public ResponseEntity<Map<String,Object>>  save(@RequestBody Contacto contacto) {
        ResponseEntity<Map<String, Object>> response  =  contactoService.gurdarContacto(contacto);
        return response;
    }

    @GetMapping
    public ResponseEntity<Map<String,Object>> list(){
        ResponseEntity<Map<String,Object>> response = contactoService.listaContactos();
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> delete(@PathVariable Long id){
        Map<String,Object> mapa = new HashMap<>();
        ResponseEntity<Map<String,Object>> response = contactoService.eliminarContacto(id);
        return response;
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Map<String,Object>> show(@PathVariable String nombre){
        Map<String,Object> mapa = new HashMap<>();
        ResponseEntity<Map<String,Object>> response = contactoService.buscarPorNombre(nombre);
        return response;
    }

}
