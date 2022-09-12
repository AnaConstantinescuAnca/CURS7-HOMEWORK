package org.fasttrack.exercise2;

public class BRD implements BankAccount {
    private static final String NAME = "BRD";

    private String bankNrAccount;
    private int sold = 0;

    public BRD(String bankNrAccount) {
        this.bankNrAccount = bankNrAccount;
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
        if (money > 0) {
            return sold += money;
        }
        return 0;
    }

    @Override
    public int getMinusMoney(int money) {
        if (sold >= money && sold > 0) {
            return sold -= money;
        }
        System.out.println("Sold insuficient");
        return sold;
    }

    @Override
    public int getSold() {
        return sold;
    }
}
