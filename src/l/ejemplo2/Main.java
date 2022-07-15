package l.ejemplo2;

/*Definicion 2 :Si en alguna parte de nuestro código estamos
 usando una clase, y esta clase es extendida,
 tenemos que poder utilizar cualquiera de las clases
 hijas y que el programa siga siendo válido.*/

//Codigo obtenido desde  https://devexperto.com/
public class Main {

    public static void main(String[] args) {
        AnimalLiguero perro = new AnimalLiguero("perro");
        AnimalLiguero gato = new AnimalLiguero("gato");

        Animal elefante = new Animal("elefante");

        Aplicacion aplicacion = new Aplicacion();

        aplicacion.desplazamientoAnimalesLigeros(perro);
        aplicacion.desplazamientoAnimalesLigeros(gato);

        aplicacion.desplazamientoAnimalesPesados(elefante);
    }



}
