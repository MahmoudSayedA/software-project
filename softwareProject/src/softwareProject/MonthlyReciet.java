package softwareProject;
public class MonthlyReciet implements RecietStrategy{
    private final double monthlyRecietAmmount=100;
    @Override
    public void payReciet(PaymentStratety paymentStratety) {
        System.out.println("apply monthly reciet");
        paymentStratety.pay(monthlyRecietAmmount);
    }
    
}
