package org.example;

import jakarta.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws JAXBException {


        CrearXml crearXml = new CrearXml();
        //crearXml.crear();

        LeerXml leerXml = new LeerXml();
        leerXml.leer();

    }
}