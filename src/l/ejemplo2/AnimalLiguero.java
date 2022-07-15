package l.ejemplo2;

public class AnimalLiguero extends Animal{

    public AnimalLiguero(String tipo) {
        super(tipo);
    }

    void saltar(){
        System.out.println("soy un " + tipo + " y estoy saltando" );
    }
}
