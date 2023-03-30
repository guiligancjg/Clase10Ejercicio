package Clase10Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    String nombre;
    String legajo;
    List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String nombre, String legajo, Materia materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        if(materiasAprobadas != null){
            this.materiasAprobadas.add(materiasAprobadas);
        }
    }
}
