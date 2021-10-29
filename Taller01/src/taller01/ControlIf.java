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
public class ControlIf {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int datoUsuario;
        
        System.out.println("Ingresa un numero");
        
        datoUsuario = sc.nextInt();
        
        if (datoUsuario < 10) {
            System.out.println("Tu numero es menor que 10 y es " + datoUsuario);
        }else{
            System.out.println("Tu numero es mayor que 10 y es " + datoUsuario);
        }
        
        int a = 10, b = 10, c = 5, d = 6;
        if (a == b || b < d){
            System.out.println("Es True");
        }else{
            System.out.println("Es False");
        }
        
        
    }
    
}
