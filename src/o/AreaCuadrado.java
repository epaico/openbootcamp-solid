package o;

public class AreaCuadrado extends AreaFigura {

    private double lado;

    public AreaCuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}
