package binarios;

import binarios.objetosbinarios.EscrituraLecturaObjeto;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {


        // Lectura y escritura de binarios en crudo
        DatosCrudo datosCrudo = new DatosCrudo();
        //datosCrudo.writeAndRead();

        //Lectura y escritura de objetos binarios
        EscrituraLecturaObjeto escrituraLecturaObjeto = new EscrituraLecturaObjeto();
        escrituraLecturaObjeto.writeAndWrite();





    }
}
