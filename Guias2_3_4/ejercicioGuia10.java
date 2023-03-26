/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Guias2_3_4;

import java.util.Scanner;

/**
 * @author claud
 */
public class ejercicioGuia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese 4 numeros del 1 al 20");
        for (int i = 0; i < 4; i++) {
            
            int num = leer.nextInt();
            if (num < 1 || num > 20) {
                System.out.println("El numero es invalido");
                break;
            } else;
             
        
                    System.out.print(num);
                    for (int k = 0; k < num; k++) {
                        System.out.print("*"); 
                       
                    }
                    System.out.println(" ");
                           

                }

            }
        }

   
