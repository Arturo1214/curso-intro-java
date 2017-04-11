package bo.com.ahosoft;

import java.util.Scanner;

/**
 * Santa Cruz - Bolivia
 * curso-java
 * bo.com.ahosoft
 * 10/04/2017 - 10:06 PM
 * Created by: Arturo Herrera O.
 */
public class Ciclos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres procesar?");

        int cantidad = entrada.nextInt();

        System.out.printf("Ingresa %d datos\n", cantidad);

        for (int i =1 ; i <= cantidad; i++){
            System.out.printf("Dato %d: ", i);

            int num = entrada.nextInt();

            int resultado = num * 2;

            System.out.printf("Dato %d procesado: %d\n", i, resultado);
        }
    }
}
