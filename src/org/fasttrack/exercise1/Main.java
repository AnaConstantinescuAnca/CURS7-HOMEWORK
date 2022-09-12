package org.fasttrack.exercise1;

public class Main {

    public static void main(String[] args) {
        Company company1   = new Company("Company1", new Email("Email","yahoo.mail.com", 10));
        System.out.println(String.format("Compania %s furnizeaza reclama  %s prin %s la tariful de %d Euro",
                company1.getName(),company1.getAdvertisingProvider().getName(),company1.getAdvertisingProvider().getChanel()
                ,company1.getAdvertisingProvider().getTariff()));

        Company company2    = new Company("Company2",new PrintAdvertising("Print", "postere", 20));
        System.out.println(String.format("Compania %s furnizeaza reclama  %s prin %s la tariful de %d Euro",
                company2.getName(),company2.getAdvertisingProvider().getName(),company2.getAdvertisingProvider().getChanel()
                ,company2.getAdvertisingProvider().getTariff()));

        Company company3 = new Company("Company3", new Facebook("Facebook", "Facebook.com" , 5));
        System.out.println(String.format("Compania %s furnizeaza reclama %s prin %s la tariful de %d Euro",
                company3.getName(), company3.getAdvertisingProvider().getName(), company3.getAdvertisingProvider().getChanel(),
                company3.getAdvertisingProvider().getTariff()));

    }
}
