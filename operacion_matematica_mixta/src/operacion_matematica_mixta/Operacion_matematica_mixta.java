
package operacion_matematica_mixta;

import java.util.Scanner;

/**
 *4. Operación matemática mixta Escribir un programa para convertir temperaturas. El programa
debe solicitar al usuario que ingrese una temperatura en grados Fahrenheit. Luego, aplique la
fórmula matemática mixta (Fahrenheit - 32) * 5 / 9 para convertir el valor a grados Celsius y
muestre el resultado final.
* 
* Analisis
* 1. Entrada: Temperatura en grados Farenheit.
* 2. Salida: Temperatura en grados Celsius
* 3. Procesos: Convertir grados farenheit a celcius (Fahrenheit - 32) * 5 / 9)
 * 
 */
public class Operacion_matematica_mixta {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        //variables
        int gradosFarenheit = 0;
        int gradosCelcius = 0;
        
        System.out.print("Por favor ingrese una temperatura en grados Farenheit: ");
        gradosFarenheit = read.nextInt();
        
        gradosCelcius = (gradosFarenheit-32)*5/9;
        
        System.out.printf("La temperatura es grados Celcius es de: %d",gradosCelcius);     
        
    }//end main
    
}//end class
