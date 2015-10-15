
package boletin2ejercicios3y4;

import java.util.Scanner;


public class Boletin2ejercicios3y4 {

    
    public static void main(String[] args) {
        System.out.println("EJERCICIO 3");
        float cambio = 1.1170f ;
         float eurosUsuario ;
         Scanner obx = new Scanner (System.in);
         System.out.println("teclea eurosUsuario :");
         eurosUsuario = obx.nextFloat();
         System.out.println("El cambio sería : "+eurosUsuario*cambio +"$");
   
    
    System.out.println("EJERCICIO 4");
    //Ejercicio 4
         float numero1 , numero2 , suma , resta , division , multiplicacion ;
         System.out.println("Teclee el primer numero :");
         
         numero1 = obx.nextFloat();
         System.out.println("Tecle el segundo numero :");
         numero2 = obx.nextFloat();
         System.out.println("suma= "+(numero1+numero2)+" resta : "+(numero1-numero2)+" division :"+(numero1/numero2)+" multiplicacion :"+(numero1*numero2));
    
    
    
    
    
    
    
    }
    
}
