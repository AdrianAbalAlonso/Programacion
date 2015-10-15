/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2boletin2conelevacióna2;

import java.util.Scanner;

/**
 *
 * @author aabalalonso
 */
public class Ejercicio2boletin2conelevacióna2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado;
        Scanner obx = new Scanner(System.in);
        System.out.println("Escribe el valor del lado");
        lado=obx.nextFloat();
        float operacion =(float)Math.pow(lado,2);
        System.out.println("El resultado es"+operacion);
    }
    
}
