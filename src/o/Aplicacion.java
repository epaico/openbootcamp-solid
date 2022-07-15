package o;

import java.util.List;

public class Aplicacion {

    public double obtenerTotalAreas(List<AreaFigura> figuras) {
        return figuras.stream()
                .map(AreaFigura::calcularArea)
                .reduce(0.0, Double::sum);

    }

}
