package Guias2_3_4;


import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a 
cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

package encuentro4al6;

/**
 *
 * @author claud
 */
public class ejercicioguia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, suma, j;
        suma = 0;
        j = 0;

        do {

            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            }

            j++;
            System.out.println(j);
            if (num == 0) {
                System.out.println(" se capturo el numero 0 ");
                break;
            }

        } while (j < 4);

        System.out.println("la suma de los " + j + " numeros es = " + suma);

    }

}
