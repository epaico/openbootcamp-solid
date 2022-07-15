package l.ejemplo2;

public class Animal {

    protected String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    void caminar() {
        System.out.println("soy un " + tipo + " y estoy caminando" );
    }
}
