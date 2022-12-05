package phase1lastV;
import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private DataBase dataBase;

    
    public CustomerController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    
    public List<String> searchService(String serviceName) {
        List<String> serviceNameMatch = new ArrayList<String>();
        for (Service service : this.dataBase.myServices) {
            String name = service.getServiceName();
            if (name.contains(serviceName)) {
                serviceNameMatch.add(name);
            }

        }
        return serviceNameMatch;
    }
    
}
