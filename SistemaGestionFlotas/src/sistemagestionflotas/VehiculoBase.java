/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflotas;

/**
 *
 * @author bonil
 */
public class abstract VehiculoBase {
    //Atributos
    private String marca; 
    private double precio;
    protected boolean  enMovimiento; 
    
    //COnstructor
    public VehiculoBase(String marca, double precio){
        setMarca(marca);
        setPrecio(precio);
        this.enMovimiento = false;
    }//end Constructor 
    
    
    
    
    //GET Y SET
    public String getMarca(){
        return marca; 
    }//end getMarca
    
    public void setMarca(String marca){
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("MarcaINvalida.. no se reconoce ");
            this.marca = "Sin Marca";    
        }
        else{
            this.marca = marca;
        }
    }//end set marca
    
    public double getPrecio(){
        return precio; 
    }//end getPrecio
    
    public void setPrecio (double precio){
        if (precio<1000) {
            System.out.println("Advertencia>.... precio no valido");
            System.out.println("Se asigna 1000");
        }
        else {
            this.precio = precio;
        }
    }//end setPrecio 
    
    //Metodos
    protected void revisarSistemasInternos(){
        System.out.println("REvisar sistemas del vehiculo");
    }//revisarSistemasInternos
    
    public abstract void mostrarDarosVehiculo();
}//end class vehiculo base
