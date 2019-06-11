
import java.util.LinkedList;

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
    private int rangoHoras;

    public Trabajo(int horas, int rangoHoras, String genero, LinkedList<Persona> linkedlist) {
        super(genero, linkedlist);
        this.horas = horas;
        this.rangoHoras = rangoHoras;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getRangoHoras() {
        return rangoHoras;
    }

    public void setRangoHoras(int rangoHoras) {
        this.rangoHoras = rangoHoras;
    }
    

    
    
    
}
