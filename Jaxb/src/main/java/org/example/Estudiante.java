package org.example;

public class Estudiante {

    private String nombre;
    private String nota;

    public Estudiante(){

    }

    public Estudiante(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
