package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {

        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Valentina", "Fernandez");

        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("apellid: " + alu2.getApellido());

    }

}
