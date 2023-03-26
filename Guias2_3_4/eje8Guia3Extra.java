/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y
mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package Guias2_3_4;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje8Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i = 0;
        int p = 0;
        int k = 0;
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        i++;
        if (num % 2 == 0) {
            p++;
        } else {
            k++;
        }

        while (num % 5 == 0) {

            break;
        }
        System.out.println(" la cantidad de numeros leidos es: " + i);
        System.out.println(" la cantidad de numeros pares es: " + p);
        System.out.println(" la cantidad de numeros impares es: " + k);
    }
}
