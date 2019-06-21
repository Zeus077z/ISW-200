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
public class Mujer extends Humano{
    private double altura;
    private String tipoPelo;

    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String toString() {
        return super.toString()+" Mujer{" + "altura=" + altura + ", tipoPelo=" + tipoPelo + '}';
    }
    
    
}
