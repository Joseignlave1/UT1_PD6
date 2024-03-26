/*
    Condiciones:
   -Todos los elementos de los Arrays deben ser de tipo int
   -los Arrays deben tener la misma longitud(cantidad de elementos) para que así se puedan multiplicar

   Approach(versión1)

   La idea es realizar un "nested for loop", un for que itere sobre el primer array, y otro for que itere sobre el segundo array,
   vamos multiplicando solamente si la longitud de los dos arrays coinciden, y devolvemos el resultado en otro Array, por ejemplo.

   Este algoritmo tiene un Time Complexity de O(n^2) y space complexity de O(n)

   Approach:(versión2)- two pointers
   Tener 2 punteros que iteren en un while(solo deben iterar si la longitud de los dos arrays es igual(tienen la misma cantidad de elementos)
   ,un puntero que itere hasta que sea menor o igual a la longitud del primer array y
   otro puntero que itere hasta que sea menor o igual que la longitud del segundo array

   realizar la multiplicación de los elementos del puntero1 por los elementos del puntero 2

   Este algoritmo tiene un Time Complexity de O(n) y space complexity de O(n)

   Dejo la implementación de el segundo approach, ya qué me parece más eficiente e interesante.
 */
public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1 ,2 ,3 ,4};
        int[] secondArray = {2 ,3 ,4, 6};
        int pointerFirst = 0;
        int pointerSecond = 0;

        while(pointerFirst < firstArray.length && pointerSecond < secondArray.length && firstArray.length == secondArray.length) {
            System.out.println("("+ firstArray[pointerFirst] * secondArray[pointerSecond]  + ")");
            pointerFirst++;
            pointerSecond++;
        }
        if(firstArray.length != secondArray.length) {
            System.out.println("Los arrays deben ser de la misma longitud");
        } else {
            System.out.println("La multiplicación se puede hacer correctamente.");
        }
    }
}
