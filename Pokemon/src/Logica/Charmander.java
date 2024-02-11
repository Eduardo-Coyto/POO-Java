
package Logica;
/*
Las clases deben tener:
 - Atributos
 - Constructores
 - Getters & Setters
 - Métodos

En este caso la clase hereda de de la clase abstracta Pokemon los atributos y métodos abstractos,
a su vez también hereda de la interfaz correspondiente los métodos abstractos.

*/

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    
    @Override
    protected void atacarPlacaje() {
 
        System.out.println("Soy Chramander y este es mi ataque placaje");    
    }

    @Override
    protected void atacarAraniazo() {
 
        System.out.println("Soy Chramander y este es mi ataque placaje");    
    }

    @Override
    protected void atacarMordisco() {

        System.out.println("Soy Chramander y este es mi ataque placaje");    
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Chramander y este es mi ataque puño de fuego");    
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Chramander y este es mi ataque lanza llamas");    
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Chramander y este es mi ataque ascuas");    
    }
    
}
