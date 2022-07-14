package s;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonasBD {

    private final String archivo = "personas.txt";

    public void insertar(Persona persona) {

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(archivo, true);
            PrintStream printStream = new PrintStream(fileOutputStream, true);
            printStream.println(convertirPersonaToString(persona));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Persona> obtenerTodos() {
        List<Persona> listPersonas = new ArrayList<>();
        try {

            Scanner scanner = new Scanner(new File(archivo));
            while (scanner.hasNext()) {
                String[] items = scanner.next().split("\\|");
                Persona p = new Persona();
                p.setNombre(items[0]);
                p.setEdad(Integer.parseInt(items[1]));
                p.setTelefono(items[2]);
                listPersonas.add(p);
            }

        } catch (Exception e) {
            new ArrayList<Persona>();
        }
        return listPersonas;
    }

    private String convertirPersonaToString(Persona persona) {
        return persona.getNombre() + "|"
                + persona.getEdad() + "|"
                + persona.getTelefono();
    }

}
