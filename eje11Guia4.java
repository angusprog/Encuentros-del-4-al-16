
import java.util.Scanner;

/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
(incluyendo a las vocales acentuadas) se mantienen sin cambios.

 */
/**
 *
 * @author claud
 */
public class eje11Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        reemplazar(frase);

    }

    public static String reemplazar(String cadena) {

        int largo = cadena.length();

        for (int i = 0; i < largo; i++) {
            String letra = cadena.substring(i, i + 1);
            switch (letra) {
                case "a":
                    System.out.print("@");
                    break;
                case "e":
                    System.out.print("#");
                    break;
                case "i":
                    System.out.print("$");
                    break;
                case "o":
                    System.out.print("%");
                    break;
                case "u":
                    System.out.print("*");
                    break;

                default:
                    System.out.print(letra);
            }

        }

        return null;
    }
}
