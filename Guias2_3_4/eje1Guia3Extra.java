/*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.
/*
 */
package Guias2_3_4;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje1Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int tiempo = leer.nextInt();
        int dias = tiempo / 1440;
        if (tiempo % 1440 == 0) {
            System.out.println(tiempo + "minutos son " + dias + " dias");
        } else {
            int resto = tiempo % 1440;
            int horas = resto / 60;
            if (resto % 60 == 0) {

                System.out.println(tiempo + "minutos son " + dias + " dias" + horas + "horas");

            } else {
                int min = resto / 60;
                System.out.println(tiempo + " minutos son " + dias + " dias " + horas + " horas y " + min + " mintos ");

            }
        }
    }

}
