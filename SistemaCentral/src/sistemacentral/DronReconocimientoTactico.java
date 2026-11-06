


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacentral;

import java.util.Random;

/**
 *
 * @author bonil
 */
public class DronReconocimientoTactico extends SistemaBase{
    
    private int[] cuadrantes = new int[7]; 
    public DronReconocimientoTactico (String numeroSerie, int estadoEnergia, boolean vinculacion){
        super(numeroSerie, estadoEnergia, vinculacion);
       
    }//end constructor
    
    //metodos
    public void GenerarMapeoEstocastico (){
        Random rnd = new Random();
        for (int i = 0; i < cuadrantes.length; i++) {
            cuadrantes[i] = rnd.nextInt(51);   
        }
        System.out.printf("Mapeo generado de la unidad %S",getNumeroSerie());
    }
  
    public void AnalizarAmenazas(){
        for (int i = 0; i < cuadrantes.length; i++) {
            if (cuadrantes[i] > 35) {
                EmitirAlertaIncendio();
                return;
            }
            
        }
        System.out.println("Sin amenazas detectadas");
    
    }
    private void EmitirAlertaIncendio(){
        System.out.println("Alerta, posible incendio en el sector");
    }
}//end class
