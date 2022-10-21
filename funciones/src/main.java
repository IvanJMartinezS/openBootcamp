public class main {


    public static void main(String[] args){

        //Primera Parte
        System.out.println("Primera Parte");
        int resultado = add(10, 20, 30);

        System.out.println(resultado);


        //Segunda Parte
        System.out.println("Segunda Parte");
        Coche miCoche = new Coche();

        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);

    }

    //Primera Parte
    public static int add (int numberOne, int numberTwo, int numberThree){
        return numberOne + numberTwo + numberThree;
    }

}

//Segunda parte
class Coche{
    public int puertas = 0;

    public void AumentarPuertas(){
        this.puertas++;
    }
}


