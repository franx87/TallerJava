/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller01;

/**
 *
 * @author fgonzalez
 */
public class ForMejorado {
    public static void main(String[] args) {
        String [] paises = new String[10];
        paises[0] = "México";
        paises[1] = "España";
        paises[2] = "Colombia";
        paises[3] = "Argentina";
        paises[4] = "Estados Unidos";
        paises[5] = "Chile";
        paises[6] = "Rusia";
        paises[7] = "Coera del Norte";
        paises[8] = "Corea del Sur";
        paises[9] = "Canada";
        // paises[10] = "Alemania";
        
        for (String pais: paises){
            System.out.println("El pais es " + pais);
        }
        
    }
}
