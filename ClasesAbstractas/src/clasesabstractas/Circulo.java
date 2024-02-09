
package clasesabstractas;

public class Circulo extends Figura {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    
    /*
    Como la clase Cuadrado hereda de la clase Figura que ademas es abstracta si o si debe tener un método abstracto
    Si nos posicionamos en la palabra Cuadrado y hacemos alt+enter podemos implementar el método abstracto
    Por defecto nos aparece el método @Override, el cual significa que tiene el mismo método que la clase padre pero lo implementa de forma distina.
    */
    @Override
    public double calcularArea() {
       double pi = 3.14;
       return pi * radio;
    }
    
}
