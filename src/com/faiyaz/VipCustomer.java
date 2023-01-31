package com.faiyaz;

public class VipCustomer {
    private String name;
    private double creditlimit;
    private String email;

    public VipCustomer() {
    this("default name" , 500000.00, "dav@gmail.com");
    }

    public VipCustomer(String name, double creditlimit) {
        this(name, creditlimit, "vad@email.com");
    }

    public VipCustomer(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
