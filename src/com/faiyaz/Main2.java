package com.faiyaz;

public class Main2 {
    public static void main(String[] args) {
        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());
        System.out.println(customer.getCreditlimit());
        System.out.println(customer.getEmail());



        VipCustomer customer1 = new VipCustomer("Dara", 200000000);
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditlimit());
        System.out.println(customer1.getEmail());

        VipCustomer customer2 = new VipCustomer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditlimit());
        System.out.println(customer2.getEmail());
    }
}
