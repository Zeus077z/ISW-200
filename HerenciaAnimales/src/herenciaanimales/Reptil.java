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
public class Reptil extends Animal{
    private String alimentacion;
    private boolean extremidades;

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public boolean isExtremidades() {
        return extremidades;
    }

    public void setExtremidades(boolean extremidades) {
        this.extremidades = extremidades;
    }
    

    
    @Override
    public String toString() {
        return "Reptil{" + "alimentacion=" + alimentacion + ", extremidades=" + ((extremidades==false) ? "No posee" : "Si tiene")+'}';
    }

   
        
    
}
