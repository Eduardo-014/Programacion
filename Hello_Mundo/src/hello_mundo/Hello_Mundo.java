/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello_mundo;

/**
 *
 * @author bonil
 */
public class Hello_Mundo {

    //Doble plaqueta sirve para añadir un comentario en una sola linea
    /*
    Pleca + Asterisco -> Abrir bloque comentario
    Asterisco + Pleca -> Cerrar el bloque comentario
    
    To lo que esta escrito dentro de estos simbolos es un comentario
    */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
          1. Imprimir en pantalla 
              a. Salidas formateadas
              b. Caracteres de Escape
          2. Camturar datos
        */
        
        System.out.println("Hola, me llamo Moisés!");
        System.out.println("Este sera mi promer programa");
        System.out.println("PROGRAMAAAAA!!");
        
        System.out.print("Vamos camino a ");
        System.out.print("la clase de ");
        System.out.print("PROGRA!!");
        
        System.out.println("");
         
        System.out.printf("Tu apellido es %S/n", "Bonilla");
        //System.out.println("");
        //alt + 92 -> \
        
        System.out.printf("%S tu apellido es/n", "Bonilla");
        //System.out.println("");
        
        System.out.printf("Tu apellido %S es/n", "Bonilla");
        
        System.out.println("Hola \n este es \n Un nuevo \n Amanecer");
        System.out.println("Hola \t este es \t un nuevo\t amanecer");
    
        //Variables
    int edad;       //Tipo entero
    double peso;    //Tipo decimal  
    char inicial;   //Tipo caracter -> Letras,digitos
                    //,simbolos especiales
    String nombre;  //Tipo cadena
    boolean estado; //Tipo estado ->true(verdadero)
                    //false(falso)
                   
    edad = 23;      
    peso = 60.6;  
    inicial = 'M'; //alt + 39-> '
    nombre = "Moises"; 
    
     System.out.printf("Tengo %d años\n",edad);
     System.out.printf("Mi peso ideal es %.2f\n",peso);
     System.out.printf("Dime %c por mi inicial\n",inicial);
     System.out.printf("Me llamo %s\n",nombre);
    
    }//Fin de main
    
}//Fin de Class
    
