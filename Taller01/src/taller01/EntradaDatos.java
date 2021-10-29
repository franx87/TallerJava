/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller01;

import java.util.Scanner;


/**
 *
 * @author grissel
 */
public class EntradaDatos {
    public static void main(String [] args){
        Scanner MiEntradaDatos = new Scanner(System.in);
        /*
        int numeroTacos;
        int precioTacos = 7;
        
        System.out.println("¿Cuantos tacos va a pagar?:");
        
        numeroTacos = MiEntradaDatos.nextInt();
        
        int res = numeroTacos * precioTacos;
        
        System.out.println("Tu cuenta es: $" + res);
        */
        System.out.println("¿Cual es tu edad?:");
        
        int edad;
        
        edad  = MiEntradaDatos.nextInt();
        
        System.out.println("Tu edad en 5 años será: " + (edad + 5));
        
    }
}
