public class Main {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.nombre = "Julio";
        cliente.edad = 50;
        cliente.telefono = 12345;
        cliente.credito = 2000;

        System.out.println("Clase Cliente");
        System.out.println("Nombre: "+cliente.nombre+" Edad: "+cliente.edad+" Telefono: "+cliente.telefono+" Credito: "+cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Cortazar";
        trabajador.edad = 20;
        trabajador.telefono = 6789;
        trabajador.salario = 200;

        System.out.println("Clase Trabajador");
        System.out.println("Nombre: "+trabajador.nombre+" Edad: "+trabajador.edad+" Telefono: "+trabajador.telefono+" Salario: "+trabajador.salario);

    }



}
class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;

}

class Trabajador extends Persona{
    double salario;

}
