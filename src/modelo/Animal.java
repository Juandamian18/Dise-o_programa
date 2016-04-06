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
public class Animal {
    
    private int edad;
    private String lugarDeOrigen;
    private double peso;
    private Veterinario vet;
    private Sector sec;
    private Especie esp;
    private int id;

    public Animal(int edad, String lugarDeOrigen, double peso, Veterinario vet, Sector sec, Especie esp, int id) {
        this.edad = edad;
        this.lugarDeOrigen = lugarDeOrigen;
        this.peso = peso;
        this.vet = vet;
        this.sec = sec;
        this.esp = esp;
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    public void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public Sector getSec() {
        return sec;
    }

    public void setSec(Sector sec) {
        this.sec = sec;
    }

    public Especie getEsp() {
        return esp;
    }

    public void setEsp(Especie esp) {
        this.esp = esp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
