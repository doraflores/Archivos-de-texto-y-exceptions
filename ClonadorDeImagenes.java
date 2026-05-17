package com.example.tareaarchivosdetextoyexceptions;

import java.io.*;

public class ClonadorDeImagenes {
    public static void clonador(File archivoOrigen, File archivoDestino){
        try(FileInputStream entrada = new FileInputStream(archivoOrigen);
        FileOutputStream salida = new FileOutputStream(archivoDestino)){

            int copia;
            while((copia = entrada.read()) != -1){
                salida.write(copia);
            }
            System.out.println("La imagen fue clonada exitosamente en: " + archivoDestino.getAbsolutePath());
        } catch (IOException e){
            System.out.println("Error al clonar la imagen " + e.getMessage());
        }
    }

    public static void main(String[] args){
        File archivoOrigen = new File("entrada.jgp");
        File archivoDestino = new File("copia_entrada.jpg");
        clonador(archivoOrigen, archivoDestino);
    }
}
