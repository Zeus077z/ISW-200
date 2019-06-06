/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.ac.cr.videojuego;

/**
 *
 * @author Daniel
 */
public class Personajes {
    private String nombre;
    private int energia;

    public Personajes(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }
    public void alimentarse(int energiaNueva){
        energia = energia + energiaNueva;
    }
    public void consumirEnerg(int gastoEnerg){
        energia = energia + gastoEnerg;
    }
    
    
}
