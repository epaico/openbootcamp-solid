package s;

import java.util.List;

public class Personas {

    PersonasBD bd = new PersonasBD();

    public void agregar(Persona persona) {
        if (obtener(persona.getNombre()) != null){
            return;
        }
        bd.insertar(persona);
    }

    public List<Persona> todos() {
        return bd.obtenerTodos();
    }

    public Persona obtener(String nombre) {
        return todos()
                .stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

}
