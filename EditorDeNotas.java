package com.example.tareaarchivosdetextoyexceptions;

import java.io.*;

/**
 * Esta clase permite abrir y guardar archivos de texto
 **/

public class EditorDeNotas {


    public String cargarArchivo(File archivo){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al leer archivo: " + e.getMessage());
        }
        return sb.toString();
    }

    public void guardarArchivo(File archivo, String contenidoDelArchivo){
        try(BufferedWriter  writer = new BufferedWriter(new FileWriter(archivo))){
            writer.write(contenidoDelArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar archivo: " + e.getMessage());
        }
    }
}
