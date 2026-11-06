/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflotas;

/**
 *
 * @author bonil
 */
public class AutoElectrico extends VehiculoBase implements IConducible, IElectrico{
    //Atributos
    private int nivelBateria; 
    
    
    //Construcotr 
    public AutoElectrico(String marca, double precio, int bateria ){
        super(marca, precio);
        this.nivelBateria = bateria;
    }//end constructor 
    
    
    //GET Y SET
    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <=100) {
            this.nivelBateria = nivelBateria;
            
        }
        else{
            System.out.println("Valor no posible en bateria");
            this.nivelBateria = 0;
        }
       
    }//end set nivel de bateria
    
    //Metodos
    @Override
    public void cargarBateria (int horas){
        System.out.println("Conectando %s a la red de la ENEE", getMarca());
        System.out.println("Tiempo estimado de carga %d", horas);
    }
    
    @Override 
    
    public void encenderMotor(String tipoLlave){
        System.out.println("Encendiendo el carro electrico. ");
        System.out.println("La llave es: "+tipoLlave);
        this.enMovimiento + true; 
    }
    
    @Override
    public void mostrarDatosVehiculo(){
        revisarSistemasInternos();
        System.out.println("Precio: %s\n", getprecio());
        System.out.println("Marca: %s\n", getMarca());
        System.out.println("Carga de Bateria: %s\n", getNivelBateria());
    }
    
    
    
}//end class AutoelEctrico
