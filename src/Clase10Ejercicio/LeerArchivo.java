package Clase10Ejercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo{
    private String[] listaItem;
    private List<String[]> lista;

    public LeerArchivo(){}

    public List<String[]> lineas(String archivo){
        lista = new ArrayList<String[]>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();

            while(lectura != null){
                this.lista.add(lectura.split(";"));
                lectura = entrada.readLine();
            }

            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo leer el Archivo...");
        } catch (IOException e) {
            System.out.println("No se pudo leer el Archivo...");
        }
        return lista;
    }
}
