import java.io.*;
import java.net.URL;

public class Ejercicio2 {
    public static void leerEntradaArchivo(String rutaArchivo) {
        FileReader fr;
        try {
            URL urlArchivo = Ejercicio2.class.getResource("Ejercicio2.txt"); //Obtengo la ruta
            System.out.println(urlArchivo);
            fr = new FileReader("src/Ejercicio2.txt");
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while(lineaActual != null) {
                System.out.println(lineaActual);
                lineaActual = br.readLine();
            }
            br.close(); // cierro el BufferedReader
        }
        catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo "+ "Ejercicio2.txt");
            e.printStackTrace();
        } catch (IOException e)
        {
            System.out.println("Error al leer el archivo "+"Ejercicio2.txt");
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
    }
    public static void main(String[] args) {
        leerEntradaArchivo("Ejercicio2.txt");
    }
}
