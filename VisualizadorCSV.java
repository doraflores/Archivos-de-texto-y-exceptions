package com.example.tareaarchivosdetextoyexceptions;

import java.io.*;
import java.util.ArrayList;

public class VisualizadorCSV {
    public ArrayList<String[]> leerCSV(File archivo){
        ArrayList<String[]> filas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null){
                String[] campos = linea.split(",");
                filas.add(campos);
            }
        } catch (IOException e) {
            System.err.println("Error al leer CSV: " + e.getMessage());
        }
        return filas;
    }

}
