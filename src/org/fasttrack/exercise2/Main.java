package org.fasttrack.exercise2;

public class Main {

    public static void main(String[] args) {
        Person persoana1 = new Person("Popescu", new BRD("RO124BRDE224"));

        System.out.println(String.format("%s are deschis un cont la %s cu nr %s",
                persoana1.getNamePerson(), persoana1.getBankAccount().getName(),persoana1.getBankAccount().bankNrAccount()));

        //depune 100

        persoana1.getBankAccount().getSold();
        System.out.println(persoana1.getBankAccount().getSold());
        persoana1.getBankAccount().getAddMoney(100);
        System.out.println(persoana1.getNamePerson() + " dupa depunere are un sold de " + persoana1.getBankAccount().getSold());

        persoana1.getBankAccount().getAddMoney(100);
        System.out.println(persoana1.getNamePerson() + " dupa depunere are un sold de " + persoana1.getBankAccount().getSold());

        //scoate 150
        persoana1.getBankAccount().getMinusMoney(150);
        System.out.println(persoana1.getNamePerson() + " dupa retragere are un sold de " + persoana1.getBankAccount().getSold());

        //incearca sa scoata mai mult decat este in sold
        persoana1.getBankAccount().getMinusMoney(100);
        System.out.println(persoana1.getNamePerson() + " are un sold de " + persoana1.getBankAccount().getSold());

        Person persoana2 = new Person("Ionescu", new BT("RO2344BT546"));
        System.out.println(String.format("%s are deschis un cont la %s cu nr %s",
                persoana2.getNamePerson(), persoana2.getBankAccount().getName(),persoana2.getBankAccount().bankNrAccount()));

        persoana2.getBankAccount().getAddMoney(5000);
        System.out.println(String.format("%s dupa depunere are un sold de %d la banca %s",
                persoana2.getNamePerson(), persoana2.getBankAccount().getSold(),persoana2.getBankAccount().getName()));


        Person persoana3 = new Person("Vasilescu", new ING("RO666ING444"));
        System.out.println(String.format("%s are deschis un cont la %s cu nr %s",
                persoana3.getNamePerson(), persoana3.getBankAccount().getName(),persoana3.getBankAccount().bankNrAccount()));
        persoana3.getBankAccount().getMinusMoney(10);

    }
}
