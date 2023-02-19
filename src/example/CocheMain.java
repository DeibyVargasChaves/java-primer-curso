package example;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo";

        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("red", "honda", "civic", 500.45,5.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "electic motor";
        cocheElectrico.color = "blue";
        cocheElectrico.modelo = "model s";
        cocheElectrico.fabricante = "tesla";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("electric", "red", "tesla", "clase x", 500.30, 5.4);

        cocheElectrico2.acelerar(100);

        System.out.println(cocheElectrico2);


    }
}
