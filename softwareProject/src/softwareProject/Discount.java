package phase1lastV;

public abstract class Discount {
    protected String serviceName;
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    protected double discountAmmount;

    public Discount(double discountAmmount) {
        this.discountAmmount = discountAmmount;
    }
    public double getDiscountAmmount() {
        return discountAmmount;
    }

    public void setDiscountAmmount(double discountAmmount) {
        this.discountAmmount = discountAmmount;
    }

    public double applyDiscount(double ammountBeforeDiscount) {
        double reduce = ((ammountBeforeDiscount * this.discountAmmount) / 100);
        return ammountBeforeDiscount - reduce;
    }
}
