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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

          Scanner leer = new Scanner(System.in);
        int opcion, num1, num2;

        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2= leer.nextInt();



        do {
            System.out.println("Menu");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.FINALIZAR");
            System.out.println("Elija opcion");

            opcion=leer.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println(num1+num2);
                break;

                case 2:
                    System.out.println(num1-num2);
                break;

                case 3:
                    System.out.println(num1*num2);
                break;

                case 4:
                    System.out.println(num1/num2);
                break;

                case 5:
                    System.out.println("¿Esta seguro que quiere salir del programa(S/N)?");
                    String opcion2 = leer.next();
                    if (opcion2.equalsIgnoreCase("S")){
                        break;
                    }
                    else {
                        opcion=0;
                    }
            }
        } while (opcion<5);

    }
}
