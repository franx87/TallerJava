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
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Ingresa un numero");
        a = sc.nextInt();
        
        int residuo = a % 2;  // formula modulo
        
        if (residuo == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
