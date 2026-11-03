/*
 * 
 */
package gestiontickets;

/**
 *
 * @author bonil
 */
public class GestionTickets {

    /**
     * Un equipo de desarrollo de software necesita un sistema para 
     * organizar su trabajo. Todo lo que se registra en el sistema es 
     * una Tarea Base (tiene un ID y un título). Un tipo específico de 
     * tarea es un Bug (Error de Código), el cual requiere saber en qué 
     * entorno ocurrió (ej. Producción, Pruebas). Finalmente, existen los Bugs de Seguridad, 
     * que son errores críticos que, además de lo anterior, deben 
     * registrar el código de vulnerabilidad (CVE) y si los datos de los usuarios están expuestos.
     */
    public static void main(String[] args) {
        TareaBase tarea1 = new TareaBase("TB-01", "Prueba 1", true);
        tarea1.marcaResuelto();
        System.out.println("\nPriodidad: "+tarea1.GETcalcularPrioridad());
         
        System.out.println("\n");
        System.out.println("");
        System.out.println("Sigue el hijo de Tarea Base");
        System.out.println("");
        
        Bugs bugs1 = new Bugs ("B-01", "Prueba 1B", true, "Production");
        bugs1.marcaResuelto();
        System.out.println("\nPrioridad: "+bugs1.GETcalcularPrioridad());
        
        System.out.println("\n");
        System.out.println("");
        System.out.println("Sigue el nieto de Tarea Base");
        System.out.println("Sigue ek hijo bugs");
         BugSeguridad bs = new BugSeguridad ("B-01", "Prueba 1B", 
                 true, "Production", "CVE-1",true);
        
    }//end main
    
}//end class
