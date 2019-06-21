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
public class Cocodrilo extends Reptil {
    private String tipoAgua;
    private String paisMayorEjemplares;

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getPaisMayorEjemplares() {
        return paisMayorEjemplares;
    }

    public void setPaisMayorEjemplares(String paisMayorEjemplares) {
        this.paisMayorEjemplares = paisMayorEjemplares;
    }

    @Override
    public String toString() {
        return "Cocodrilo{" + "tipoAgua=" + tipoAgua + ", paisMayorEjemplares=" + paisMayorEjemplares + '}';
    }

   

    
    
}
