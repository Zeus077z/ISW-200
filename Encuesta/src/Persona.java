
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
    public static int PersonasTrabajan;
    public static int PersonasNoTrabajan;
    protected static int CantPersonas;
    protected static int feme;
    protected static int mascu;
    protected static int femeT;
    protected static int mascuT;

    public static int getCantPersonas() {
        return CantPersonas;
    }

    public static void setCantPersonas(int CantPersonas) {
        Persona.CantPersonas = CantPersonas;
    }
     
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPersonasTrabajan() {
        return PersonasTrabajan;
    }

    public void setPersonasTrabajan(int PersonasTrabajan) {
        this.PersonasTrabajan = PersonasTrabajan;
    }

    public int getPersonasNoTrabajan() {
        return PersonasNoTrabajan;
    }

    public void setPersonasNoTrabajan(int PersonasNoTrabajan) {
        this.PersonasNoTrabajan = PersonasNoTrabajan;
    }
    
    
    @Override
    public String toString() {
        return "Persona{" + "genero=" + genero + ", personas=" +Persona.CantPersonas + ", PersonasTrabajan=" + PersonasTrabajan + ", PersonasNoTrabajan=" + PersonasNoTrabajan + '}';
    }
    

  
       
   
    

    
}
