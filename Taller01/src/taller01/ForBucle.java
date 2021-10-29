/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller01;

/**
 *
 * @author fgonzalez
 */
public class ForBucle {
    public static void main(String[] args) {
        int a = BucleWhile.leerNumero("Estasblezca el tamaño del bucle For: ");
        
        for (int i = 0; i <= a; i++){
            System.out.println("El numero es " + i);
        }
        
        int [] miMatriz = {15,23,568,9,1,12,45,82,15,135,515,48,5,1,2,85,1,16,16,1,8};
        
        for (int j = 0; j < miMatriz.length; j++){
            System.out.println("valor (" + j + ") = " + miMatriz[j]);
        }
    }
    
}
