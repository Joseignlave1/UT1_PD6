public class Main {
    public static void imprimirTablero(int largo, int ancho) {
        for(int i = 0; i < largo; i++) {
            for(int j = 0; j < ancho; j++) {
                System.out.print("#");
            }
            System.out.println(); //Cuándo es igual al ancho (termina de imprimir los caractéres), imprimo un salto de línea
        }
    }

    public static void main(String[] args) {
        imprimirTablero(7 , 7);
    }
}