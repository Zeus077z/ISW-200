
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
public class Persona {
    protected String genero;
    protected LinkedList<Persona> linkedlist;

    public Persona(String genero, LinkedList<Persona> linkedlist) {
        this.genero = genero;
        this.linkedlist = linkedlist;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LinkedList<Persona> getLinkedlist() {
        return linkedlist;
    }

    public void setLinkedlist(LinkedList<Persona> linkedlist) {
        this.linkedlist = linkedlist;
    }
   
    
}
