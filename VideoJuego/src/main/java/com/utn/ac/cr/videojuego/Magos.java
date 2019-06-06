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
public class Magos extends Personajes {

    public String getPoder() {
        return poder;
    }
    private String poder;

    public Magos(String nombre, String poder) {
        super(nombre,100);
        this.poder = poder;
    }
    public String encantar(){
        actualizaEnerg(-2);
        return poder;
    }

    private void actualizaEnerg(int i) {
        System.out.println(i);
    }

   

    
}
