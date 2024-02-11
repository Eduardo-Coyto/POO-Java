
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

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    
    @Override
    protected void atacarPlacaje() {
       
        System.out.println("Soy Pikchu y este es mi ataque placaje");    
    }

    @Override
    protected void atacarAraniazo() {
        
        System.out.println("Soy Pikchu y este es mi ataque placaje");    
    }
    

    @Override
    protected void atacarMordisco() {
  
 
        System.out.println("Soy Pikchu y este es mi ataque placaje");    
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikchu y este es mi ataque impactrueno");    
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikchu y este es mi ataque puño trueno");    
    }
    
    
    
}
