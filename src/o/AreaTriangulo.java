package o;

public class AreaTriangulo extends AreaFigura {

    private double base;
    private double altura;

    public AreaTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura / 2;
    }

}
