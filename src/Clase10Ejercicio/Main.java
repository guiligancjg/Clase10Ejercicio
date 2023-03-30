package Clase10Ejercicio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //Lista Materias
        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Programación I",null));
        materias.add(new Materia("Bases de datos I",null));
        materias.add(new Materia("Programación II",new Materia("Programación I")));

        //Lista de Alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("José Rodríguez","1235",null));
        alumnos.add(new Alumno("Vanesa Sosa","1245",null));
        alumnos.add(new Alumno("Vanesa Sosa","1245",null));


        String archivo = "src/Clase10Ejercicio/inscripciones.csv";
        LeerArchivo arc = new LeerArchivo();

        int i = 0;
                for (String[] lista: arc.lineas(archivo)) {
                        if(lista[0].equals(alumnos.get(i).nombre)){
                            Inscripcion inscripcion = new Inscripcion(alumnos.get(i),materias.get(i), LocalDateTime.now());
                             if(inscripcion.aprobada() && alumnos.get(i).materiasAprobadas.size() == materias.get(i).correlativas.size()){
                                System.out.format("%-20s%-20s%-20s\n",lista[0],lista[1], "Aprobado");
                            }else{
                                System.out.format("%-20s%-20s%-20s\n",lista[0],lista[1], "Rechazado");
                            }
                            i++;
                        }else {
                            System.out.format("%-20s%-20s%-20s\n",lista[0], lista[1], "No existe el/la alumno/a");
                        }
                 }//cierre for i

    }
}
