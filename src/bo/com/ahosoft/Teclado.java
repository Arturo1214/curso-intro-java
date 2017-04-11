package bo.com.ahosoft;

import java.util.Scanner;

/**
 * Santa Cruz - Bolivia
 * curso-java
 * bo.com.ahosoft
 * 10/04/2017 - 09:55 PM
 * Created by: Arturo Herrera O.
 */
public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");

        String nombre = entrada.nextLine();

        System.out.println("Tu nombre es: " + nombre);

        System.out.printf("Cual es tu edad?");

        int edad = entrada.nextInt();

        System.out.println("Tu edad es: " + edad);
    }
}
