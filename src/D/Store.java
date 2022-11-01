package D;

//Modulo de alto nivel
public class Store {

    private final Pay apiPay;

    public Store(Pay apiPay) {
        this.apiPay = apiPay;
    }

    public void purchase(){

        //other metodos

        apiPay.pay(2000);
    }
}
