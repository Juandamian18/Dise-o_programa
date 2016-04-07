/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class Zoologico {

    public static ArrayList<Animal> animales = new ArrayList<Animal>();
    public static ArrayList<Veterinario> veterinarios = new ArrayList<Veterinario>();
    public static ArrayList<Especie> especies = new ArrayList<Especie>();
    public static ArrayList<Sector> sectores = new ArrayList<Sector>();
    

    public void inicializar() {

        //Inicializar veterinario
        Veterinario v = new Veterinario(1, "Luis De Chazal", "+5438122122");
        Veterinario v1 = new Veterinario(2, "Maria Elena Molina", "+543812213");
        Veterinario v2 = new Veterinario(3, "Luis De Chazal", "+543813242");

        veterinarios.add(v);
        veterinarios.add(v1);
        veterinarios.add(v2);

        //Inicializar Especies
        
        Carnivoros c = new Carnivoros(300, "Leon");
        Carnivoros c1 = new Carnivoros(300, "Tigre");
        Carnivoros c2 = new Carnivoros(300, "Oso");
        Herbivoros h = new Herbivoros(20, "Jirafa");
        Herbivoros h1 = new Herbivoros(10, "Camello");
        Herbivoros h2 = new Herbivoros(15, "Rinoceronte");
        
        especies.add(c);
        especies.add(c1);
        especies.add(c2);
        especies.add(h);
        especies.add(h1);
        especies.add(h2);
        
        //Inicializar sectores
        
        Sector s = new Sector(10, 30, 1);
        Sector s1 = new Sector(45, 56, 2);
        Sector s2 = new Sector(10, 36, 3);
        
        sectores.add(s);
        sectores.add(s1);
        sectores.add(s2);
        
    }

    public void mostrarVeterinarios() {

        for (Veterinario veterinario : veterinarios) {
            System.out.println(veterinario.getNombre());

        }
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }
     

}
