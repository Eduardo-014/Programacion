/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacentral;

import java.util.Random;

/**
 *
 * @author bonil
 */
public class SistemaCentral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();

        DronReconocimientoTactico[] escuadronTactico = new DronReconocimientoTactico[3];
        DronCargaAmbiental[] escuadronPesado = new DronCargaAmbiental[2];

        escuadronTactico[0] = new DronReconocimientoTactico("REC-001", 90, true);
        escuadronTactico[1] = new DronReconocimientoTactico("REC-002", 75, true);
        escuadronTactico[2] = new DronReconocimientoTactico("REC-003", 60, false);
        escuadronPesado[0] = new DronCargaAmbiental("CAR-001", 85, true, 50.0);
        escuadronPesado[1] = new DronCargaAmbiental("CAR-002", 70, true, 80.0);

        System.out.println("\n---- Escuadron tactico ----");
        for (int i = 0; i < escuadronTactico.length; i++) {
            escuadronTactico[i].GenerarMapeoEstocastico();
            escuadronTactico[i].AnalizarAmenazas();
        }//end  para ford
        
        System.out.println("\n------- Escuadron pezaso ----");
        for (int i = 0; i < escuadronPesado.length; i++) {
            double pesoAleatorio = 1 + rnd.nextInt(100); 
            escuadronPesado[i].EngancharDesecho(pesoAleatorio);
            escuadronPesado[i].descargarContenedorBase();
        }//end para ford

        System.out.println("------- Desgaste post-mision----");
        for (int i = 0; i < escuadronTactico.length; i++) {
            int desgaste = rnd.nextInt(121); 
            escuadronTactico[i].setNivelEnergia(escuadronTactico[i].getNivelEnergia() - desgaste);
        }
        for (int i = 0; i < escuadronPesado.length; i++) {
            int desgaste = rnd.nextInt(121);
            escuadronPesado[i].setNivelEnergia(escuadronPesado[i].getNivelEnergia() - desgaste);
        }
        
        System.out.println("\n---- Telemetria final-----");
        for (int i = 0; i < escuadronTactico.length; i++) {
            escuadronTactico[i].TransmitirEstadoRed();
        }
        for (int i = 0; i < escuadronPesado.length; i++) {
            escuadronPesado[i].TransmitirEstadoRed();
        }

    }
    
}// end class
