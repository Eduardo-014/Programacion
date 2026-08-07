
package interes_simple;

import java.util.Scanner;

public class Interes_simple {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//variables
    long capitalInicial = 0;
    int interesAnual = 0;
    int tiempoAnual = 0;
    long intereSimple = 0;
    
//solicitar datos
        System.out.print("Para conocer el interes generado de su prestamo \npor favor, ingrese el capital inicial exacto (Sin monedas): ");
          capitalInicial = read.nextLong();
          
         System.out.println("De cuanto fue el interes (sin decimales) anual impuesto por el prestamista anualmente?:  ");
          interesAnual = read.nextInt();
        
        System.out.println("Hace cuantos años recibio el prestamo?:  ");
          tiempoAnual = read.nextInt();
        
//calculo del interes (capital, tasa, tiempo)/100
        intereSimple = (capitalInicial * interesAnual * tiempoAnual)/100;
         
        
//Respuesta al usuario 
        System.out.printf("El interes simple de su prestamo actualmente es de %d",intereSimple);   
    }//end main   
}//end class
