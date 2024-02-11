
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

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    
    @Override
    protected void atacarPlacaje() {

        System.out.println("Soy Squirtle y este es mi ataque placaje");    
    }

    @Override
    protected void atacarAraniazo() {
 
        System.out.println("Soy Squirtle y este es mi ataque placaje");    
    }

    @Override
    protected void atacarMordisco() {
 
        System.out.println("Soy Squirtle y este es mi ataque placaje");    
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y este es mi ataque hidrobomba");    
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y este es mi ataque burbuja");    
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y este es mi ataque pistola de agua");    
    }
    
}
