/*
 * . Uso del operador módulo (Conversión de tiempo) Escriba un programa que solicite una
cantidad de tiempo expresada en minutos (por ejemplo, 135 minutos). Utilizando el operador de
división (/) y el operador de módulo (%), calcule y muestre a cuántas horas y minutos exactos
equivale esa cantidad

Analisis
1.Entrada: Cantidad de tiempo en minutos 
2.Salida: Horas y minutos exactos 
3.operaciones: Dividir los minutos ente la unidad de horas, sumar tambien a ese resultado el reciduo para ser exactos.
 */

package uso.del.operador.modulo_conversor_del_tiempo;

import java.util.Scanner;

public class UsoDelOperadorModulo_Conversor_del_tiempo {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
//variables
        int minutos = 0;
        int horas = 0;
        int horasMod = 0;
    
        
        System.out.print("Ingrese la cantidad de minutos que desea convertir en horas: ");
        minutos = read.nextInt();
        
        horas = minutos/60;//muestra las horas exactas
        horasMod = minutos%60;//Muestra los minutos exactos
        
        
        System.out.printf("Las horas son: %d horas y %d minutos", horas,horasMod );    
        
    }//end main
    
}//end class
