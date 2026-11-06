/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionflotas;

import java.util.Scanner;

/**
 *
 * @author bonil
 */
public class SistemaGestionFlotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in);
        
        int capacidad; 
        
        VehiculoBase [] flota = new VehiculoBase[5];
        
        do {
            System.out.println("Menu Interativo");
            System.out.println("1.Registrar auto electiroco ");
            System.out.println("2.Registrar camion carga ");
            System.out.println("3.Mostrar flota ");
            System.out.println("4.Salir");
            int seleccion = sc.nextInt();
            switch  (seleccion){
                case 1
                      System.out.println("Registro de auto electrico");
                      System.out.println("Ingrese la marca: ");
                      marca = sc.nextLine().toUpperCase(); 
                      System.out.println("Ingrese el el precio: ");
                      precio = SC.nextDouble();
                      System.out.println("Ingrese el nivel de bateria: ");
                      bateria = sc.nextInt();
                      
                      flota[contador] = new AutoElectrico(marca, precio, bateria);
                      contador++;
                      System.out.println("Auto Registrado!!");
                      break; 
                case 2 
            
            }
            
        } while (true);
        
    }
    
}
