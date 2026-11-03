/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author bonil
 */
public class Bugs extends TareaBase{
    private String entorno;
    
    
    public Bugs(String idTicketHijo, String tituloHijo, 
            boolean resueltoHijo, String entorno){
        super (idTicketHijo, tituloHijo, resueltoHijo);
        this.entorno = entorno;
    }//end constructor 

@Override
public int GETcalcularPrioridad (){
    if (this.entorno.equals("Produccion")) {    
        return 3; 
    }
    else{
        return 2;
     }
}

}//end class
