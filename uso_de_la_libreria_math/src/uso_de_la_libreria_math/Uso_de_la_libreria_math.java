
package uso_de_la_libreria_math;

import java.util.Scanner;


public class Uso_de_la_libreria_math {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
//Variables 
        double radioCirculo = 0;
        double areaCirculo = 0;
        double circunferencia = 0;
        
//entrada de valores 
        System.out.printf("Para conocer el valor del area y circunferencia de un circulo \ningrese el radio en la unidad de metros: ");
          radioCirculo = read.nextDouble();

//obtener area utilizando mat
        areaCirculo = Math.PI*Math.pow (radioCirculo,2);
        
//Obtener circunferencia 
        circunferencia = 2 * Math.PI * radioCirculo;
        
//Respuesta al usuario 
        System.out.printf("La circunferencia del circulo con radio de %.2fm es de: %.2fm \nEl area del circulo con radio: %.2f es de: %.2f", 
                radioCirculo, circunferencia, radioCirculo, areaCirculo);   
    }//end main   
}//end class
