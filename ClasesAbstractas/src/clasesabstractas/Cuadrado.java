
package clasesabstractas;

public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
        
    /*
    Como la clase Cuadrado hereda de la clase Figura que ademas es abstracta si o si debe tener un método abstracto
    Si nos posicionamos en la palabra Cuadrado y hacemos alt+enter podemos implementar el método abstracto
    Por defecto nos aparece el método @Override, el cual significa que tiene el mismo método que la clase padre pero lo implementa de forma distina.
    */
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    
    }
}
