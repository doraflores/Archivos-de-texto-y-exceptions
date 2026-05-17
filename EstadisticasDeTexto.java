package com.example.tareaarchivosdetextoyexceptions;

import java.io.*;
import java.util.HashMap;

public class EstadisticasDeTexto {
    public HashMap<String, Integer> analizarArchivo(File archivo){
        HashMap<String, Integer> conteo = new HashMap<>();
        conteo.put("lineas", 0);
        conteo.put("palabras", 0);
        conteo.put("caracteres", 0);

        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = reader.readLine()) != null){
                conteo.put("lineas", conteo.get("lineas") + 1);
                conteo.put("caracteres", conteo.get("caracteres") + linea.length());
                if(!linea.trim().isEmpty()){
                    int palabrasEnLinea = linea.trim().split("\\s+").length;
                    conteo.put("palabras", conteo.get("palabras") + palabrasEnLinea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al analizar archivo: " + e.getMessage());
        }
        return conteo;
    }
}
