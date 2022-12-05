package softwareProject;


public class CreditCard implements PaymentStratety{
    private String cardNumber;
    @Override
    public void pay(double ammount) {
        // bank checks validation
        BankCherker bankCherker = new BankCherker();
        bankCherker.checkValidation(cardNumber);
        // apply payment
        System.out.println("apply payment with credit card take "+ammount+" doller");
       
    }

    public CreditCard(String creditCardNumber) {
        this.cardNumber = creditCardNumber;
    }

    
}
