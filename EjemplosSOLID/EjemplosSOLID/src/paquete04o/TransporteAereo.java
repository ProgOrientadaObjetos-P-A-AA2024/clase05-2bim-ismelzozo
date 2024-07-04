/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author User
 */
public class TransporteAereo {
    private String cooperativaAereo;
    public double tarifa;
    

    public void establecerCooperativaAereo(String n) {
        cooperativaAereo = n;
    }
    public void establecerTarifa(){
        tarifa = 2.00 + 0.20;
    }
    
    public String obtenerCooperativaAerero(){
        return cooperativaAereo;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
