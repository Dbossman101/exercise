package com.faiyaz;

public class Main1 {
    public static void main(String[] args) {
    Bank bank = new Bank();
    bank.setAccbal(100000);
    System.out.println(bank.getAccbal());
    bank.deposit();
    System.out.println(bank.getAccbal());

    bank.withdraw();
    System.out.println(bank.getAccbal());
    }


}
