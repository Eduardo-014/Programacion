
package conversor.de.unidades.físicas.uso.pkgdo.pkgwhile;

import java.util.Scanner;

/**
Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4.
* 
* 
* 
*Tareas
* -Mostrar al usuario las conversiones posibles de nuestro programa.
* -Se deve solicitar al usuario una magnitud(Longitud peso etc. no puede ser negativo) 
* -Si el numero que ingresa es menor que 0 debe mostrar un mensaje de error y volver a pedir el dato
* -Utilizar una estructura switch para procesar la opcion elegida y hacer el calculo correspondiente
* - 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
* -La estructura switch va dentro de un do while, se sale con la opcion 4.
* -
 */
public class ConversorDeUnidadesFísicasUsoDoWhile {
    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        int opcion = 0;
        int control = 0;
        double metros = 0; 
        double pies = 0;
        double kilogramos = 0; 
        double libras = 0;
        double centimetros = 0;
        double pulgadas = 0;
        
        do{
            System.out.println("--------------------------");
            System.out.println("  Opciones de convercion  ");
            System.out.println("--------------------------");
            System.out.println("1.Metros a Pies");
            System.out.println("2.Kilogramos a Libras");
            System.out.println("3.Centimetros a pulgadas");
            System.out.println("4.Salir");
            System.out.println("--------------------------");
            System.out.println("Ingrese una opcion:");
               opcion = read.nextInt();
               
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor en metros:");
                       metros = read.nextDouble();
                          pies = metros*328084;
                    System.out.printf("%.2f metros es igual a %.2f pies\n", metros, pies);
                     System.out.println("");
                break;
                case 2:
                    System.out.println("Ingrese el valor en kilogramos:");
                       kilogramos = read.nextDouble();
                          libras = kilogramos*2.20462;
                    System.out.printf("%.2f kilogramos es igual a %.2f libras\n", kilogramos, libras);  
                     System.out.println("");
                break;
                case 3:
                    System.out.println("Ingrese el valor en centimetros:");
                       centimetros = read.nextDouble();
                          pulgadas = centimetros/2.54;
                    System.out.printf("%.2f centimetros es igual a %.2f pulgadas\n", centimetros, pulgadas); 
                     System.out.println("");
                break;
                case 4:
                    System.out.println("Programa finalizado");
                       control++;
                       
                break;
                default: 
                    System.out.println("Opcion no valida, ingrese una opcion valida");
                     System.out.println("");
                    
            }//end switch
        
        }//end do 
        while (control != 1);
        
    }//end main  
}//end class
