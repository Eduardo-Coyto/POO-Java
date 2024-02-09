
package herencia;

/*
Creo hijo-hija "Empleado" a partir del padre "Persona"
*/
public class Empleado extends Persona {
    
    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }
    
    /*
    Los atributos que son heredados realiza la asignación con la palabra reservada *super*. Super recibe los atributos por parámetro, llama a la clase padre y asigna los valores.
    el cual se obtiene a través de la herencia.
    */
    public Empleado(int num_legajo, String cargo, Double sueldo, int id, String ci, String nombre, String apellido, String domicilio, String telefono) {
        super(id, ci, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
