/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodevlights;

import java.util.Scanner;

/**
 * openjdk version "1.8.0_232"
 * OpenJDK Runtime Environment Corretto-8.232.09.1 (build 1.8.0_232-b09)
 * OpenJDK 64-Bit Server VM Corretto-8.232.09.1 (build 25.232-b09, mixed mode)
 * NetBeans IDE 8.2
 * @author erick
 */
public class principal {
    
     
     /*Algoritmo de calculo*/
    public static int obtenerValor(String str){
            char[]arreglo = str.toCharArray(); 
            int longitud = arreglo.length;
            int coincidencias = longitud;
            for(int i=1; i< longitud; i++){
                int longitud2 = longitud-i;
                int j=0;
                for (;j<longitud2;j++)
                    if(arreglo[j]!=arreglo[j+i]){
                        break;
                    }
                    coincidencias = coincidencias + j;    
        }    
        return coincidencias;    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String s = leer.next();
        System.out.println(obtenerValor(s));
	}
}