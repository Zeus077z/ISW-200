

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Trabajo extends Persona {
    private int horas;
    private int rangoSalario;

  

    public int getRangoSalario() {
        return rangoSalario;
    }

    public void setRangoSalario(int rangoSalario) {
        this.rangoSalario = rangoSalario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        String info = String.format("%s, Horas %d, Salario %d",super.toString(),horas,rangoSalario);
        return info;
    }
    
    

    
    
    
}
