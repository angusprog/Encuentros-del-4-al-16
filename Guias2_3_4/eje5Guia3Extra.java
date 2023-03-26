/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los
socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio

 */
package Guias2_3_4;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author claud
 */
public class eje5Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese clase de socio");
        String socio =(leer.nextLine());
        socio= toUpperCase(socio);
        System.out.println("Ingrese el valor del tratamiento");
        double trat = leer.nextDouble();
        switch (socio) {
            case "A":
                System.out.println( "El socio de clase A abonara el tratamiento con un 50% de descuento  $" + (trat*0.50));
         break;
         case "B":
                System.out.println( "El socio de clase B abonara el tratamiento con un 35% de descuento  $" + (trat*0.65));
         break;
         case "C":
                System.out.println( "El socio de clase A no tienen descuento en los tratamientos, abonara $ " + trat);
         break;
            default:
                System.out.println("No es una clase valida");
        }
        
        
        
    }
    
}
