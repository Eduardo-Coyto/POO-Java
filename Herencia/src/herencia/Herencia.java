package herencia;

public class Herencia {

    public static void main(String[] args) {
       
        /*
        Aquí trabajo la Herencia
        */
        Empleado emple = new Empleado();
        
        emple.getNum_legajo();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        
        consul.getNum_consultor();
        
        /*
        Aquí trabajo el Polimorfismo
        
        Partiendo de la base fundamental de Java que en objetos de un tipo
        no puedo guardar objetos de otro tipo. Lo mismo sucede si creo un vector
        con un tipo de dato, los elementos deben pertenecer al mismo tipo de datos
        
        Creo un vector de tipo Persona
        dentro de cada vector puedo guarda distintos formas de representar a la persona,
        como ser Empleado, Consultor, Jefe. 
        Además a un objeto Persona yo le estoy asignando un objeto Consultor 
        perso = consult;
        Como Consultor es hijo de la clase Persona puedo hacer ese tipo de asignaciones.
        
        Lo que NO me permite es asignarle Persona a un Consultor
        ❌ consult = perso
        Me sale una advertencia que se debería realizar un casteo, o sea transformar la clase Persona para asignarle un Consultor 
    
        */
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        

        Persona perso = new Persona();
        Consultor consult = new Consultor();
        
        perso = consult;
        
    }
    
}
