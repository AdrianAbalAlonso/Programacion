/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author aabalalonso
 */
public class Boletin2Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nominal , i ;
        float tiempo ;
        Scanner obx = new Scanner (System.in);
        System.out.println("Teclea el nominal");
        nominal= obx.nextFloat();
        System.out.println("Teclea i");
        i = obx.nextFloat();
        i=i/1200;
        System.out.println("Teclea los años");
        tiempo = obx.nextFloat();
        tiempo=tiempo*12;
        float rendatario1 = nominal * (float)Math.pow(1+i,tiempo)*i;
        rendatario1 = rendatario1 / (float)Math.pow(1+i,tiempo) - 1;
        System.out.println("La renta sería"+rendatario1);
        
    
    }
    
}
