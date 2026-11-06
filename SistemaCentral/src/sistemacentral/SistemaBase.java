/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacentral;

/**
 *
 * @author bonil
 */
public class SistemaBase {
    //Atributos
    private String numeroSerie;
    private int nivelEnergia;
    private boolean vinculacion; 
    
    //Constructor
    public SistemaBase(String numeroSerie, int nivelEnergia, boolean vinculacion){
        this.numeroSerie = numeroSerie;
        setNivelEnergia(nivelEnergia);
        this.vinculacion = vinculacion;
    }//end constructor SistemaBase

    //GET Y SET 
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        if (nivelEnergia >= 0 && nivelEnergia <= 100) {
            this.nivelEnergia = nivelEnergia;        
        }
        else{
            System.out.println("Nivel de energia invalida");
        } 
    }

    public boolean getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(boolean vinculacion) {
        this.vinculacion = vinculacion;
    }

    //metodos intocables 
    private void CalibrarGiroscopioInterno(){
        System.out.printf("El giroscopio de %S ha sido calibrado",this.numeroSerie);    
    }
    
    public void TransmitirEstadoRed() {
    System.out.printf("Serie: %s%n", this.numeroSerie);
    System.out.printf("Nivel de bateria: %d%%%n", this.nivelEnergia);
    System.out.println("En linea: " + (this.vinculacion ? "Si" : "No"));
}
}//end class
