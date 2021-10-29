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
public class SwitchCondicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Ingresa un numero entre 1, 2, 7 y 11");
        a = sc.nextInt();
        
        switch (a) {
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 7:
                System.out.println("Estas en el caso 7 y la variable es " + a);
                break;
            case 11:
                System.out.println("El numero es 11");
                break;
            default:
                System.out.println("Sin coincidencia");
                break;

        }
    }

}
