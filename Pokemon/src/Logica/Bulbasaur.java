
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

public class Bulbasaur extends Pokemon implements IPlanta   {

    public Bulbasaur() {
    }

    
    @Override
    protected void atacarPlacaje() {
        
        System.out.println("Soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
    
        System.out.println("Soy Bulbasaur y este es mi ataque arañazo");    
    
    }

    @Override
    protected void atacarMordisco() {
    
        System.out.println("Soy Bulbasaur y este es mi ataque mordisco");    
    
    }

    @Override
    public void atacarDrenaje() {

        System.out.println("Soy Bulbasaur y este es mi ataque drenaje");    
    }

    @Override
    public void atacarParalizar() {

        System.out.println("Soy Bulbasaur y este es mi ataque paralizar");    
    }
    
}
