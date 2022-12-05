package softwareProject;
public class QuarterReciet implements RecietStrategy{

    private final double quarterRecietAmmount=100;
    @Override
    public void payReciet(PaymentStratety paymentStratety) {
        System.out.println("apply monthly reciet");
        paymentStratety.pay(quarterRecietAmmount);
    }
    
}
