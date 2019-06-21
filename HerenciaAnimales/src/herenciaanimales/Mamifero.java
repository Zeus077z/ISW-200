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
public class Mamifero extends Animal{
    private int extremidades;
    private String habilidad;

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "extremidades=" + extremidades + ", habilidad=" + habilidad + '}';
    }
    
}
  
   


    


    
    

