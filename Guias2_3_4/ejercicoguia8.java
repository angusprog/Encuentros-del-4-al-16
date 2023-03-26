//Escriba un programa que valide si una nota está entre 0 y 10,
//sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
package Guias2_3_4;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class ejercicoguia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota del 1 al 10");
        nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("ingrese una nota entre 0 y 10");

            nota = leer.nextInt();

        }

        System.out.println("nota correcta");
    }

}
