package com.mycompany.stacks;

import java.util.Stack;

public class Stacks {
    // tambien conocidas como pilas
    
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();
        
        //Los Stack "pila" cumple con el modelo LIFO last in first out
        System.out.println("Lista vacia: " + pila);
        System.out.println("¿Está vacia? " + pila.isEmpty());
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //recorrido
        for(Integer pilita:pila){
            System.out.println(pilita);
        }
        
        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("¿Está la pila vacia? " + pila.isEmpty());
        
        
        //eliminar el último registro que entro
       pila.pop();
       //con search si devuelve un num positivo es true y si devuelve un num negativo es false
        System.out.println("¿Está el num 3? " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());
        
        
        
    }
    
}
