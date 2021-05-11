package com.company;

public class Main {

    public static void main(String[] args) {
        //ukazka fungovani kodu
        Bank bank1 = new Bank("FGT Bank"); //nazev banky
        User ivan = new User("Ivan", false, 1234); //informace o uzivateli
        ivan.createAccount(bank1); //zalozeni uctu

        Bank bank2 = new Bank("BS Bank");
        User jakub = new User("Jakub", false, 5678);
        jakub.createAccount(bank2);

        ivan.depositMoney(bank1.getAccountByName(ivan), 1000); //vlozeni penez do uctu
        System.out.println("Ivan právě do svého účtu vložil "+ bank1.getAccountByName(ivan).getMoney() + " korun.");
        System.out.println();

        bank1.getAccountByName(ivan).transferMoney(bank2.getAccountByName(jakub), 500); //posilani penez
        System.out.println("Ivan poslal Kubovi 500 a teď má "+ bank1.getAccountByName(ivan).getMoney() + " korun.");
        System.out.println("Jakub dostal od Ivana "+ bank2.getAccountByName(jakub).getMoney() + " korun.");
        System.out.println();

        jakub.withDrawMoney(bank2.getAccountByName(jakub), 300); //vybirani penez
        System.out.println("Jakub si vybral 300 korun.");
        System.out.println("Jakub má teď na účtě "+ bank2.getAccountByName(jakub).getMoney() + " korun.");
        System.out.println();

        jakub.withDrawMoney(bank2.getAccountByName(jakub), 90000); //jakub si chce vybrat, i kdyz nema penize, system ho tedy zastavi
        System.out.println("Jakub si chtěl vybrat 90000, ale nemá dostatek peněz (LOL!)");
        System.out.println("Kubův zůstatek činí "+ bank2.getAccountByName(jakub).getMoney() + " korun.");
        System.out.println();
    }
}
