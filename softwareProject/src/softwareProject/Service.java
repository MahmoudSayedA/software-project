package softwareProject;
public abstract class Service {
    protected String ServiceName;
    protected int ServiceId;
    protected PaymentStratety PaymentStratety;
    protected User user;
    public void setUser(User user) {
        this.user = user;
    }

    public Service(User user) {
        this.setUser(user);
    }
    public User getUser() {
        return user;
    }
    
    public PaymentStratety getPaymentStratety() {
        return PaymentStratety;
    }

    public void setPaymentStratety(PaymentStratety paymentStratety) {
        PaymentStratety = paymentStratety;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }


    public int getServiceId() {
        return ServiceId;
    }

    public void setServiceId(int serviceId) {
        ServiceId = serviceId;
    }

    public abstract void paymentAction(double ammount);

    public double discountAction(double ammount) {
        DiscountHandler discountHandler = new DiscountHandler();
        Discount discount = discountHandler.availableDiscount(ServiceName);
        if (discount != null) {
            ammount = discount.applyDiscount(ammount);
        }
        return ammount;
    }
    public final void performPayment(double ammount) {
        ammount = discountAction(ammount);
        paymentAction(ammount);
    }
}
