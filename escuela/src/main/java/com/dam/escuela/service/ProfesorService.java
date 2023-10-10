package com.dam.escuela.service;

import com.dam.escuela.model.Profesor;
import com.dam.escuela.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> listaProfesores(){
        return profesorRepository.findAll();
    }
    public Profesor buscarProfesorPorId(Long id){
        return profesorRepository.findById(id).orElse(null);
    }

    public void eliminarProfesor(Long id){
        profesorRepository.deleteById(id);
    }

    public void guardarProfesor(Profesor profesor){
        profesorRepository.save(profesor);
    }
}
