/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimales;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Daniel
 */

public class Logica {
    protected LinkedList<Animal> animales;

    public Logica() {
        animales = new LinkedList<>();
        cargarAnimales();
    }
    public void guardar(Animal a){
        animales.add(a);
    }
    public int total() {
        return animales.size();
    }
    public void mostrarMiLista(LinkedList list){

        if(list.isEmpty()){
            System.out.println("La lista está vacia");
            return;
        }
        Iterator it = list.iterator();

         System.out.println("Los elementos de la lista son:");
         while(it.hasNext())
         {
           System.out.println(it.next().toString());
         }
    }
    public float porMamiferos() {
        int con = 0;
        for (Animal animal : animales) {           
            if(animal instanceof Mamifero) {
                con++;
            }
        }
        return con * 100f / animales.size();
    }
    public float porReptiles() {
        int con = 0;
        for (Animal animal : animales) {           
            if(animal instanceof Reptil) {
                con++;
            }
        }
        return con * 100f / animales.size();
    }
    public float porPerros() {
        int con= 0;
        for (Animal animal : animales) {           
            if(animal instanceof Perro) {
                con++;                          
        }                  
    }
         return con * 100f / animales.size();
    }
    public float porGatos() {
        int con= 0;
        for (Animal animal : animales) {           
            if(animal instanceof Gato) {
                con++;                          
        }                  
    }
         return con * 100f / animales.size();
    }
    public float porHumanos() {
        int con= 0;
        for (Animal animal : animales) {           
            if(animal instanceof Humano) {
                con++;                          
        }                  
    }
         return con * 100f / animales.size();
    }
    public float porCocodrilos() {
        int con= 0;
        for (Animal animal : animales) {           
            if(animal instanceof Cocodrilo) {
                con++;                          
        }                  
    }
         return con * 100f / animales.size();
    }
    public float porSerpientes() {
        int con= 0;
        for (Animal animal : animales) {           
            if(animal instanceof Serpiente) {
                con++;                          
        }                  
    }
         return con * 100f / animales.size();
    }
     private void cargarAnimales() {
        for (int i = 0; i < 7; i++) {
            animales.add(new Gato());
            animales.add(new Perro());
            animales.add(new Perro());
            animales.add(new Cocodrilo());
            animales.add(new Serpiente());
            animales.add(new Hombre());
            animales.add(new Mujer());        
        }
     }
    
   
    
     
}
