package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class LeerXml {

    public void leer() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Escuela.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Escuela escuela = (Escuela) unmarshaller.unmarshal(new File("escuela.xml"));

        System.out.println("Código escuela:" + escuela.getCode());

        System.out.println("Notas estudiantes");

        for(Estudiante estudiante: escuela.getEstudiantes()){
            System.out.println(estudiante.getNombre()+":"+ estudiante.getNota());
        }

    }



}
