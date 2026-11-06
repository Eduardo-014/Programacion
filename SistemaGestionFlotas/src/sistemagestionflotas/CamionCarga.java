/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflotas;

/**
 *
 * @author bonil
 */
public class CamionCarga extends VehiculoBase implements IConducible{
    //Atricutos
    private double capacidadCarga; 
    
    //COnstructor
    public CamionCarga(String marca, int preico, double capacidad){
        super (marca, precio);
        this.capacidadCarga = capacidad;
    }
    
    //GET Y SET
    public void setCapacidadCarga(){
        return capacidadCarga;
    }
    
    public void setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga < 0) {
            this.capacidadCarga = 0.0;
            System.out.println("Valor no permitido como capacidad carga")
        }
        else{
            this.capacidadCarga = capacidadCarga;
        }
    }
    
    @Override
    
    @Override
    public void cargarBateria (int horas){
        System.out.println("Conectando %s a la red de la ENEE", getMarca());
        System.out.println("Tiempo estimado de carga %d", horas);
    }
    
    @Override 
    
    public void encenderMotor(String tipoLlave){
        System.out.println("Calentadores Listos. Encender. ");
        System.out.println("La llave es: "+tipoLlave);
        this.enMovimiento + true; 
    }
    
    @Override
    public void mostrarDatosVehiculo(){
        revisarSistemasInternos();
        System.out.println("Precio: %s\n", getprecio());
        System.out.println("Marca: %s\n", getMarca());
        System.out.println("Capacidad de carga: %.2f\n", getCapacidadCarga());
}
