package com.company;


public class BankAccount {
    private User user;
    private int money;
    private int id;

    public BankAccount(User user, int id) {
        this.money = 0;
        this.user = user;
        this.id = id;
    }

    public void depositMoney(int money2) {
        this.money += money2;
    }

    public boolean byeByeMoney(int money2) {
        if (this.money - money2 >= 0) {
            this.money -= money2;
            return true;
        }
        return false;
    }

    public void transferMoney(BankAccount account, int amount) {
        if (byeByeMoney(amount)) {
            account.depositMoney(amount);
        }
    }

    public User getUser() {
        return user;
    }

    public int getMoney() {
        return money;
    }
    public int getId() {
        return id;
    }

}
