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
public class Guerreros extends Personajes{

    public String getArma() {
        return arma;
    }
    private String arma;
    
    public Guerreros(String nombre, int energia, String arma){
        super(nombre, energia);
        this.arma = arma;
    }
    public String combatir(int energia){
        actualizaEnerg(-1*energia);;
        return arma + energia;
    }

    private void actualizaEnerg(int i) {
        System.out.println(i);
    }
    
}
