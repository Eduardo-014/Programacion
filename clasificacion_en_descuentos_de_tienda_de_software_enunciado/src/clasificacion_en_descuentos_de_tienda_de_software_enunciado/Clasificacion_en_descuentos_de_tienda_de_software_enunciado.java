/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificacion_en_descuentos_de_tienda_de_software_enunciado;

import java.util.Scanner;

/**
 *Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía
premium. Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
• Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
o Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si
cumple alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un
10%.
o Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es
así, recibe un 15% de descuento. De lo contrario, no tiene descuento (0%).
El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta
original y el nuevo total que se tiene que pagar por el juego.
* 
* Tareas a realizar;
* 1.Solicitar edad del cliente
* 3.verificar que el cliente es mayor o tiene los 18 
* 4.si es mayor de edad verificar si tiene mas de 65 o si tiene membresia 
* 5.Si cumple una de las condiciones, darle el 20% de descuento
* 6.Sino darle un 10%
* 7.Si el cliente es menor de edad verificar que tenga mas de 12 para darle un 15% de descuento. 
* 8.Sino 0%
* 9.Mostrar el descuento dinal aplicado y tambien el precio de venta origianal
* 10.el Nuevo total que se debe pagar por el juego. 

* 
 */
public class Clasificacion_en_descuentos_de_tienda_de_software_enunciado {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
//variables       
        int edadCliente = 0;
        char membresia = '@';
        double valorCompra = 0; 
        double valorDescuento = 0;
        double totalPagar = 0;
        double descuentoPremium = 0.2;
        double descuentoBase = 0.1;
        double descuentoMenores = 0.15;
        int sinDescuento = 1;
                

//Valor de compra
        System.out.println("Ingrese el valor de su compra: ");
           valorCompra = read.nextDouble();
        System.out.printf("El valor de su compra es de: %.2f",valorCompra);
        System.out.println("");
//solicitar edad
        System.out.println("Para ver el descuento al que aplica, ingrese su edad: ");
           edadCliente = read.nextInt();
//solicitar membresia
        System.out.print("Cuenta con una membresia?");
        System.out.println("(Y)Si, (N)No:");
           membresia = read.next().toUpperCase().charAt(0);
//solicitar membrecia
        
//estructura de seleccion para verificar edad
           if (edadCliente >= 18){//vericar si es mayor de edad
               if (edadCliente >= 65 || membresia == 'Y') {//verificar una de las dos condiciones para el 20% del descuento 
                   System.out.println("Aplica para obtener un descuento del 20% en su compra");
                      valorDescuento = valorCompra*descuentoPremium;
                      totalPagar = valorCompra - valorDescuento;
                   System.out.printf("-Valor de la compra: %.2f\n-Descuento: %.2f\n-Total a pagar: %.2f",valorCompra,valorDescuento,totalPagar);
                   }//end second if
               else {//sino aplica al descuento del 20% este else redirige al 10%
                   System.out.println("Aplica para un descuento del 10%");
                      valorDescuento = valorCompra*descuentoBase;
                      totalPagar = valorCompra - valorDescuento;
                   System.out.printf("-Valor de la compra: %.2f\n-Descuento: %.2f\n-Total a pagar: %.2f",valorCompra,valorDescuento,totalPagar);                
               }//end else
        
        }//end if
           else if (edadCliente >= 12 && edadCliente <= 17){
                 System.out.println("Aplica para un descuento del 15%");
                      valorDescuento = valorCompra*descuentoMenores;
                      totalPagar = valorCompra - valorDescuento;
                   System.out.printf("-Valor de la compra: %.2f\n-Descuento: %.2f\n-Total a pagar: %.2f",valorCompra,valorDescuento,totalPagar);           
           
           }//end else if 
           else {
               System.out.println("No aplica para un descuento");
                      valorDescuento = valorCompra*sinDescuento;
                      totalPagar = valorCompra - valorDescuento;
                   System.out.printf("-Valor de la compra: %.2f\n-Descuento: %.2f\n-Total a pagar: %.2f",valorCompra,valorDescuento,totalPagar);
           
           }//end else
       
        
        
        
    }//end main
    
}//end class
