/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8.boletin.pkg2;

import java.util.Scanner;


public class Ejercicio8Boletin2 {

    
    public static void main(String[] args) {
        float centigrados ;
        float Fahrenheit ;
        Scanner obx = new Scanner(System.in);
        System.out.println("Escribe los grados centígrados");
        centigrados=obx.nextFloat();
        float Kelvin = centigrados + 273 ;
        Fahrenheit = centigrados * (float)(32 + 1.8);
        System.out.println("CentÍgrados son "+Kelvin+" y Kelvin serÍan Kelvin "+Fahrenheit+"Farenheir");
        
       
    }
    
}
