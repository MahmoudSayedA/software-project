package phase1lastV;
public class DonationFactory implements ServiceProvider{
    User user;
    private String serviceProviderName;

    public DonationFactory(User user) {
        this.user = user;
        this.serviceProviderName = "DonationFactory";
    }
    @Override
    public Service createService() {
        return new Donation(this.user);
    }
    @Override
    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

  
    
}
