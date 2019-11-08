/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodevlights;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class principal {
    
    public static void leerString(String s){
            char[]arreglo = s.toCharArray();
            for(int i=0; i< arreglo.length; i++){
                char v = arreglo[i];
                System.out.println(v);
            }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String s = leer.next();
        leerString(s);
	}
}