package escribiryleerficheros;


import java.io.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        // Escribir ficheros
        File file = new File("mi_carpeta\\mi_fichero.txt");

        if(file.isFile()){

            try(FileWriter fw= new FileWriter(file, true)){

                fw.write("Escribiendo un texto" + "\r\n");
                //System.out.println("Fichero escrito con éxto");
                fw.close();

            }catch (Exception e){
                System.out.println("Error:"+e.getMessage());
            }

        }else{
            System.out.println("El fichero no existe");
        }

        //Leer ficheros

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = "";

        while( (line= br.readLine())!= null){
            //System.out.println(line);
        }

        //Escribir ficheros con Buffer
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una línea de texto");

        try( BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            bw.write(sc.nextLine());
            bw.close();
        }catch (IOException e){

        }


    }
}
