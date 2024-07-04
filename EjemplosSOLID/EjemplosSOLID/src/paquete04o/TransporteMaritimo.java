/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author User
 */
public class TransporteMaritimo {
    
    private String cooperativaMaritima;
    public double tarifa;
    
    public void establecerCooperativaMaritima(String n){
        cooperativaMaritima = n;
    }
    
    public void establecerTarifa(){
        tarifa = 2.00 + 0.20;
    }
    
    public String obtenerCooperativaMarrtima(){
        return cooperativaMaritima;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
