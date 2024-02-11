

package com.mycompany.arraylist;

import java.util.List;
import java.util.ArrayList;

public class LinkedList {

    public static void main(String[] args) {
       
        List<Persona> lista = new ArrayList<Persona>();
        
        lista.add(new Persona(1, "Eduardo", 36));
        lista.add(new Persona(2, "Valentina", 30));
        
        System.out.println("------For----");
        //recorrer por indice
        for(int i=0; i<lista.size(); i++){
            System.out.println("Prueba: "+ lista.get(i).getNombre());
        }
        
        /*
        Recorrer con foreach
        Por cada Pesona que este dentro de la lista
        */
        
        System.out.println("------ForEach----");

        for(Persona perso:lista){
            System.out.println("Pueba: " + perso.getNombre());
        }
    }
}
