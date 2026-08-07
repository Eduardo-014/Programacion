package calculo_con_dos_variables;
import java.util.Scanner;
public class Calculo_con_dos_variables {
 
    public static void main(String[] args) {
     Scanner read = new Scanner (System.in);  
        
//variables en double, la entrada puede ser de medidas diferentes a solamente enteros.  
        double baseRectangulo = 0;
        double alturaRectangulo = 0;
        double perimetroRectangulo = 0;
        double areaRectangulo = 0;
        
//valores de entrada para las variables        
        System.out.printf("Para poder conocer el area y perimetro de un rectangulo,\nPor favor ingrese en metros la medida de la base: ");
         baseRectangulo = read.nextDouble();
        System.out.println("Ahora por favor, ingrese la medida de la altura en metros: ");
         alturaRectangulo = read.nextDouble();
         
//formula para area 
        areaRectangulo = baseRectangulo * alturaRectangulo; 
//Formula para el perimetro 
        perimetroRectangulo = 2*baseRectangulo + 2*baseRectangulo;
        
//respuesta al usuario
        System.out.printf("El perimetro del rectangulo con base: %.2fm y con altura de: %.2fm es: %.2f",
                          baseRectangulo, alturaRectangulo, perimetroRectangulo);
        System.out.printf("\nEl area del rectangulo con base: %.2fm y con altura de: %.2fm es: %.2f",
                          baseRectangulo, alturaRectangulo, areaRectangulo);
    }//end main  
}//end class
