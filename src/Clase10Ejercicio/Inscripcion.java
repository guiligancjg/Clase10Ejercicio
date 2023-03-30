package Clase10Ejercicio;

import java.time.LocalDateTime;

public class Inscripcion{
    Alumno alumno;
    Materia materia;
    LocalDateTime fecha;

    public Inscripcion(Alumno alumno, Materia materia, LocalDateTime fecha) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = fecha;
    }

    public boolean aprobada(){
        return materia.puedeCursar(alumno);
    }
}
