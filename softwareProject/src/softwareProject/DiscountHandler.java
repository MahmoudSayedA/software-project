package phase1lastV;
import java.util.List;

public class DiscountHandler {
    private DataBase dataBase;
        
    public List<Discount> getDiscounts() {
        return this.dataBase.discountList;
    }

    public boolean addDiscount(Discount discount) {
        dataBase.discountList.add(discount);
        return true;
    }
    
    public Discount availableDiscount(String serviceName) {
        for (Discount discount : this.dataBase.discountList) {
            if (discount.getServiceName().equals(serviceName)) {
                return discount;
            }

        }
        return null;
    }
}
