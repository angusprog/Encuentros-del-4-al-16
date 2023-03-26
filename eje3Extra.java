
import java.util.Scanner;

/*
 *Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
/**
 *
 * @author claud
 */
public class eje3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una cantidad en Euro");
        double num1 = leer.nextDouble();

        calcular(num1);

    }

    public static void calcular(double n1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elija una moneda a convertir");
        System.out.println("Ingresar opcion de 1 a 4:\n"
                + "1. dolar\n"
                + "2. yen\n"
                + "3. pesos\n"
                + "4. libras");
        int fun = leer.nextInt();

        switch (fun) {
            case 1:
                double suma = (n1 * 1.2);
                System.out.println(suma);
                break;
            case 2:
                double resta = (n1 * 0.8);
                System.out.println("resta");

                break;
            case 3:
                double mult = (n1 * 2.2);
                System.out.println("mult");
                break;
            case 4:
                double div = (1 * 3.2);
                break;
            default:
                System.out.println("moneda elegida incorrecta");

        }

    }
}



