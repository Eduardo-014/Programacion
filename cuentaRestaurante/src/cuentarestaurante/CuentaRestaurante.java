/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;

import java.util.Scanner;

/**
 *
 * @author bonil
 */
public class CuentaRestaurante {

    /**
     *Ciclos de repeticon 
     * 1.While
     * 2.Do-While
     * 3.For 
     * 4.Foreach
     */
    
    /*
    Componentes de ciclos de repeticion 
     1.vaiable de control -> Valor de Inicio
     2.Condiciono-> Limite de Repeticion 
     Todo ciclo de repeticion se ejecuta y repite siempre y cuando la condicion se mantenga verdadera
     3.Modificacador de la variable de control. 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       double promedioPago = 0;
       int gastoIndividual = 0;
       int numPersona = 1;//Variable de Control 
       int gastoAcumulado = 0; 
        
       //Condicion -> Variable de control con limite
       while (numPersona <=7){
        // Instrucciones que se repetiran
           System.out.printf("Persona %d) Cuanto consumiste?",numPersona);
           gastoIndividual = sc.nextInt();
           
           gastoAcumulado += gastoIndividual; //acumula los gastos.
           System.out.printf("P: %d\tGasto Ind: %d\tGasto ACUM: %d", numPersona, gastoIndividual, gastoAcumulado);
           System.out.println("");
              //MOdificador
              //opcion#1
              /*numPersona = numPersona + 1;
              o
              opcion#2
              */
              numPersona++; //Incremento unitario (Post Incremento)
        }//end While
       
           numPersona--;//POST Decremento ya que el acumulador suma uno mas para determinar que la condicion es falsa
           //promedioPago = gastoAcumulado / 7;//Hardcoding, osea estatico
           System.out.printf("Total Personas: %d",numPersona);
           promedioPago = gastoAcumulado / numPersona;
       
           System.out.printf("\nGasto Promedio x Persona: %.2f",promedioPago);
        
        
        
    }
    
}
