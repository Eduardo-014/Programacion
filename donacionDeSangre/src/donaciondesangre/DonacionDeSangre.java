
package donaciondesangre;

import java.util.Scanner;

public class DonacionDeSangre {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Variables salida
        String donanteApto = "Si";
        //Variables entrada
        int edad = 0;
        int peso = 0;
        char saciado = '@';
        int hierro = 0;
        String genero = "bipbip";

        //Validar la edad y peso.
        System.out.println("Ingrese su edad: ");
        edad = read.nextInt();
        System.out.println("Ingrese su peso en lbs: ");
        peso = read.nextInt();

         if (edad >= 18 && edad <= 65 && peso >= 110 ) {
             read.nextLine();//Limpiador de buffer
            
        //Validar si se alimento
          System.out.println("Se ha alimnetado hoy?");
            saciado = read.nextLine().charAt(0);

            if (saciado == 'S' || saciado == 's') {
            }//end if
            else {
                System.out.println("Lo sentimos, necesita comer para poder ser donante.");
            }//end else
        
        //Identificar genero y nivel de hierro
          System.out.println("Introdusca su genero (Masculino, femenino):");
            genero = read.nextLine().toUpperCase();
             
          System.out.println("Introdusca su nivel de hierro:");
            hierro = read.nextInt();
        
            if((hierro >= 14 && genero.equals("MASCULINO")) || (hierro >= 12 && genero.equals ("FEMENINO"))){
              System.out.println("Es apto para donar sangre.");
            }//end if
            else{
            System.out.println("No apto para donar sangre.");
            }//end else  
        
            }//end if
         else{
             System.out.println("Lo sentimos, no puede donar sangre.");
         }//end else
        }//end main
    }//end class 
    

