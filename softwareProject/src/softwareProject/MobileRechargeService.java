package softwareProject;
public class MobileRechargeService extends Service{

    public MobileRechargeService(User user) {
        super(user);

    }

    @Override
    public void paymentAction(double ammount) {
        this.PaymentStratety.pay(ammount);       
    }

    

    
        
    
    
    
}
