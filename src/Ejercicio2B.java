import java.util.Scanner;

//Parte b
public class Ejercicio2B {

    public static void leerEntradaStdin() {
        //System.in representa la entrada estandar del sistema(la consola)
        Scanner scanner = new Scanner(System.in); //Leo los datos por consola con objeto de la clase Scanner
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * (radio * radio);
        double perimetro = 2 * pi * radio;
        System.out.println("El área de la circunferencia es" +  " " +area);
        System.out.println("El perímetro de la circunferencia es" + " " + perimetro);
    }
    public static void main(String[] args)  {
        leerEntradaStdin();
    }

}
