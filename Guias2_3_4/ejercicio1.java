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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // {
        // TODO code application logic here

        int num = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Numero PAR : ");
        } else {
            System.out.println("Numero IMPAR : ");
        }
    }
}

    
    

