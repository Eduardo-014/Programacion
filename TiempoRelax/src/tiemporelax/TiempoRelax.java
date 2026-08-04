/*
 * Objetivos
1.Seleccion multiple
  a.Estructura
  b.Tipos de condicion
2.Formateo de cadenas (printf)
 */
package tiemporelax;

import java.util.Scanner;

/*
Desarrollar algoritmo que me permita escoger un pais a visitar.
Posterior a ello, debemos nosotros escoger las posibles ciudades a recorrer,
sin embargo solo se puede una ciudad
 */
public class TiempoRelax {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variable (un Switch puede trabajar con char o int osea caracteres y numeros se puede con string pero no es recomendable)
        int seleccionMenu = 0;
        char seleccionSubMenu = '@';
        
        
        System.out.println("Agendia de viajes");
        System.out.printf("|%20s| |%-20s| \n", "Taniha's Travel","Buen viaje");
        System.out.println("---------------------------------------------");
        System.out.println("1. Japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.print("Respuesta: ");
        seleccionMenu = sc.nextInt();
        
        /*
        if/else ->Rango de valores
        Switch  ->Igualdad / Todas opciones estan al mismo nivel
        */
//Sera el switch principal
        switch (seleccionMenu){
            
            case 1:
                System.out.println("日本へようこそ");
                System.out.println("Bienvenido a Japon");
                System.out.println("------------------");
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                System.out.print("Respuesta: ");
                sc.nextLine(); //Limpieza de bufer
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
        //Sera el switch subclase                
                switch (seleccionSubMenu){
                    case 'A':
                         System.out.println("Super Nintendo World Tour");
                       break;
                    case 'B':
                         System.out.println("Car Meet");
                       break;
                    case 'C':
                         System.out.println("Pabellon Dorado");
                       break;
                    default: 
                         System.out.println("Cualquier ciudad...");
                         System.out.println("porque no esta");
                         System.out.println("la ciudad que escogiste.");
                       break;
                }//end switchSubMenu
                break;
            case 2:
                  System.out.println("Bienvenue en France!");
                  System.out.println("Bienvenido a Francia");
                  System.out.println("--------------------");
                  System.out.println("1. Paris");
                  System.out.println("2. Marsella");
                  System.out.println("3. Lyon");
                  System.out.print("Respuesta: ");
                  sc.nextLine();//limpiar bufer
                  seleccionSubMenu = sc.nextLine().charAt(0);
                    
                     //Sub switch
                  switch (seleccionSubMenu){
                          case '1':
                              System.out.println("Torre Eiffel");
                             break;
                          case '2':
                              System.out.println("Palacio de Marshella");
                             break;
                          case '3':
                              System.out.println("El estadio!");
                             break;
                          default:
                              System.out.println("La opcion no esta disponible.");
                             break;
                              
                  }//end subMenu switch
                break;
            case 3:
                  System.out.println("Nau mai, haere mai!");
                  System.out.println("Bienvenido a Nueva Zelanda");
                  System.out.println("--------------------------");
                  System.out.println("A. Sky Tower");
                  System.out.println("B. Hogbbiton");
                  System.out.println("C. Mildford Sound");
                  System.out.print("Respuesta: ");
                  
                  sc.nextLine();
                  seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                   //se puede utilizar el if en el switch, pero el switch es mas rapido  
                    if(seleccionSubMenu == 'A'){
                       System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    }else if(seleccionSubMenu =='B'){
                       System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");                  
                    }else if(seleccionSubMenu =='C'){
                       System.out.printf("%s Mioldford Sound %s","\u001B[34m","\u001B[0m");
                    }
                    else{
                       System.out.println("Usted no lee va?!!!");
                }
               
                break;
            case 4:
                  System.out.println("Welcome to Canada!");
                  System.out.println("Bienvenido a Canada");
                break;
            default:
                  System.out.println("Ya que no se escogio un pais");
                  System.out.println("Se le ubicara en uno aleatoriamente.");
                break;
        }//end switch        
        
        
        
        
        
        
        
        
    } //end main
    
} //end class
