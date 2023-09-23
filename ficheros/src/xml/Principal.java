package xml;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException, SAXException, InterruptedException {

        List<Empleado> empledaos = new ArrayList<>();
        empledaos.add(new Empleado(1, "Laura", "laura@es.es"));
        empledaos.add(new Empleado(2, "Paco", "paco@es.es"));
        empledaos.add(new Empleado(3, "Sandra", "sandra@es.es"));


        // Creación del xml
        Crear crear = new Crear();
       //crear.createXml(empledaos);



        // ===========================================================================================


        // Lectura del xml
        Leer leer = new Leer();
        leer.read();

    }
}
