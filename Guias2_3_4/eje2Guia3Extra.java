/*
 * 
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: 
B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

 */
package Guias2_3_4;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje2Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 4 numeros enteros");
        int A = leer.nextInt(), B = leer.nextInt(), C = leer.nextInt(), D = leer.nextInt(), aux;
        aux = A;
        System.out.println(" El valor de A es:" + A);
        A = D;
        System.out.println(" El valor de D es:" + D);
        D = B;
        System.out.println(" El valor de B es:" + B);
        B = C;
        System.out.println(" El valor de C es:" + C);
        C = aux;
        System.out.println(" El valor actual de A es:" + A);
        System.out.println(" El valor actual de B es:" + B);
        System.out.println(" El valor actual de C es:" + C);
        System.out.println(" El valor actual de D es:" + D);
    }

}
