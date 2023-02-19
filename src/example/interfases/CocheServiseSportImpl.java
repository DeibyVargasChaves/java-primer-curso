package example.interfases;

import example.Coche;
import example.CocheElectrico;

public class CocheServiseSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche deportivo");
        return new CocheElectrico();
    }

    @Override
    public void destruirCocheDemo(Coche coche) {
        System.out.println("destruyendo coche deportivo");
    }
}
