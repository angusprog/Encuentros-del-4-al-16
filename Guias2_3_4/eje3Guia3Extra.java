/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Guias2_3_4;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 * @author claud
 */
public class eje3Guia3Extra {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una letra ");
        String letra = (leer.nextLine());
        letra=toLowerCase(letra);

        if (letra.equals("a")) {
            System.out.println("La letra ingresada es una vocal");

        } else if (letra.equals("e")) {
            System.out.println(" La letra ingresada es una vocal");

        } else if (letra.equals("i")) {
            System.out.println(" La letra ingresada es una vocal");
        } else if (letra.equals("o")) {
            System.out.println(" La letra ingresada es una vocal");
        } else if (letra.equals("u")) {
            System.out.println(" La letra ingresada es una vocal");
        } else {
           System.out.println("La letra ingresada es una consonante");
        }
    }
}