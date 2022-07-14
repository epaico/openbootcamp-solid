package s;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personas personas = new Personas();

        Persona p1 = new Persona("elvis",35,"11561561");
        personas.agregar(p1);

        List<Persona> listPersonas = personas.todos();

        listPersonas.forEach(System.out::println);

    }
}
