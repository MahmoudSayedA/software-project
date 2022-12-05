package phase1lastV;
public class EtisalatLandLind implements ServiceProvider{
    User user;
    private String serviceProviderName;

    public EtisalatLandLind(User user) {
        this.user = user;
        this.serviceProviderName = "EtisalatLandLine";
    }
    @Override
    public Service createService() {
        return new LandLineService(this.user);
    }
    @Override
    public String getServiceProviderName() {
        return this.serviceProviderName;
    }
    
    
    
}
