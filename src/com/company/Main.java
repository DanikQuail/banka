package com.company;

public class Main {

    public static void main(String[] args) {
        //ukazka fungovani kodu
        Bank bank1 = new Bank("FGT Bank"); //nazev banky
        Bank bank2 = new Bank("BS Bank");
        User ivan = new User("Ivan", false, 1234); //informace o uzivateli
        User jakub = new User("Jakub", false, 5678);
        ivan.createAccount(bank1); //zalozeni uctu
        jakub.createAccount(bank2);

        ivan.depositMoney(bank1.getAccountByName(ivan), 1000); //vlozeni penez do uctu
        System.out.println("Ivan právě do svého účtu vložil "+ bank1.getAccountByName(ivan).getMoney() + " korun.");
        System.out.println();

        jakub.depositMoney(bank2.getAccountByName(jakub), 1000);
        System.out.println("Jakub právě do svého účtu vložil "+ bank1.getAccountByName(ivan).getMoney() + " korun.");
        System.out.println();

        jakub.withDrawMoney(bank2.getAccountByName(jakub), 300); //vybirani penez
        System.out.println("Jakub si vybral a má teď na účtě "+ bank2.getAccountByName(jakub).getMoney() + " korun.");
        System.out.println();

        bank1.getAccountByName(ivan).transferMoney(bank2.getAccountByName(jakub), 500); //posilani penez
        System.out.println("Jakub dostal od Ivana peníze a má ted  "+ bank2.getAccountByName(jakub).getMoney() + " korun.");
        System.out.println();

        jakub.withDrawMoney(bank2.getAccountByName(jakub), 90000); //jakub si chce vybrat, i kdyz nema penize, system ho tedy zastavi
        System.out.println("Jakub si chtěl vybrat, ale nemá dostatek peněz (LOL!)");
        System.out.println();
        System.out.println("Kubův zůstatek činí "+ bank2.getAccountByName(jakub).getMoney() + " korun.");
        System.out.println();
    }
}
