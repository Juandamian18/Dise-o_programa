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

    private double totalFijo;

    public Carnivoros(double totalFijo, String nombre) {
        super(nombre);
        this.totalFijo = totalFijo;
    }
   
     
}
