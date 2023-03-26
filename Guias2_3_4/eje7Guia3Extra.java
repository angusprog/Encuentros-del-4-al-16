package Guias2_3_4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package encuentro4al6;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje7Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println ( "Ingrese la cantidad de numeros que se solicitaran" );
        int  n = leer.nextInt();

        int  valorMaximo = 0 , valorMinimo = 0 , contador = 0 ;
        double  promedio = 0 ;
         int num;
        while ( contador < n ) {
            System.out.println("Ingrese un numero" );
            num = leer . nextInt ();
            if ( contador == 0 ) {
                valorMaximo = num ;
                valorMinimo = num ;
            }
            if ( valorMaximo < num ) {
                valorMaximo = num ;
            } else  if ( valorMinimo > num ) {
                valorMinimo = num ;
            }
            promedio += num ;
            contador ++;
        }
       promedio /= n ;
        System.out.println( "El número más grande es: " + valorMaximo );
        System.out.println( "El numero mas chico es: " + valorMinimo );
        System.out.println( "El promedio de los numeros es: " + promedio );
    }
}