/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author bonil
 */
public class BugSeguridad extends Bugs{
    private String codigoCVE; 
    private boolean datosExpuestos; 
    
    
    public BugSeguridad (String idTicketNieto, String TituloNieto, 
             boolean resueltoNieto, String entornoHijo, String codigoCVE,
            boolean datosEXP){
        super(idTicketNieto, TituloNieto, resueltoNieto, entornoHijo);
        this.codigoCVE = codigoCVE;
        this.datosExpuestos = datosEXP;

}
}//end class BugSeguridad
