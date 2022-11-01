package D;

public class PayBanck implements Pay {

    @Override
    public void pay(double amount) {
        System.out.println("pagando con proceso de banco");
    }
}
