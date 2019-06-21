/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.damas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Damas {
//Se incializa la matriz de JLabel para el juego
    private final JLabel [][] espacios;
    public boolean verificacion = false;
    static boolean ganador= false;
    boolean color = false;
    
    public Damas(){
        this.espacios = new JLabel [8][8];
        for (JLabel[] espacio : this.espacios) {
            for (int j = 0; j < this.espacios.length; j++) {
                espacio[j] = new JLabel("");
            }
        }
    }
    public JLabel[][] getMatriz(){
        return this.espacios;
    }
 
}


