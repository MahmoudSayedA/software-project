package com.fawry.pack.user.handler;


import com.fawry.pack.user.entity.Wallet;

public class WalletHandler {
    private Wallet wallet;

    public WalletHandler(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public void addFund(double fund) {
        this.wallet.setMoney(this.wallet.getMoney() + fund);
        //this.addTrans(fund, user);
    }

    // private String addTrans(int ammount, Customer user) {
    //     String str = ("amount added to " + user.getUserName() + " wallet at " + LocalDateTime.now().toString());
    //     return str;
    // }
    
    public boolean reduceMoney(double ammount) {
        if(this.wallet.getMoney() >= ammount)
        {
            this.wallet.setMoney(this.wallet.getMoney() - ammount);
            return true;
        }
        return false;
    }
    
}
