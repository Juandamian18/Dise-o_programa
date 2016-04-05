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
class Sector {
    
    private double latitud;
    private double longitud;
    private int codigo;

    public Sector(double latitud, double longitud, int codigo) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.codigo = codigo;
    }

    public Sector() {
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
