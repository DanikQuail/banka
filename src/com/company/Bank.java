package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private ArrayList<BankAccount> accounts;
    private String name;

    public Bank(String name) {
        this.accounts = new ArrayList<>();
        this.name = name;
    }

    public void createNewAccount(User User){
        accounts.add(new BankAccount(User, randomID()));
    }
    
    private int randomID() {//generovani ID uctu
        ArrayList<Integer> usersIDs = new ArrayList<>();
        ArrayList<BankAccount> bankAccounts = this.accounts;

        for (int i = 0; i < bankAccounts.size(); i++) {
            BankAccount account = bankAccounts.get(i);
            usersIDs.add(account.getId());
        }
        Random nahodicka = new Random();
        
        int randID = nahodicka.nextInt(50000) + 10000;
        
        while (usersIDs.contains(randID)) {
            randID = nahodicka.nextInt(50000) + 10000;
        }
        return randID;
    }

    public BankAccount getAccountByName(User User){
        for (int i = 0; i < accounts.size(); i++) {
            
            if (accounts.get(i).getUser().getName().equals(User.getName())){
                return accounts.get(i);
            }
            
        }
        return null;
    }
}