package org.fasttrack.exercise1;

public class Email implements AdvertisingProvider{
    private String name;
    private String chanel;
    private int tariff;


    public Email(String name,String chanel,int tariff ){
        this.name=name;
        this.chanel=chanel;
        this.tariff=tariff;
    }


    @Override
    public String getChanel() {
        return chanel;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTariff() {
        return tariff;
    }
}
