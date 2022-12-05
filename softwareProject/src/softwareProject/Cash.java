package softwareProject;

public class Cash implements PaymentStratety{

    @Override
    public void pay(double ammount) {
        System.out.println("apply payment cash recieve "+ammount+" dollar");
        
    }
    
}
