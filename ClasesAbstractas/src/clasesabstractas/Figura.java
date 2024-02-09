
package clasesabstractas;

public abstract class Figura {
    
    protected double x; // posición en X
    protected double y; // posición en Y
    
    /*
    la clase Figura es abstracta por lo tanto NO PUEDE SER INSTANCIADA pero sus hijos sí pueden ser instanciados y 
    van a necesitar de los valores de "x" e "y"
    
    En una clase abstracta pueden existir constructores y únicamente pueden ser utilizados por sus clases hijas.
    */

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
       
    
    /*
    En una clase abstracta SIEMPRE debe ir al menos un método abstracto
    Un método abstracto significa que va a ir implementado el método pero sin código.
    En este caso vamos a implementar el método calcularArea sin ningún código dentro.
    Lo importante es que sin importar la clase que herede de Figura algún calculo de área va a realizar sin importar si es un cuadrado, triángulo o rombo.
    */
    
    public abstract double calcularArea();
    
}
