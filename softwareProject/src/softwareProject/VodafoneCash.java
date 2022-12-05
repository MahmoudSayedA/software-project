package phase1lastV;
public class VodafoneCash implements ServiceProvider {
    private String serviceProviderName;

    User user;
    
    @Override
    public Service createService() {
        return new MobileRechargeService(this.user);
    }

    public VodafoneCash(User user) {
        this.user = user;
    }

    @Override
    public String getServiceProviderName() {
        
        return this.serviceProviderName;
    }

    
}
