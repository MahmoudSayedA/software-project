package phase1lastV;
public class WeDsl implements ServiceProvider{
    User user;
    private String serviceProviderName;
    @Override
    public Service createService() {
        
        return new InternetPaymentService(this.user);
    }

    public WeDsl(User user) {
        this.user = user;
        serviceProviderName = "WeDsl";
   }

    @Override
    public String getServiceProviderName() {
        
        return serviceProviderName;
    }
    
}
