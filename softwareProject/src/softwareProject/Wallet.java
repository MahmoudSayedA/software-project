package softwareProject;

public class Wallet {
    private double money;


    public Wallet() {
        money = 0;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    
    public void addFund(double fund) {
        this.money += fund;
    }

    public void reduceMoney(double ammount) {
        this.money -= ammount;
    }

}
