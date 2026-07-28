package conversiones;

import java.util.Scanner;

public class Conversiones {

    /*
     * Objetivos 
     * 1.Orden Secuencial de las instrucciones
     * 2.Capturar datos desde teclado 
     * 3.Operaciones aritmeticas
     * 
     * Desarrollar un algoritmo que me permita convertir los siguientes elementos:
     * 1. Pulgadas a centimetros
     * 2. Kilometros a millas
     * 3. Grados farenheit a grados celsius
     */
    
    public static void main(String[] args) { 
       Scanner teclado = new Scanner(System.in); //manual o utilizando el ofco, son las dos maneras para agregar un scanner.
 /*
     Las variables no pueden iniciar con un numero, solamente con letras
 */
     //Declarar variables 
       int pulgadas = 0;
       double resultadoCM = 0;
       double kilometros = 0;
       double millas = 0;
       double farenheit = 0;
       double celsius = 0;
 /* 
     Los datos se leen de derecha <--- a izq.
     este es el orden secuencial en programacion.  
 */ 
     
     //1. Pulgadas a cm  
       pulgadas = 10;  
       resultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
        
       pulgadas = 35;  
       resultadoCM = pulgadas * 2.54;
        System.out.printf("\n%.2f cm es igual igual a %d pulgadas",resultadoCM,pulgadas);

     //2. Kilometros a millas
        System.out.println("");
        System.out.println("Cuantos kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros * 0.62;  
        System.out.printf("\n%.2f km es igual a %.2f millas \n",kilometros,millas);                         
        
     //3. Grados Farenheit a Celsius
        System.out.println("");
        System.out.println("Por favor, indique la temperatura en grados farenheit para conocerla en celsius");
        farenheit = teclado.nextDouble();
        celsius = (farenheit-32) * 5/9;
        System.out.printf("\n %.2f farenheit es igual a %.2f grados celcius",farenheit,celsius);
        
        
    }
    
}
