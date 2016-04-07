/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import modelo.Animal;
import modelo.Carnivoros;
import modelo.Especie;
import modelo.Herbivoros;
import modelo.Veterinario;
import modelo.Zoologico;
import vista.VAgregarAnimales;
import vista.VCalcularAlimento;
import vista.VPrincipal;

/**
 *
 * @author Damian
 */
public class Controlador implements ActionListener {

    private VPrincipal vista;
    private Zoologico zoologico;
    private VAgregarAnimales vAgregarAnimales;
    private VCalcularAlimento vCalcularAlimento;

    public Controlador() {
        vista = new VPrincipal();
        zoologico = new Zoologico();
        zoologico.inicializar();

    }

    public void ejecutar() {

        vista.setControlador(this);
        vista.ejecutar();

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals(vista.BOTON_AGREGAR_ANIMALES)) {
            vAgregarAnimales = new VAgregarAnimales();
            vAgregarAnimales.setControlador(this);
            vAgregarAnimales.llenarComboBox(zoologico.veterinarios, zoologico.sectores, zoologico.especies);
            vAgregarAnimales.ejecutar();

        }

        if (event.getActionCommand().equals(vAgregarAnimales.BOTON_ACEPTAR_AGREGAR)) {

            Animal a = new Animal(vAgregarAnimales.getEdad(), vAgregarAnimales.getLugar(), vAgregarAnimales.getPeso(),
                    vAgregarAnimales.getVeterinario(), vAgregarAnimales.getSector(), vAgregarAnimales.getEspecie(), vAgregarAnimales.getCodigo());
            zoologico.animales.add(a);
            showMessageDialog(null, "Animal Agregado con Exito");

        }

        if (event.getActionCommand().equals(vista.BOTON_CALCULAR_ALIMENTOS)) {

            vCalcularAlimento = new VCalcularAlimento();
            vCalcularAlimento.setControlador(this);
            vCalcularAlimento.ejecutar();

        }

        if (event.getActionCommand().equals(vCalcularAlimento.BOTON_ACEPTAR_CALCULAR)) {

            double totalComida = 0;
            Herbivoros h = new Herbivoros("");
            Carnivoros car = new Carnivoros("");

            for (Animal a : zoologico.animales) {
                

                for (Especie c : zoologico.especies) {
                    

                    if (c.getClass().equals(Herbivoros.class)) {
                        h = (Herbivoros) c;

                        totalComida = totalComida + h.calcularComidaHerbivoros(vCalcularAlimento.getDias(), a.getPeso());

                    }

                    if (c.getClass().equals(Carnivoros.class)) {
                        car = (Carnivoros) c;

                        totalComida = totalComida + car.calcularComidaCarnivoros(vCalcularAlimento.getDias(), a.getPeso());

                    }
                }

            }

            showMessageDialog(null, "La cantidad de comida que tiene que comprar es: "+ totalComida +"KG");
            System.out.println(totalComida);
        }
    }

}
