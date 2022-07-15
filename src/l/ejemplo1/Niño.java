package l.ejemplo1;

public class Niño extends Persona {

    private Adulto tutor;

    public Niño(String nombre, int edad, Adulto tutor){
        super(nombre, edad);
        this.tutor = tutor;
    }

    public Adulto getTutor() {
        return tutor;
    }

    public void setTutor(Adulto tutor) {
        this.tutor = tutor;
    }
}
