package PruebaHashMap;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {
        
      /*
      Map
      Para implementar el Map es con el método clave valor, simil JSON.
      */  
      Map<Integer, String> mapaEmpleados = new HashMap<>();
      
      mapaEmpleados.put(1523, "Eduardo Coyto");
      mapaEmpleados.put(1524, "Valentina Fernandez");  
      mapaEmpleados.put(1525, "Chipi Coyto");  
      
      boolean estaono = mapaEmpleados.containsValue("Eduardo Coyto");
        if (estaono) {
            System.out.println("El valor está");
        } else{
            System.out.println("El valor no está");
        }
    }
}
