
package sistemaestudiante;

/**
 *
 */
public class SistemaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student Moises = new Student ();
        Student Eduardo = new Student (15,1.9);
        
       Moises.MostrarDatos();
        System.out.println("------------------");
       Eduardo.MostrarDatos();
        System.out.println("------------------");
        
        Moises.nombre = "Eduardo";
        Eduardo.nombre = "Moises";
       
        Moises.SetEdad(10);
        Eduardo.SetEdad(40);
        System.out.println("");
         Moises.MostrarDatos();
         Eduardo.MostrarDatos();
         
         
        
       
               
        
    }//end main

}//end class
