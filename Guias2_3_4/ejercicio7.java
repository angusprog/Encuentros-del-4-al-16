package Guias2_3_4;


import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 */
/*package encuentro4al6;

import java.util.Scanner;

/* @author claud
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int i = 0;
        int j = 0;
        do {
            System.out.println("Ingrese una palabra o frase de 5 caracteres que comience con X termine con O");
            palabra = leer.nextLine();
            if ((palabra.length() == 5) && (palabra.substring(0, 1).equalsIgnoreCase("x")) && (palabra.substring(palabra.length() - 1, palabra.length()).equalsIgnoreCase("o"))) {
                System.out.println("Usted ha ingresado una palabra o frase correcta");
                i++;
            } else {
                j++;
            }
        } while (!palabra.equals("&&&&&"));
        System.out.println("Las cantidades correctas son: " + i + " las cantidades incorrectas son: " + j);
    }

}
