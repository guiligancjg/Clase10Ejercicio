package Clase10Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    String nombre;
    List<Materia> correlativas = new ArrayList<>();


    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre, Materia correlativas) {
        this.nombre = nombre;
        if(correlativas != null){
            this.correlativas.add(correlativas);
        }
    }

    public boolean puedeCursar(Alumno alumno){
       return alumno.materiasAprobadas.size() == 0;
    }

}
