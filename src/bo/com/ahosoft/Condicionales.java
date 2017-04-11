package bo.com.ahosoft;

import java.util.Scanner;

/**
 * Santa Cruz - Bolivia
 * curso-java
 * bo.com.ahosoft
 * 10/04/2017 - 10:20 PM
 * Created by: Arturo Herrera O.
 */
public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de propinas");
        System.out.println("Ingresa la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("Ingresa el % de propina");
        int porcentaje = entrada.nextInt();

        if(porcentaje < 15 ){
            System.out.println("El servicio no fue muy bueno");
        } else {
            System.out.println("El servicio fue bueno");
        }

        double total = cantidad * porcentaje /100;
        System.out.printf("El total es: %f", total+cantidad);

    }
}
