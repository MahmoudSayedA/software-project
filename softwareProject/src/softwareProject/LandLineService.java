package softwareProject;
public class LandLineService extends Service{
    public LandLineService(User user) {
        super(user);
        strategy = new MonthlyReciet();
    }

    private RecietStrategy strategy;
    
    public RecietStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(RecietStrategy strategy) {
        this.strategy = strategy;
    }
    @Override
    public void paymentAction(double ammount) {

        strategy.payReciet(this.PaymentStratety);

    }
}
