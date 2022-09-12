package org.fasttrack.exercise2;

public class ING implements BankAccount{
    private static final String NAME="ING";
    private int sold=0;
    private String bankNrAccount;

    public ING(String bankNrAccount){
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
        return sold+=money;
    }

    @Override
    public int getMinusMoney(int money) {
        if (sold>0 && sold>=money){
            return sold-=money;
        }
        System.out.println("Fonduri indisponibile");
        return 0;
    }

    @Override
    public int getSold() {
        return sold;
    }
}
