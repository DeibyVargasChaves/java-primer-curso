package example;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico(){
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(String motorElectrico, String color, String fabricante, String modelo, Double peso, Double largo){
    super(color, fabricante, modelo,peso,largo);
    this.motorElectrico = motorElectrico;
    }
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
