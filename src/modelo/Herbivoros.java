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
public class Herbivoros extends Especie{
    
    private double totalFijo;

    public Herbivoros(double totalFijo, String nombre) {
        super(nombre);
        this.totalFijo = totalFijo;
    }

    public Herbivoros(String nombre) {
        super(nombre);
    }

    

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    public double calcularComidaHerbivoros(int dias, double peso){
        
        double subto= peso * 2 + totalFijo;
        
        return subto*dias;
    
    }
    
    
    
}
