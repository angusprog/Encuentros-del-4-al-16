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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        int limite = 0, num = 0, suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el limite superior : ");
        limite = leer.nextInt();

        do {
            System.out.println("Ingrese los numeros a sumar ");
            num = leer.nextInt();
            suma = suma + num;
        } while (limite >= suma);
        System.out.println("El limite es " + limite + " La suma de los numeros ingresados es : " + suma);
        System.out.println("suma = " + suma);

        //Atajo1  soutv + Tab --> System.out.println("suma = " + suma);
        //atajo2  sout + Tab --> System.out.println("");
    }
}
    }
    

