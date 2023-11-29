package com.agenda.agenda.service;

import com.agenda.agenda.model.Contacto;
import com.agenda.agenda.repository.ContactoRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {

    @Autowired
    private ContactoRepository contactoRepository;

    public Contacto updateContact(Contacto contacto, Long id){
        Contacto newContact = contactoRepository.findById(id).orElse(null);
        newContact.setNombre(contacto.getNombre());
        newContact.setApellido(contacto.getApellido());

        return newContact;
    }
}
