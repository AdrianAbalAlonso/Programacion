
package boletin.pkg2.ejercicio.pkg9;

import java.util.Scanner;


public class Boletin2Ejercicio9 {

    
    public static void main(String[] args) {
        float billetesde100 ;
        float billetesde20 ;
        float billetesde5 ;
        float monedasde1euro ;
        Scanner obx = new Scanner (System.in);
        System.out.println("Escribe los billetes de 100 que tienes");
        billetesde100 = obx.nextFloat();
        System.out.println("Escribe los billetes de 20 que tienes");
        billetesde20 = obx.nextFloat();
        System.out.println("Escribe los billetes de 5 euros que tienes");
        billetesde5 = obx.nextFloat();
        System.out.println("Escribe las monedas de 1 euro que tienes");
        monedasde1euro = obx.nextFloat();
        billetesde100 = billetesde100 * 100 ;
        billetesde20 = billetesde20 * 20 ;
        billetesde5 = billetesde5 * 5 ;
        monedasde1euro = monedasde1euro * 1 ;
        float operacion = billetesde100+billetesde20+billetesde5+monedasde1euro;
        System.out.println("El total serian :"+operacion+"euros");
        
    }
    
}
