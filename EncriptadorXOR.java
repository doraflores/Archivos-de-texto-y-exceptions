package com.example.tareaarchivosdetextoyexceptions;

import java.io.File;
import java.io.*;

public class EncriptadorXOR {
    public static void encriptador(File archivoOrigen, File archivoDestino, int mascara){
        try(FileInputStream entrada = new FileInputStream(archivoOrigen);
            FileOutputStream salida = new FileOutputStream(archivoDestino)){

            int copia;
            while((copia = entrada.read()) != -1){
                salida.write(copia ^ mascara) ;
            }
            System.out.println("El archivo fue encriptado exitosamente en: " + archivoDestino.getAbsolutePath());
        } catch (IOException e){
            System.out.println("Error al encriptar el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        File archioOrigen = new File("ejemplo.txt");
        File archivoDestino = new File("ejemplo_encriptado.txt");
        encriptador(archioOrigen, archivoDestino, 0xFF);
    }
}
