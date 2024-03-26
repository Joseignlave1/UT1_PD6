import java.io.*;

//Parte a
public class Main {

    public static void transformarT9Texto(String rutaArchivo) {
        try( FileWriter fw = new FileWriter("salida.txt");
             BufferedWriter bf = new BufferedWriter(fw);
             FileReader fr = new FileReader(rutaArchivo);
             BufferedReader br = new BufferedReader(fr)) {
             String lineaActual;
            while((lineaActual = br.readLine()) != null) {
                lineaActual = lineaActual.toUpperCase();
                for(char c : lineaActual.toCharArray()) {
                    int indiceT9 = obtenerIndiceT9(c);
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
        transformarT9Texto("/C:/Users/Leo84/IdeaProjects/Ejercicio3/out/production/Ejercicio3/entrada.txt");
    }
}


    //Funcionamiento de índiceT9
    /*
        int indiceT9 = (c - 'A') / 3 + 2;
        restamos el valor ASCII de letra por el valor ASCII de A, esto nos da un valor númerico
        que representa la posición relativa de la letra en el alfabeto, Ejemplo, si es C = 2
        ya qué A B C, posiciónes 0  1 y 2(C).
        Después dividimos por 3, ya qué en el teclado T9 las letras están agrupadas en bloques de 3.

        Agregamos 2, esto es porqué en T9 el bloque que empieza con A es el bloque 2, el bloque que empieza con D es el bloque 3.

        Al final decidí usar switch/case, ya qué este método me daba problema a la hora de realizar la conversión de bloques de 4 letras.

     */
