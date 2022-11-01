package D;

public class PayPaypal implements Pay{
    @Override
    public void pay(double amount) {
        //other methods
        System.out.println("pagando con proceso de paypal");
    }
}
