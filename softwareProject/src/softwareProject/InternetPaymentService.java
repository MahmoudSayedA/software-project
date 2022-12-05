package softwareProject;
public class InternetPaymentService extends Service{

    public InternetPaymentService(User user) {
        super(user);
    }
    

    @Override
    public void paymentAction(double ammount) {
        this.PaymentStratety.pay(ammount);
        
    }
    
}
