package binarios.objetosbinarios;

import java.io.*;

public class EscrituraLecturaObjeto {

    public void writeAndWrite() throws IOException, InterruptedException {

        //Escritura

        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("binarios\\personas.bin"));

        oos.writeObject(new Persona("Pepe", "pepe@es.es"));
        oos.writeObject(new Persona("Luis", "luis@es.es"));
        oos.writeObject(new Persona("Marta","pepe@es.es"));

        System.out.println("Objeto añadido al binario");

        oos.close();


        //Lectura

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("binarios\\personas.bin"));

        System.out.println("");

        Thread.sleep(1000);

        System.out.println("Datos del binario");
        Thread.sleep(1000);

        System.out.println("...Procesando datos");
        Thread.sleep(1000);

        System.out.println("...Procesando datos");
        Thread.sleep(1000);

        System.out.println("...Procesando datos");
        Thread.sleep(1000);

        System.out.println("");

        try{
            while(true){
                Persona persona = (Persona) ois.readObject();
                System.out.println(persona.getNombre() +" -  email:"+persona.getEmail());
            }
        }catch (Exception e){
            return;
        }




    }
}
