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

    private ArrayList<Animal> animales = new ArrayList<Animal>();
    private ArrayList<Veterinario> veterinarios = new ArrayList<Veterinario>();
    private ArrayList<Especie> especies = new ArrayList<Especie>();

    public static String[] Nombre = new String[]{
        "Luis De Chazal", "Maria Elena Molina", "Sofia Bravo Cordoba"
    };
    public static int[] codigo = new int[]{
        1, 2, 3, 4
    };
    public static String[] telefono = new String[]{
        "Sector 1", "Sector 2", "Sector 3", "Sector 4"
    };

    public void llenarVeterinario() {

        for (int i = 0; i < 3; i++) {

            Veterinario vet = new Veterinario(codigo[i], Nombre[i], telefono[i]);
            veterinarios.add(vet);

        }
    }
    
    public void mostrarVeterinarios(){
    
        for (Veterinario veterinario : veterinarios) {
            System.out.println(veterinario.getNombre());
            
        }
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

}
