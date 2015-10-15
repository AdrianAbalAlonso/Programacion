
package boletin.pkg2.ejercicio.pkg10;

import java.util.Scanner;


public class Boletin2Ejercicio10 {

    
    public static void main(String[] args) {
        int eurosUsuario ;
        Scanner obx = new Scanner (System.in);
        System.out.println("Introduce la cantidad de euros que tienes ");
        eurosUsuario = obx.nextInt();
        int primerdesglose = eurosUsuario/100 ;
        int segundodesglose = (eurosUsuario%100)/20 ;
        int tercerdesglose = (eurosUsuario%20)/5;
        int cuartodesglose = (eurosUsuario%5);
        System.out.println("El desglose quedaría d ela siguiente manera :"
                +primerdesglose+ "billetes de 100 "
                +segundodesglose+ "billetes de 20  "
                +tercerdesglose+ "billetes de 5 euros "
                +cuartodesglose+ "monedas de 1 euro");
         }
    
}
