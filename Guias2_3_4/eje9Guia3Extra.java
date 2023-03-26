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
public class eje9Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double num1,num2,i;           
    i=0;      
    System.out.println("ingresar numero a dividendo y divisor");
    num1 = leer.nextDouble();
    num2 = leer.nextDouble();    
      while(num1>=0){         
         num1=num1-num2;
         i=i+1;}
      System.out.println("El cociente es; "+ (i-1));
      System.out.println("El resto es:" + (num1+num2));
    }
    
}
