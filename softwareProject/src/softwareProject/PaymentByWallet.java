package phase1lastV;
public class PaymentByWallet implements PaymentStratety{
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public PaymentByWallet(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void pay(double ammount) {
        customer.Wallet.reduceMoney(ammount);
        System.out.println("apply payment by wallet reduce "+ammount+" doller");
    }
    
}
