package crearficherosydirectorios;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {


        // Crear fichero
        File file = new File("ejemplo.txt");

        file.createNewFile();

        // Crear carpeta
        File carpeta = new File("mi_carpeta");
        carpeta.mkdir();

        // Crear un fichero en una ruta absoluta ( la carpeta tiene que existir)
        File ficheroRutaAbsoluta = new File("C:\\carpeta\\ejemplo.txt");
        ficheroRutaAbsoluta.createNewFile();



        //Listar ficheros de un directorio
        String directorio = "C:\\carpeta";
        File rutaDirectorio = new File(directorio);
        String[] ficheros = rutaDirectorio.list();

        for(int i=0;i<ficheros.length; i++){
            //System.out.println(ficheros[i]);
        }

        //Verificar si un archivo existe
        File ficheroBuscado = new File("C:\\carpeta\\ejemplo.txt");

        if(ficheroBuscado.isFile())
            System.out.println("El fichero existe");
        else
            System.out.println("El fichero no existe");

        //Verificar si un directorio existe

        File path = new File("C:\\carpeta");

        if(path.isDirectory())
            System.out.println("El directorio existe");
        else
            System.out.println("El directorio no existe");


        // Crear directorios y ficheros dentro de directorios

        File carpetaUno = new File("carpetaUno");
        File carpetaDos = new File("carpetaDos");

        if(carpetaUno.mkdir()){
            System.out.println("Carpeta una creada");
        }
        if(carpetaDos.mkdir()){
            System.out.println("Carpeta dos creada");
        }

        System.out.println("");

        File ficheroUno = new File(carpetaUno, "fichero_uno.txt");
        File ficheroDos = new File(carpetaUno, "fichero_dos.txt");
        File ficheroTres = new File(carpetaDos, "fichero_tres.txt");
        File ficheroCuatro = new File(carpetaDos, "fichero_cuatro.txt");

        if(ficheroUno.createNewFile())
            System.out.println("Fichero uno creado en la carpeta " + '"'+ficheroUno.getParent()+'"');

        if(ficheroDos.createNewFile())
            System.out.println("Fichero dos creado en la carpeta " + '"'+ficheroDos.getParent()+'"');

        if(ficheroTres.createNewFile())
            System.out.println("Fichero tres creado en la carpeta " + '"'+ficheroTres.getParent()+'"');

        if(ficheroCuatro.createNewFile())
            System.out.println("Fichero cuatro creado en la carpeta " + '"'+ficheroCuatro.getParent()+'"');


    }
}
