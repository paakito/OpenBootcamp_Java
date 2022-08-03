public class Main02 {

    public static void main(String[] args) {
        Coche elCoche = new Coche();
        elCoche.SumarPuerta();
        System.out.println(elCoche.puertas);
    }
}

class Coche {
    public int puertas = 4;

    public void SumarPuerta() {
        this.puertas++;
    }
}