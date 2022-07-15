package o;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AreaFigura> listAreaFiguras = new ArrayList<>();

        AreaTriangulo at1 = new AreaTriangulo(4,6);
        AreaTriangulo at2 = new AreaTriangulo(10,7);
        AreaTriangulo at3 = new AreaTriangulo(6,9);
        listAreaFiguras.add(at1);
        listAreaFiguras.add(at2);
        listAreaFiguras.add(at3);

        AreaCuadrado ac1 = new AreaCuadrado(4);
        AreaCuadrado ac2 = new AreaCuadrado(10);
        AreaCuadrado ac3 = new AreaCuadrado(8);
        listAreaFiguras.add(ac1);
        listAreaFiguras.add(ac2);
        listAreaFiguras.add(ac3);



        Aplicacion app = new Aplicacion();
        double totalAreas = app.obtenerTotalAreas(listAreaFiguras);
        System.out.println("La suma total de las areas de las figuras es : " + totalAreas);

    }
}
