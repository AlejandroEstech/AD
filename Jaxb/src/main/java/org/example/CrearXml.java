package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CrearXml {

    public void crear() throws JAXBException {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pedro", "7.2"));
        estudiantes.add(new Estudiante("Luisa", "9.4"));
        estudiantes.add(new Estudiante("Pedro", "7.2"));


        Escuela escuela = new Escuela();
        escuela.setCode(3223231);
        escuela.setEstudiantes(estudiantes);

        JAXBContext context = JAXBContext.newInstance(Escuela.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT , true);
        marshaller.marshal(escuela, new File("escuela.xml"));



    }
}
