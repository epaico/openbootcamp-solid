package l.ejemplo1;
/*Principio de Sustitucion de Liskov
Definicion 1: S es un subtipo de T ,
T puede ser reemplazado con objetos de tipo S
sin alterar el comportamiento esperado en el programa.
Codigo obtenido desde : https://www.arquitecturajava.com*/

public class Main {
    public static void main(String[] args) {

        Adulto juan = new Adulto("Juan", 37, "625656161","251156161616161");
        Niño junior = new Niño("Junior",4,juan);

        junior.getTutor().pagar();

    }
}
