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
public class Animal {
    protected String habitat;
    protected String cualidad;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCualidad() {
        return cualidad;
    }

    public void setCualidad(String cualidad) {
        this.cualidad = cualidad;
    }

    @Override
    public String toString() {
        return "Animal{" + "habitat=" + habitat + ", cualidad=" + cualidad + '}';
    }
    
    
}

