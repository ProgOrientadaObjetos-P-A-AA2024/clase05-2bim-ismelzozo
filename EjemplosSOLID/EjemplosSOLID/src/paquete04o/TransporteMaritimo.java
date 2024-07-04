/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author User
 */
public class TransporteMaritimo extends Transporte{
    
    private String cooperativaMaritima;
    
    public void establecerCooperativaMaritima(String n){
        cooperativaMaritima = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 2.00 + 0.20;
    }
    
    public String obtenerCooperativaMarrtima(){
        return cooperativaMaritima;
    }
    
}
