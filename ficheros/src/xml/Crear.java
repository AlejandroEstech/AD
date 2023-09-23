package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Crear {

    public void createXml(List<Empleado> empleados) throws ParserConfigurationException, IOException, TransformerException {

        // Ojo !! con las importaciones, importamtos de org.w3c.dom

        // Creo el objeto documento que va a contener el árbol DOM
        Document document;

        // Creo los builderes para construir el documento
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Asocio los buiders con el documento
        document = builder.newDocument();

        // Creo el elemento (nodo) raíz del documento
        Element fabrica= document.createElement("fabrica");

        fabrica.setAttribute("código", "567");

        // Agrego el elemento raíz al documento
        document.appendChild(fabrica);

        // Itero los empleados
        for(Empleado e: empleados){
            // Creo el elemento(nodo) empleado
            Element empleado = document.createElement("empleado");
            // Agrego el empleado a la fábrica
            fabrica.appendChild(empleado);

            // Creo el elemento(nodo) id
            Element id = document.createElement("id");
            // Creo el contenido que está dentro de la etiqueta id
            id.appendChild(document.createTextNode(""+e.getId()));

            // Creo el elemento(nodo) nombre
            Element nombre = document.createElement("nombre");
            // Creo el contenido que está dentro de la etiqueta nombre
            nombre.appendChild(document.createTextNode(""+e.getNombre()));

            // Creo el elemento(nodo) email
            Element email = document.createElement("email");
            // Creo el contenido que está dentro de la etiqueta email
            email.appendChild(document.createTextNode(""+e.getEmail()));

            // Agrego id, nombre y email al empleado
            empleado.appendChild(id);
            empleado.appendChild(nombre);
            empleado.appendChild(email);
        }
        createFile(document);
    }

    public void createFile(Document document) throws TransformerException, IOException {

        // Creo los transformers para transformar el documento lógico a uno físico
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // Indico cuál es el origen de los datos
        Source source = new DOMSource(document);

        // Creo un objeto de tipo file para indicar cuál es el nombre del fichero
        File file= new File("fabrica.xml");

        // Escribo en el archivo
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);


        // Creo un objeto de tipo Result donde almaceno los bytes que voy a escribir
        Result datosParaEscribir = new StreamResult(pw);

        // Escribo en el fichero a partir del árbol DOM del documento
        transformer.transform(source, datosParaEscribir);

        System.out.println("Fichero xml creado !!");
    }


}
