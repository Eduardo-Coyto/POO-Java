

package com.mycompany.arraylist;

import java.util.List;
import java.util.LinkedList;

public class ArrayList {

    public static void main(String[] args) {
       
        List<Persona> lista = new LinkedList<Persona>();
        
        lista.add(new Persona(1, "Eduardo", 36));
        lista.add(new Persona(2, "Valentina", 30));
        
        //Agregar al principio
        lista.add(0, new Persona(5, "Paco", 64));
           
        /*
        Sólo se puede recorrer con foreach dado que no tienen un indice definido
        Estan pensada para verse registro por registro y no por un indice en particular.
        Se cumple el sistema FIFO first in first out
        */
        
        System.out.println("------ForEach----");

        for(Persona perso:lista){
            System.out.println("Pueba: " + perso.getNombre());
        }
        
        
    }
}
