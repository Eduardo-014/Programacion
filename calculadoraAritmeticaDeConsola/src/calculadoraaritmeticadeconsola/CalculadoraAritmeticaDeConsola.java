
package calculadoraaritmeticadeconsola;

import java.util.Scanner;

public class CalculadoraAritmeticaDeConsola {
    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
//variables
    int primerEntero = 0;
    int segundoEntero = 0;
    char operacion = '@';
//variables para las operaciones aritmeticas
    double suma = 0.0;
    double resta = 0.0;
    double division = 0.0;
    double multiplicacion = 0.0;
    double residuo = 0.0;   

//brindar opciones al usuario
System.out.println("A continuacion se muestran las opciones disponibles.");
System.out.println("(S) Suma");
System.out.println("(R) Resta");
System.out.println("(D) Division");
System.out.println("(M) Multiplicacion");
System.out.println("(Z) Reciduo");
System.out.print("Ingrese la letra correspondiente a la operacion a realizar: ");
operacion = read.nextLine().toUpperCase().charAt(0);

System.out.println("");

//Estructura de seleccion tipo switch
        switch (operacion) {
            case 'S':
                //Ingresar datos de entrada 
                System.out.println("Por favor, ingrese el primer numero entero: ");
                primerEntero = read.nextInt();

                System.out.println("Ingrese el segundo numero entero: ");
                segundoEntero = read.nextInt();

                suma = primerEntero + segundoEntero;

                System.out.printf("\nEl resultado de la suma es: %.2f", suma);
                break;
            case 'R':
                //Ingresar datos de entrada 
                System.out.println("Por favor, ingrese el primer numero entero: ");
                primerEntero = read.nextInt();
                System.out.println("Ingrese el segundo numero entero: ");
                segundoEntero = read.nextInt();

                resta = primerEntero - segundoEntero;
                
                System.out.printf("\nEl resultado de la resta es: %.2f", resta);
                break;
            case 'D':
                //Ingresar datos de entrada 
                System.out.println("Por favor, ingrese el dividendo: ");
                primerEntero = read.nextInt();
                System.out.println("Ingrese el divisor: ");
                segundoEntero = read.nextInt();
                
                if(segundoEntero !=0){
                division = primerEntero / segundoEntero;
                System.out.printf("\nEl cociente es: %.2f", division);
                } //end if
                else{
                System.out.println("El dividendo no puede ser igual a cero.");
                }//end else
                break;
            case 'M':
                //Ingresar datos de entrada 
                System.out.println("Por favor, ingrese el primer numero entero: ");
                primerEntero = read.nextInt();
                System.out.println("Ingrese el segundo numero entero: ");
                segundoEntero = read.nextInt();

                multiplicacion = primerEntero * segundoEntero;
                
                System.out.printf("\nEl resultado de la multiplicacion es: %.2f", multiplicacion);
                break;
            case 'Z':
                //Ingresar datos de entrada 
                System.out.println("Por favor, ingrese el dividendo: ");
                primerEntero = read.nextInt();
                System.out.println("Ingrese el divisor: ");
                segundoEntero = read.nextInt();
                
                if(segundoEntero !=0){
                residuo = primerEntero % segundoEntero;
                System.out.printf("\nEl residuo de la division es: %.2f", residuo);
                } //end if
                else{
                System.out.println("El dividendo no puede ser igual a cero.");
                }//end else
                break;
            default:
                System.out.println("No se ha podido reconocer la operacion seleccionada.");
                break;
        }//end switch
    }//end main
}//end class
