/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacentral;

/**
 *
 * @author bonil
 */
public class DronCargaAmbiental extends SistemaBase{
    //Atributos
    private double cargaMaxima; 
    private double cargaActual; 
    
    public DronCargaAmbiental (String numeroSerie, 
            int estadoEnergia, boolean vinculado, 
            double cargaMaxima){
        super(numeroSerie, estadoEnergia, vinculado);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = 0;
    }

    //GET 
    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }
    
    
    public boolean EvaluarPesoObjeto(double pesoNuevo){
        return (cargaActual + pesoNuevo) > cargaMaxima; 
        
    }   
     public void EngancharDesecho(double pesoNuevo) {
        if (EvaluarPesoObjeto(pesoNuevo)) {
            System.out.printf("Maniobra abortadadel dron %S: objeto de %.2fkg demasiado pesado."
                    ,getNumeroSerie(),pesoNuevo);
        } else {
            cargaActual += pesoNuevo;
            System.out.printf("El dron %S se0 desecho %.2f kg recolectado. Carga actual: %.2fkg."
                    ,getNumeroSerie(), pesoNuevo, cargaActual);
        }
    }
    public void descargarContenedorBase() {
        cargaActual = 0;
        System.out.println("Contenedor vaciado del %S. Carga actual: 0 kg.");
        
    }
}//end class Dron carga
