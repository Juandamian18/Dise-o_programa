/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Veterinario;
import modelo.Zoologico;
import vista.VAgregarAnimales;
import vista.VPrincipal;

/**
 *
 * @author Damian
 */
public class Controlador implements ActionListener {

    private VPrincipal vista;
    private Zoologico zoologico;
    private VAgregarAnimales vAgregarAnimales;

    public Controlador() {
        vista = new VPrincipal();
        zoologico =  new Zoologico();
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
            vAgregarAnimales.llenarComboBox(zoologico.getVeterinarios());
            vAgregarAnimales.ejecutar();

        }
    }

}
