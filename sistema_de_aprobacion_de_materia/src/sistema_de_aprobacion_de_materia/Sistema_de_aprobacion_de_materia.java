/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_aprobacion_de_materia;

import java.util.Scanner;

/**
 *Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
Requisito estricto: Solo puedes usar una estructura if/else simple.
* 
* 1.Entrada:
*   a.nombre del estudiante tipo string
*   b.calificaciones de dos examenes
* 2.Tareas: utilizando una estructura simple
*   a.calcular el promedio final
* 3.salida:
*   a.si el promedio es igual o mayor 65.0 mostrar mensaje aprobado.
*   b.Si el promedio es menor que 65.0 mostrar reprobado
 */
public class Sistema_de_aprobacion_de_materia {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
//variables
        String nombreEstudiante = "a";
        double primerExamen = 0;
        double segundoExamen = 0;
        double promedio = 0;
        
//datos entrada
        System.out.print("Ingrese el nombre del estudiante: ");
           nombreEstudiante = read.nextLine().toUpperCase();
        System.out.printf("Ingrese la nota del primer examen de %S: ",nombreEstudiante);
           primerExamen = read.nextDouble();  
        System.out.printf("Ingrese la nota del segundo examen de %S: ",nombreEstudiante);
           segundoExamen = read.nextDouble();  
//operaciones logicas
        promedio = (primerExamen+segundoExamen)/2;
//salida al usuario
        if(promedio >= 65.0){
            System.out.printf("Su promedio es de %.2f, felicidades ha aprobado.",promedio);
        }//end if
        else{
            System.out.printf("Su promedio es de %.2f, ha reprobado.",promedio);
        }//end else
    }//end main    
}//end class
