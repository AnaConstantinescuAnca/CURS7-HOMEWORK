package org.fasttrack.exercise2;

public class BT implements BankAccount{
    private static final String NAME = "BT";
    private int sold;
    private String bankNrAccount;

    public BT(String bankNrAccount){
        this.bankNrAccount=bankNrAccount;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String bankNrAccount() {
        return bankNrAccount;
    }

    @Override
    public int getAddMoney(int money) {
        if (money>0){
            return sold+=money;
        }
        return 0;
    }

    @Override
    public int getMinusMoney(int money) {
        if(sold>=money && sold>0){
            return sold-=money;
        }
        System.out.println("Sold indisponibil");
        return 0;
    }

    @Override
    public int getSold() {
        return sold;
    }
}
