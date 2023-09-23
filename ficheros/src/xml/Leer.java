package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Leer {

    public  void read() throws ParserConfigurationException, IOException, SAXException, InterruptedException {

        //Crear un objeto documento que represente el árbol DOM
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Indicar al objeto documento que fichero tiene que transformar a un objeto Java
        Document document = builder.parse("fabrica.xml");

        // Obtener el elemento raíz del documento
        Element fabricaElement = (Element) document.getElementsByTagName("fabrica").item(0);

        // Obtener el atributo "código" de la fábrica
        String codigoFabrica= fabricaElement.getAttribute("código");

        System.out.println("CÓDIGO DE LA FÁBRCA:"+ codigoFabrica);

        //Obtener todos los empleados del documento
        NodeList empleados = document.getElementsByTagName("empleado");

        System.out.println("");

        //Iterar sobre los empleados
        for(int i=0;i<empleados.getLength();i++){

            // Obtengo todos los nodos hijo de empleado
            Element empleadoElement = (Element) empleados.item(i);

            // Obtento los textos que van en el nodo "id"
            String id = empleadoElement.getElementsByTagName("id").item(0).getTextContent();
            // Obtento los textos que van en el nodo "nombre"
            String nombre = empleadoElement.getElementsByTagName("nombre").item(0).getTextContent();
            // Obtento los textos que van en el nodo "email"
            String email = empleadoElement.getElementsByTagName("email").item(0).getTextContent();

            System.out.println("... Procesando datos");
            Thread.sleep(2000);

            System.out.println("");

            //Imprimo por consola los datos del xml
            System.out.println("Empleado"+(i+1));

            System.out.println("ID:"+ id);
            System.out.println("Nombre:"+ nombre);
            System.out.println("Email:"+ email);

            System.out.println("");

        }

    }
}
