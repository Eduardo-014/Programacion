/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion_de_.porcentaje_.de_descuento;

import java.util.Scanner;

/**
 *5. Aplicación de porcentaje de descuento Desarrolle un programa que solicite el precio original
de un artículo y el porcentaje de descuento que se le aplicará (por ejemplo, 15). Calcule el monto
en dinero que representa ese descuento y réstelo al precio original para mostrarle al usuario el
precio final a pagar.
 * 
 * 
 * Analisis
 * 1.Entrada: precio original de un articulo, porcentage de descuento que se le aplicara
 * 2.Salida: Mostrar el precio final con el descuento aplicado
 * 3. Operaciones: a. alcular el porcentage ingresado por el usuario en base al monto ingresado.
 * b. restar el porcentage al monto total.
 *   
 *
 */
public class Aplicacion_de_Porcentaje_De_descuento {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
//Variables        
        double preciobase = 0;
        int descuentoAplicable = 0;
        double precioDescuento = 0;
//Solicitar datos de entrada        
        System.out.print("Cual es el precio del producto?: ");
        preciobase = read.nextDouble();
        
        System.out.print("Ingrese el descuento: ");
        descuentoAplicable = read.nextInt();
//operacin que calcula el monto final con el descuento        
        precioDescuento = preciobase - (preciobase*descuentoAplicable)/100;
//salida        
        System.out.printf("El precio con el descuento aplicado es de: %.2f", precioDescuento);
             
    }//end main
    
}//end class
