import java.io.*;
import java.net.URL;

public class Main {
    public static void transformarT9Texto(String rutaArchivo) {

        try(FileWriter fw = new FileWriter("salida.txt");
            BufferedWriter bf = new BufferedWriter(fw);
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr)) {
            String lineaActual;
            while((lineaActual = br.readLine()) != null) {
                lineaActual = lineaActual.toUpperCase();
                char[] charactersArray = lineaActual.toCharArray();
                for(int i = charactersArray.length -1; i >= 0; i--) { //i empíeza a iterar desde el último caractér del array y va decreciendo(moviendose a la izquierda)
                    int indiceT9 = obtenerIndiceT9(charactersArray[i]);
                    String escribirIndiceEnArchivo = String.valueOf(indiceT9);
                    bf.write(escribirIndiceEnArchivo);
                }
                bf.newLine();
            }
            System.out.println("Conversión a T9 exitosa");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Archivo leído correctamente");
    }
    public static int obtenerIndiceT9(char letra) {
        return switch (letra) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            case ' ' -> 0;
            case '.' -> 1;
            default -> -1; // Caracter no válido
        };
    }
    public static void main(String[] args) {
        transformarT9Texto("/C:/Users/Leo84/IdeaProjects/Ejercicio3B/out/production/Ejercicio3B/entrada.txt");
    }
}
