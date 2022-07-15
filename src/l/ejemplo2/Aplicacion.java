package l.ejemplo2;

public class Aplicacion {

    void desplazamientoAnimalesLigeros(AnimalLiguero animal){
        animal.caminar();
        animal.saltar();
        animal.caminar();
    }

    void desplazamientoAnimalesPesados(Animal animal){
        animal.caminar();
        animal.caminar();
    }
}
