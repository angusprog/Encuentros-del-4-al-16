/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su
respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario
ingresar su respuesta nuevamente. Para realizar este 
ejercicio investigue como utilizar la función Math.random() de Java
 */
package Guias2_3_4;

/**
 *
 * @author claud
 */
public class eje10Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
                  
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int i=num1*num2;
        
        
        System.out.println("adivina el número multiplo de dos num del 0 al 10");
        int num3 = leer.nextInt();   
        while (num3!=i){
            System.out.println("Segui participando e ingresa un nuevo número");
            num3 = leer.nextInt();
        }
        System.out.println("Adivinaste!!");
        System.out.println("el numero es:"+i);
    }
    
}
