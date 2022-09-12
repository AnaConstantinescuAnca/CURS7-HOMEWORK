package org.fasttrack.exercise1;

import javax.naming.ldap.StartTlsRequest;

public class Facebook implements AdvertisingProvider {
     private String name;
     private String chanel;
     private int tariff;


     public Facebook(String name, String chanel, int tariff){
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
