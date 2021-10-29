/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller01;

import java.util.Scanner;

/**
 *
 * @author fgonzalez
 */
public class BucleWhile {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Ingresa un numero menor de 20: ");
        a = sc.nextInt();
        */
        int a = leerNumero("Ingresa un numero menor de 20: ");
        while (a <= 20){
            System.out.println("El numero actual es " + a);
            a++;
        }
    }
    
    public static int leerNumero(String mensaje) {
        System.out.println(mensaje);
        return leerNumero();
    }
    
    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
}
