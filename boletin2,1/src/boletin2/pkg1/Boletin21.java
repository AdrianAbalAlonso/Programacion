 
package boletin2.pkg1;

import java.util.Scanner;


public class Boletin21 {

    
    public static void main(String[] args) {
         float base = 2.0f ,altura =(float) 3.0 ;//esto es un cast
         float area= (base * altura) / 2 ;
         System.out.println("El area en el ejercicio 1 es :"+area);
         
    //ejercicio 1 b)
         float baseb,alturab;
         Scanner obx = new Scanner(System.in);
         System.out.println("teclea base :");
         baseb = obx.nextFloat();
         System.out.println("Teclea altura :");
         alturab=obx.nextFloat();
        System.out.println("El area pedida por teclado es igual a : "+ (baseb*alturab)/2);
         //Ejercicio 2 
         
         float lado = 2;
         float area2 = lado * lado ;
         System.out.println("El resultado del ejercicio 2 es :"+area2);
         
         //cambio
         
         
      
    }
    
}
