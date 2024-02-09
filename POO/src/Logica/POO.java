package Logica;

public class POO {

    public static void main(String[] args) {
        
         /* Cuando hago "new Alumno()" estoy llamando al constructor de la clase Alumno 
            alu1 crea un alumno vacío sin datos, con lo cual puedo usar métodos y demás
            alu2 crea un alumno con los atributos que tiene el constructor. Nota: se debe respetar el orden de los atributos del constructor
            
            Para poder verlos hay métodos especiales llamados getters y setters.
            getters y setters son métodos utilizados para acceder y modificar los valores de los atributos de una clase de manera controlada y segura.
            Los getters se utilizan para obtener el valor de un atributo, mientras que los setters se utilizan para establecer o modificar el valor de un atributo.
         */
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Luis", "Solo");
        
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre() + " " + alu2.getApellido());
    
        alu1.setId(1);
        alu1.setNombre("Eduardo");
        alu1.setApellido("Coyto");
        
        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre() + " " + alu1.getApellido());
        
    }

}
