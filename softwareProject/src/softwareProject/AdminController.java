package phase1lastV;
public class AdminController {
    private DataBase dataBase;

    public boolean addServiceProvider(ServiceProvider serviceProvider) {
        dataBase.myServiceProviders.add(serviceProvider);
        return true;
    }

   
}
