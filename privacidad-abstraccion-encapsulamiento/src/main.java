import java.math.BigInteger;

public class main {
    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setEdad(20);
        persona.setNombre("Ivan");
        persona.setTelefono(1234567);

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        System.out.println("Edad: " + edad + " Nombre: " + nombre + " Telefono: " + telefono);
    }

}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
