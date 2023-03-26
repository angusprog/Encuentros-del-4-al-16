/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guias2_3_4;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            String frase = "";
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una frase : ");
            frase = leer.next();
            frase = frase.toUpperCase();
            frase = frase.substring(0, 1);
            System.out.println(frase);
            if (frase.substring(0, 1).equals("A")) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        }
    }
}
