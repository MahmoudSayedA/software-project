package softwareProject;
public class ReFundController extends Subject{
    //DataBase dataBase;

    public ReFundController() {

    }
    @Override
    public void notifyObservers() {
        EmailSender eSender = new EmailSender();
        for (Observer observer : this.observers) {
            Refund refund = ((Refund) observer);
            if(refund.getReFundState().contains("accepted"))
            {
                observer.upbate(refund.getAmount());
                eSender.sendMail(refund.user.getEmail(),"accepted");
            }
            else {
                eSender.sendMail(refund.user.getEmail(),"rejected");
            }
        }

    }

    public void checkRefunds() {
        UserInterface UI = new UserInterface();
        for (Observer observer : this.observers) {
            Refund refund = (Refund) observer;
            UI.printRefund(refund);
            if (UI.acceptRefund()) {
                refund.setReFundState("accepted");
            }
            else {
                refund.setReFundState("rejected");
            }
        }
    }
    
    
}
