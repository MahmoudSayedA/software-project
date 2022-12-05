package softwareProject;
public class Refund implements Observer{
    private double amount;
    private String serviceName;
    private String reFundState;
    private int refondID;
    User user;

    public int getRefondID() {
        return refondID;
    }
    public void setRefondID(int refondID) {
        this.refondID = refondID;
    }

    public String getReFundState() {
        return reFundState;
    }
    public void setReFundState(String reFundState) {
        this.reFundState = reFundState;
    }
    
    public Refund(double amount,int refondID, String serviceName, User user) {
        this.amount = amount;
        this.serviceName = serviceName;
        this.user = user;
        this.refondID = refondID;
        this.reFundState = "waiting";
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    @Override
    public void upbate(double addedAmmount) {
        ((Customer) this.user).Wallet.addFund(addedAmmount);
    }
    
}

