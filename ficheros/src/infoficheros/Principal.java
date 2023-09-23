package infoficheros;

import java.io.File;

public class Principal {

    public static void main(String[] args) {

        //Extraer información del fichero

        File file = new File("C:\\carpeta\\ejemplo.txt");

        if(file.isFile()){

            //Nombre del fichero
            System.out.println("Nombre: "+file.getName());

            //Ruta del fichero
            System.out.println("ruta: "+file.getAbsolutePath());

            //Comprobar si el archivo tiene permisos de lectura
            System.out.print("Permisos de lectura ? ");


        /*
               if(file.canRead())
                    System.out.println("si");
               else
                    System.out.println("no");
        */

            String canRead = file.canRead() ? "si" : "no";
            System.out.println(canRead);

            // Comprobar se el archivo tiene permisos de escritura
            System.out.print("Permisos de escritura ? ");
            String canWrite = file.canWrite() ? "si" : "no";
            System.out.println(canWrite);

            // Comprobar se el archivo tiene permisos de ejecución
            System.out.print("Permisos de ejecución ? ");
            String canExecute = file.canExecute()? "si" : "no";
            System.out.println(canExecute);

            // Ver el nombre del directorio padre
            System.out.println("Directorio padre: " + file.getParent());
        }else {
            System.out.println("El archivo no existe");

        }
















    }
}
