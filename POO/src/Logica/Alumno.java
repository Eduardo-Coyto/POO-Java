package Logica;

public class Alumno {
    /* 
    Atributos globales y la puedo usar en toda la clase
    Por defecto todos los atributos de un estado deben ser privados.
    El fin de que sean privado es que no cualquier otra clase pueda acceder a ellos y que nos 
    obligue a usar los Getters & Setters para interactuar con ellos.
    */
    private int id;
    private String nombre;
    private String apellido;
    
    /* Constructor vacio */
    public Alumno() {
    }
    
    /* Constructor con parámetros */
    public Alumno(int id, String nombre, String apellido) {
        /* Atributos locales, solo lo puedo usar dentro de este constructor 
           En suma, this.id = id; funciona de la siguiente manera:
           * this.id corresponde al id de la clase Alumno
           * id corresponde al id que se le pasa por parámetro al constructor.
        */
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /*
    Getters & Setters 
    Para establecer getters y setters dentro de la clase, por convención van
    colocados antes de los métodos creados manualmente o pueden ir después de los métodos constructores.
    
    La función tiene el siguiente tipo:
    
        * public = modificador de acceso
          int = el tipo de dato que retorna
          getId = el nombre del método
    
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    /* Métodos */
    public void mostrarNombre(){
        System.out.println("Hola soy el alumno "+ nombre + " "+ apellido);
    }
    public void saberAprobado(double calificacion){
        if (calificacion>=6) {
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uyy no aprobé");
        }
    }
}
