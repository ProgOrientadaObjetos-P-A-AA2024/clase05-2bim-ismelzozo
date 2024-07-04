/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03o;

import paquete04o.TransporteMaritimo;
import paquete04o.TransporteAereo;

/**
 *
 * @author reroes
 */
public class TiposTransporte {
    private double promedioTarifas;
    private TransporteTaxi ttaxi;
    private TransporteBus ttbus;
    private TransporteTransvia transvia;
    private TransporteAereo aereo;
    private TransporteMaritimo maritimo;
    
    public void establecerTransporteTaxi(TransporteTaxi taxi){
        ttaxi = taxi;
    }
    
    public void establecerTransporteBus(TransporteBus bus){
        ttbus = bus;
    }
    
    public void establecerTransporteTransvia(TransporteTransvia t){
        transvia = t;
    }
    
    public void establecerTransporteAereo(TransporteAereo a){
        aereo = a;
    }
    
    public void establecerTransporteMaritimo(TransporteMaritimo m){
        maritimo = m;
    }
    
    public TransporteAereo obtenerTransporteAerero(){
        return aereo;
    }
    
    public TransporteMaritimo obtenerTransporteMeritimo(){
        return maritimo;
    }
    
    public TransporteTaxi obtenerTransporteTaxi(){
        return ttaxi;
    }
    
    public TransporteBus obtenerTransporteBus(){
        return ttbus;
    }
    
    public TransporteTransvia obtenerTransporteTransvia(){
        return transvia;
    }
    
    public void establecerPromedioTarifas(){
        promedioTarifas = (obtenerTransporteBus().obtenerTarifa() + 
                obtenerTransporteTaxi().obtenerTarifa() + 
                obtenerTransporteTransvia().obtenerTarifa())/3;
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    
}
