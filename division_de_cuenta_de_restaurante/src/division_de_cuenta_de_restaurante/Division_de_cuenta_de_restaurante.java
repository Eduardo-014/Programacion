/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package division_de_cuenta_de_restaurante;

import java.util.Scanner;

/**
División de cuenta de restaurante Escriba un programa que pida al usuario el monto total de
una cuenta de restaurante y la cantidad de personas en la mesa. Calcule y muestre en pantalla
cuánto dinero debe pagar cada persona si deciden dividir la cuenta en partes exactamente iguales
 */

/*
1.Entrada: Monto total de la cuenta, numero de personas en la mesa
2.Salida: Si las personas deciden dividir la cuenta en partes iguales,
muestre cuanto le toca pagar a cada uno.
3.Operaciones:
  a.Dividir la cuenta total entre el total de personas.
*/
public class Division_de_cuenta_de_restaurante {

    
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
//variables
      double totalCuenta = 0;
      double numeroPersonas = 0;
      double pagoIndividual = 0;
      
      
//solicitar datos de entrada
        System.out.print("Ingrese el total de la cuenta: ");
        totalCuenta = read.nextInt();
        System.out.print("Cual es el numero de personas?: ");
        numeroPersonas = read.nextInt();
//operacion logica 
           pagoIndividual = totalCuenta/numeroPersonas;
//Imprimir la division de la factura
        System.out.printf("Cada persona debe pagar %.2f.",pagoIndividual);
    }//endMain
    
}//endClass
