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
public class Serpiente extends Reptil {
    private boolean venenosa;
    private int longitudCentimetros;

    

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public int getLongitudCentimetros() {
        return longitudCentimetros;
    }

    public void setLongitudCentimetros(int longitudCentimetros) {
        this.longitudCentimetros = longitudCentimetros;
    }

    @Override
    public String toString() {
        return "Serpiente{" + "venenosa=" + ((venenosa==false)? "No es venenosa" : "Es venenosa") + ", longitudCentimetros=" + longitudCentimetros + '}';
    }
    
}
