
package analisis_de_sensores_de_temperatura;

import java.util.Scanner;

/**
 Análisis de Sensores de Temperatura (Uso While)
Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese el valor
centinela −999.
• Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
• Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
 */

/*
1.Salida:
   a.Promedio de las temperaturas validas.
   b.Diferencia termica entre la temperatura mas alta y la mas baja leida.
   c.Cntrol de error por valor ingresado en error
2.Entrada: 
   a.valor centinela -999
   b.demas valores del sensor en cada ronda
3.Procesos:
   a.Generar temperaturas menor o mayor que el cero absoluto (−273.15 °𝐶).
   b.leer repetidamente las temperaturas (grados centigrados) registrados por un sensor indutrial.
   c. Al ingresar el valor de  -999 el programa debe parar
   d. Al ingresar un valor < al cero absoluto o diferente de -999 debe brindar una alerta de error. (este paso es valido solo con estructura if, else)
   e. Estos valores erroneos deben ser excluidos de la cuenta de temperaturas.
   f. obtener e imprimir; promedio de las temperaturas ingresadas
   g. Distancia termica entre la temperatura mas alta y baja leida.

*/
public class Analisis_de_sensores_de_Temperatura {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
//variables
double sensor = 0;
double promedio = 0;
double sumaMediciones = 0;
int cantidadMedidas = 0;
double tempMaxima = -273.15;
double tempMinima = Double.MAX_VALUE; //Ingresa un valor altisimo para que la condicion tenga validez.
double diferencia = 0;


        
            System.out.println("Ingrese un valor: ");
               sensor = read.nextDouble();
      while (sensor != -999){
            System.out.printf("\nEl valor ingresado es de %.2f", sensor);
            System.out.print("");
            System.out.println("Ingrese un valor: ");
               sensor = read.nextDouble();
            //conteo de medidas
               cantidadMedidas++;
            //System.out.println("");
            //System.out.println("Contador: " + cantidadMedidas);

          if (sensor == -999) {
                cantidadMedidas--;//resta un contador para no afecar el promedio
                System.out.println("");
                
                //System.out.println("Contador: " + cantidadMedidas);
                System.out.println("Protocolo de parada ingresado.");
                   sumaMediciones = sumaMediciones - sensor;//resta el valor ingresado para no afecar la suma 
                 //calcular promedio
                   promedio = sumaMediciones / cantidadMedidas;
                 //calcula la diferencia entre la maxima y minima temperatura.  
                   diferencia = tempMaxima - tempMinima;
                System.out.printf("La suma total de las mediciones es de %.2f ",sumaMediciones);
                System.out.printf("El promedio de mediciones es de: %.2f", promedio);
                System.out.printf("\nLa diferencia de la maxima y minima temperatura es de %.2f",diferencia);
                
          }//end if 
          else if (sensor < -273.15) {
                System.out.println("Error, valor inmedible.");
                   cantidadMedidas--;//resta un contador para no afecar el promedio
                //System.out.println("");
                //System.out.println("Contador: " + cantidadMedidas);
                   sumaMediciones = sumaMediciones - sensor;//resta el valor ingresado para no afecar la suma 
            }//end if

            //Calcular maximos y minimo de temperatura
          if (sensor != -999 && sensor >= -273.15){//tener como expecion las condiciones par aque no interfieran en las medidas
            //total de las mediciones
               sumaMediciones = sumaMediciones + sensor;
          if(sensor>tempMaxima){
            tempMaxima = sensor;
            }//end if
            //calcular minimos de temperatura 
          if(sensor<tempMinima){
            tempMinima = sensor;
            }//end if
                
            }//end if
        }//end While

    }//end main
    
}//end class
