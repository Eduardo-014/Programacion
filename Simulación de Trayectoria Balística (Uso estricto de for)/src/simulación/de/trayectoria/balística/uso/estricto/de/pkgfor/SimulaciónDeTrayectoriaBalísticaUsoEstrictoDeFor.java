
package simulación.de.trayectoria.balística.uso.estricto.de.pkgfor;

import java.util.Scanner;

/**
 Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
correspondiente a la trayectoria.
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática
* 
* Pasos
* 1.Recibir la velocidad inicial del proyectil en (m/s)
* 2.tambien con el angulo de lanzamiento (en grados)
* 3.verificar que la velocidad inicial debe ser mayor a 0 
* 4.verificar que el angulo este entre 1 y 89 grados
* 5.utilizar ciclo flor para calcular la altura y mostrarla con cada segundo trasncurrido de 1-10 segundos
* con ayuda de la formula A=V0*sin*t 
* 6.ciclo if apar indicar en que segundo alcanza la altura maxima estimada 
* 7.In en que segundo alcanzo una altura negativa, lo cual significa que ya impacto el suelo.
 */
public class SimulaciónDeTrayectoriaBalísticaUsoEstrictoDeFor {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //variables
        double velocidadInicial = 0;//velocidad en m/s
        double anguloGrados = 0;
        double anguloRadianes = 0;
        double gravedad = 9.8;
        double altura = 0;
        double alturaMaxima = 0;
        double tiempoExacto = 0;
   
        
        
        
        //Capturar la velociad inicial y el angulo de lanzamiento
        System.out.println("Ingrese la velocidad inicial en m/s: ");
           velocidadInicial = read.nextDouble();
        System.out.println("Ingrese el angulo de lanzamineto: ");
           anguloGrados = read.nextDouble();
              //conversion de grados a radianes
              anguloRadianes = Math.toRadians(anguloGrados);
        
        //Verificar que se cumplen las condiciones de velocidad y angulo para iniciar con el ciclo
        if( velocidadInicial > 0 && anguloGrados >= 1 && anguloGrados <= 89){
           //Ciclo for que tendra como contador el tiempo en este caso 10 segundos
           for (int t=1; t < 11; t++){
               //formula para calcular la altura
               altura = (velocidadInicial*Math.sin(anguloRadianes)*t)-(0.5*gravedad*Math.pow(t,2));
               //Imprimir trayectoria
               System.out.println("--------------");
               System.out.println(" Trayectoria");
               System.out.println("--------------");
               System.out.printf("  %d | %2f  \n",t,altura);

               //seleccion para encontrar la altura mayor y cuando llega al suelo
                  if (altura > alturaMaxima){
                     alturaMaxima = altura;// guarda la altura del ciclo
                     tiempoExacto = t;//guardar el segundo exacto segun el ciclo
                    }//end if
                  else if (altura < 0){
                     System.out.println("El proyectil a llegado al suelo.");
                     t = 11;
                  }//end else if
           }//end for
            System.out.printf("La altura maxima es de %.2f en el segundo %.2f",alturaMaxima ,tiempoExacto);
        }
        else{
           System.out.println("Grados no validos."); 
        }
        
        
           
    }//end main
    
}//end class


                     