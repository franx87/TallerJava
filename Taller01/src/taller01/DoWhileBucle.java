/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller01;

/**
 *
 * @author fgonzalez
 */
public class DoWhileBucle {
    
    public static void main(String[] args) {
        //int valor = 21;
        
        int valor = BucleWhile.leerNumero("Introduzca un numero");
        
        do{
            System.out.println("El numero actual es " + valor);
            valor++;
        }while(valor < 15);
    }
    
}
