package org.fasttrack.exercise1;

public class Company {
    private String name;
    private AdvertisingProvider advertisingProvider;


    public Company(String name, AdvertisingProvider advertisingProvider) {
        this.advertisingProvider = advertisingProvider;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AdvertisingProvider getAdvertisingProvider() {
        return advertisingProvider;
    }
}
