/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author bonil
 */
public class TareaBase {
    //atributos
    private String idTicket;
    private String titulo; 
    protected boolean resuelto; 
    
    //constrcucto
    public TareaBase(String idTicket, String titulo, boolean resuelto){
    this.idTicket = idTicket;
    this.titulo = titulo;
    this.resuelto = resuelto;
    }//end constructor tara base
    
    public void marcaResuelto(){
        this.resuelto = true; 
        System.out.printf("El ticket %s ha sido cerrado\n", this.idTicket);
        System.out.printf("Nombre ticket %s\n", this.titulo);  
    }//end marcaResuelto 
    
    public int GETcalcularPrioridad (){
     return 1; 
    }//end clacularPrioridad
    
    
}//end class
