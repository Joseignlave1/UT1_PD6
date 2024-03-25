
import java.io.*;
import java.net.URL;

//Parte a)
public class Ejercicio2 {
    public static void leerEntradaArchivo(String rutaArchivo) {
        FileReader fr;

        try {
            URL urlArchivo = Ejercicio2.class.getResource("Ejercicio2.txt"); //Obtengo la ruta
            System.out.println(urlArchivo);
            fr = new FileReader("src/Ejercicio2.txt");
            BufferedReader br = new BufferedReader(fr);
            String lineaEntero = br.readLine();
            String lineaPuntoFlotante = br.readLine();
            String lineaCadena = br.readLine();
            int enteroEnArchivo = Integer.parseInt(lineaEntero);
            double puntoFlotantEnArchivo = Double.parseDouble(lineaPuntoFlotante);
            double suma = enteroEnArchivo + puntoFlotantEnArchivo;
            int divisionEntera = (int) puntoFlotantEnArchivo / enteroEnArchivo;
            double restoDecimal = puntoFlotantEnArchivo - ((int) (puntoFlotantEnArchivo / enteroEnArchivo) * enteroEnArchivo);
            System.out.println("El entero leído es:" + " " +  enteroEnArchivo);
            System.out.println("El número de punto flotante leído es:" + " " +  puntoFlotantEnArchivo);
            System.out.println("La cadena leída es:" + " " +  lineaCadena);
            System.out.println("¡Hola Peter! La suma de " + enteroEnArchivo + " y " + puntoFlotantEnArchivo + " es " + suma);
            System.out.println("La división entera de " + puntoFlotantEnArchivo + " " +  "y" + " " + enteroEnArchivo + " es" + " " +  divisionEntera + " " +  "y su resto es" + " " +  restoDecimal);

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
