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
public class Perro extends Mamifero{
    private String raza;
    private String promedioVida;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPromedioVida() {
        return promedioVida;
    }

    public void setPromedioVida(String promedioVida) {
        this.promedioVida = promedioVida;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", promedioVida=" + promedioVida + '}';
    }
    
    
}
