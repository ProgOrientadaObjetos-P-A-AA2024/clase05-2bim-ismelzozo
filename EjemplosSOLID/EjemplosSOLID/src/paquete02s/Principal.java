/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02s;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Ciudad c = new Ciudad();
        c.establecerNombre("Loja");
        
        Ciudad c1 = new Ciudad();
        c1.establecerNombre("Catamayo");
        
        Persona persona1 = new Persona("René", 39, c);
        Persona persona2 = new Persona("Santiango", 20, c1);
        
        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(persona1);
        miLista.add(persona2);
        op1.establecerEstudiante(miLista);
        op1.establecerPromedioEdades();
        op1.establecerEdadminima();
        op1.establecerEdadmaxima();
        op1.establecerListaCiudadesEstudiantes();
        
        System.out.printf("%s\n", op1);
    }
}
