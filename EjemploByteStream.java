import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploByteStream {
    public static void main (String[] args){
        // copiar una imagen o archivo binario byte a byte
        try(FileInputStream in = new FileInputStream("entrada.jpg");
        FileOutputStream out = new FileOutputStream("copia_entrada.jpg")){

            int c;
            // Lee byte por byte(valor de 0 a 255)
            while((c = in.read()) != -1){
                out.write(c);
            }
            System.out.println("Archivo de bytes copiado con exito");
        }catch(IOException e){
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}
