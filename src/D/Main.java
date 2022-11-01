package D;

//Inversion de dependencia
/*
 * Los modulos de alto nivel no deben de depender de los
 * modulos de bajo nivel.Ambos deben depender de abstracciones.
 *
 * Las abstaracciones no deben depender de los detalles,
 * los detalles deben depender de las abstracciones
 * */
public class Main {
    public static void main(String[] args) {

        PayBanck payBanck = new PayBanck();
        PayPaypal payPaypal = new PayPaypal();

        Store store = new Store(payPaypal);
        store.purchase();

    }
}
