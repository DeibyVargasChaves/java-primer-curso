package example;

public class polimorfismoMain {

    public static void main(String[] args) {

    Coche coche = new Coche();

    CocheElectrico coche2 = new CocheElectrico();

    Coche coche4 = new CocheElectrico();

    if (coche4 instanceof CocheElectrico) {
        System.out.println("coche electrico");
    }
    }
}
