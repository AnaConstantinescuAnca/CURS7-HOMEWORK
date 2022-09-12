package org.fasttrack.exercise1;

public class PrintAdvertising implements AdvertisingProvider{
    private String name;
    private int tariff;
    private String chanel;

    public PrintAdvertising(String name, String chanel, int tariff){
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
