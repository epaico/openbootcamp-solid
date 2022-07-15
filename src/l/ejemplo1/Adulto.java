package l.ejemplo1;

public class Adulto extends Persona{
    private String dni;
    private String tarjeta;

    public Adulto(String nombre,int edad, String dni, String tarjeta){
        super(nombre,edad);
        this.dni= dni;
        this.tarjeta=tarjeta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void pagar(){
        System.out.println("pagando con tarjeta " + tarjeta);
    }
}
