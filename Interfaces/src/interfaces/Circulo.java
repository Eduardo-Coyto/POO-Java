
package interfaces;

/*
Las clases pueden heredar de múltiples interfaces.
Al heredarlas, estan obligadas a cumplir con los métodos que se plantea cada interfaz.
*/
public class Circulo implements Figura, Dibujable, Rotable {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

          
    @Override
    public double calcularArea() {
       double pi = 3.14;
       return pi * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }
    
}
