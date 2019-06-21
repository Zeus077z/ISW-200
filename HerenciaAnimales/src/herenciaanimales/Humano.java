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
public class Humano extends Mamifero{
    private String OrientacionSexual;
    private String Alimentacion;

    public String getOrientacionSexual() {
        return OrientacionSexual;
    }

    public void setOrientacionSexual(String OrientacionSexual) {
        this.OrientacionSexual = OrientacionSexual;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    @Override
    public String toString() {
        return "Humano{" + "OrientacionSexual=" + OrientacionSexual + ", Alimentacion=" + Alimentacion + '}';
    }
    
    
}
