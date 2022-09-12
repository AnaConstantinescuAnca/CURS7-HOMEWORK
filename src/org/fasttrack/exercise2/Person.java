package org.fasttrack.exercise2;

public class Person {
    private String namePerson;
    private BankAccount bankAccount ;


    public Person(String namePerson, BankAccount bankAccount){
        this.namePerson=namePerson;
        this.bankAccount=bankAccount;
    }

    public String getNamePerson(){
        return namePerson;
    }

    public BankAccount getBankAccount(){
        return bankAccount;
    }
}
