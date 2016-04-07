/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Damian
 */
public class Carnivoros extends Especie{

    private double porcentaje;

    public Carnivoros(double porcentaje, String nombre) {
        super(nombre);
        this.porcentaje = porcentaje;
    }

    public Carnivoros(String nombre) {
        super(nombre);
    }
    
    

    @Override
    public String toString() {
        return this.getNombre();
    }
   
    public double calcularComidaCarnivoros(int dias, double peso){
        
        double subto= peso * (porcentaje/100);
        
        return subto*dias;
    
    }
     
}
