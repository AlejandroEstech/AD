package org.example;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Escuela {

    private List<Estudiante> estudiantes = new ArrayList<>();
    private int code;

    public Escuela(){

    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @XmlElement(name = "estudiante")
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getCode() {
        return code;
    }

    @XmlAttribute
    public void setCode(int code) {
        this.code = code;
    }
}
