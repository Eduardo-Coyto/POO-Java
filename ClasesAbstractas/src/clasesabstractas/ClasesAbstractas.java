
package clasesabstractas;


public class ClasesAbstractas {
    
    /*
    ¿Por qué static?
    Este modificador significa que el método pertenece a la clase en lugar de pertenecer 
    a una instancia particular de la clase. Esto significa que puedes llamar al método
    directamente desde la clase, sin necesidad de crear un objeto de esa clase. 
    En el contexto del método main, static es necesario para que el método pueda ser 
    invocado sin necesidad de crear un objeto de la clase ClasesAbstractas.
    */

    public static void main(String[] args) {
        
        /*
        Cómo la clase Figura es abstracta no la puedo instanciar, eso es por defincición.
        Pero como sus hijos (Circulo y Cuadrado) no son abstractos si los puedo instanciar.
        */
    
    // Crear un objeto Cuadrado
        Cuadrado cuadrado = new Cuadrado(5.0, 0.0, 0.0);
        // Calcular el área del cuadrado
        double areaCuadrado = cuadrado.calcularArea();
        // Imprimir el resultado
        System.out.println("Área del cuadrado: " + areaCuadrado);

        // Crear un objeto Circulo
        Circulo circulo = new Circulo(3.0, 0.0, 0.0);
        // Calcular el área del círculo
        double areaCirculo = circulo.calcularArea();
        // Imprimir el resultado
        System.out.println("Área del círculo: " + areaCirculo);   
        
        
    }
    
}
