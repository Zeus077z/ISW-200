/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimales;

/**
 *
 * @author Daniel
 */
public class Hombre extends Humano {
    private String nombre;
    private boolean visibleNuezAdan;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisibleNuezAdan() {
        return visibleNuezAdan;
    }

    public void setVisibleNuezAdan(boolean visibleNuezAdan) {
        this.visibleNuezAdan = visibleNuezAdan;
    }

    @Override
    public String toString() {
        return "Hombre{" + "nombre=" + nombre + ", visibleNuezAdan=" + ((visibleNuezAdan==false)? "No es visible" : "Es visible") + '}';
    }
    
}
