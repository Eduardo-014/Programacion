
package seleccionvehiculo;

import java.util.Scanner;

public class SeleccionVehiculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//variables de entrada
        int cantidadLitros = 0;
        char respuestaTipo = '@';
        String respuestaCadena = "John Doe";
//Entradas 
        System.out.println("Me dijeron que eres dueño de un vehiculo \"Verde\"");
        System.out.println("Tienes que hecharle biodiesel.");
        System.out.println("¿Cuanto agarra?");
        cantidadLitros = entrada.nextInt();

        /*
Las estructuras de desicion son exepciones,
no necesitan terminar con ";"
         */
        if (cantidadLitros >= 30) {
            //Condiciones que se deben cumplir cuando se cumple la ondicion
            System.out.println("Es un vehiculo con grandes capacidades, ");
            System.out.println("Seguro la factura es alta!.");
        }//Fin de if
        System.out.println("");

        entrada.nextLine();
        /*Limpia el buffer, es necesario cuando se cambia de numero a caracter en viseversa no pasa nada*/
        System.out.println("Tu vehiculo es Diesel? (x = si, y = no)");
        respuestaTipo = entrada.nextLine().charAt(0);/*
                                                       El chartAt(0); Indica la posicion del caracter 
                                                       dentro de una palabra o cadena que se tomara.
         */
        
         /*System.out.printf("\nRespuesta dada: %c",respuestaTipo);
        
         System.out.println("\nTu vehiculo es Diesel? (x = si, y = no)");
        respuestaTipo = entrada.nextLine().charAt(1);
        System.out.printf("Respuesta dada: %c",respuestaTipo);
        
         System.out.println("\nTu vehiculo es Diesel? (x = si, y = no)");
        respuestaTipo = entrada.nextLine().charAt(2);
        System.out.printf("Respuesta dada: %c",respuestaTipo);
         */

        if (respuestaTipo == 'x') {
            //Condicion verdadero
            System.out.println("Si es diesel verde!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");

        }//Fin if
        else {
            /*Condicion falsa
              el else no lleva condicion
             */
            System.out.println("Uyyy... eres anticlimatico");
            System.out.println("Calentamiento Global!!!");

            System.out.println("");
            /*System.out.println("Tu carro es energeticamnete eficiente?");
            respuestaCadena = entrada.nextLine();
            System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
            
            System.out.println("\nseguro que asi?");
            respuestaCadena = entrada.nextLine().toUpperCase(); 
            System.out.printf("Respuesta Ingresada: %s",respuestaCadena); 
        
            System.out.println("\n100% seguro?");
            respuestaCadena = entrada.next().toLowerCase();/*next() deja de capturar cuando detecta un espacio en la cadena 
            El toLowerCase convierte todo a minuscula.
          
            System.out.printf("Respuesta Ingresada: %s",respuestaCadena); 
             */
            System.out.println("Tu carro es energeticamente eficiente?: ");
            respuestaCadena = entrada.nextLine();

            if (respuestaCadena.equals("si")) {
                System.out.println("Excelente");
            } else {
                System.out.println("Uuuy... busca que se puede hacer.");
            }

        }//Fin else
    }//Fin main

}//Fin class
