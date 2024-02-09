
package interfaces;


public class Intefaces {
    
    /*
    ¿Por qué static?
    Este modificador significa que el método pertenece a la clase en lugar de pertenecer 
    a una instancia particular de la clase. Esto significa que puedes llamar al método
    directamente desde la clase, sin necesidad de crear un objeto de esa clase. 
    En el contexto del método main, static es necesario para que el método pueda ser 
    invocado sin necesidad de crear un objeto de la clase ClasesAbstractas.
    */

    public static void main(String[] args) {
        
           
    // Crear un objeto Cuadrado
        Cuadrado cuadrado = new Cuadrado(5.0);
        // Calcular el área del cuadrado
        double areaCuadrado = cuadrado.calcularArea();
        // Imprimir el resultado
        System.out.println("Área del cuadrado: " + areaCuadrado);
        
        // Dibujar y rotar el cuadrado
        cuadrado.dibujar();
        

        // Crear un objeto Circulo
        Circulo circulo = new Circulo(3.0);
        // Calcular el área del círculo
        double areaCirculo = circulo.calcularArea();
        // Imprimir el resultado
        System.out.println("Área del círculo: " + areaCirculo); 
        
         // Dibujar y rotar el círculo
        circulo.dibujar();
        circulo.rotar();
        
        
        
        
    }
    
}
