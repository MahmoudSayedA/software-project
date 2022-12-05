package softwareProject;
public class Donation extends Service {

    
    public Donation(User user) {
        super(user);
    }

    @Override
    public void paymentAction(double ammount) {
        this.PaymentStratety.pay(ammount);       

    }
    
}
