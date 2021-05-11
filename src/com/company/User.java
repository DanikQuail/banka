package com.company;

public class User {

    private String name;
    private boolean gender; //true --> female, false --> male
    private int birthNumber;

    public User (String name, boolean gender, int birthNumber) { //informace o klientovi/uzivateli
        this.gender = gender;
        this.name = name;
        this.birthNumber = birthNumber;
    }

    public void createAccount(Bank bank) {
        bank.createNewAccount(this);
    }
    public void depositMoney(BankAccount account, int money){
        account.depositMoney(money);
    }
    public void withDrawMoney(BankAccount account, int money){
        account.byeByeMoney(money);
    }

    public String getName() {
        return name;
    }
}