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
public class Main {
    
    public static void main(String[] args) {
       Guerreros g = new Guerreros("Alfa",50,"Burbujas de jabón");
       g.combatir(2);
       System.out.println("El nivel de energia de "+g.getNombre()+" es "+g.getEnergia() + ", ataca con: "+g.getArma());
       
       Magos m1 =new Magos("Harry","Quemar");
       m1.encantar();
       System.out.println("El nivel de energia de "+m1.getNombre()+" es "+m1.getEnergia()+", poder: "+m1.getPoder());
       
    }
    
}
