package com.faiyaz;
import java.util.Scanner;
public class Bank {
    private double accnum;
    private double accbal;
    private String name;
    private String email;
    private int pnum;

    private Scanner sc = new Scanner(System.in);

    public double getAccnum() {
        return accnum;
    }

    public void setAccnum(double accnum) {
        this.accnum = accnum;
    }

    public double getAccbal() {
        return accbal;
    }

    public void setAccbal(double accbal) {
        this.accbal = accbal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }
    void deposit(){
        System.out.println("How much do you want to deposit: ");
        double deposit = sc.nextDouble();
        this.accbal = this.accbal + deposit;
    }
    void withdraw(){
        double withdraw = sc.nextDouble();
        if (withdraw>accbal){
            System.out.println("Insufficient funds");
        }else {
            System.out.println("How much do you want to withdraw: ");
            this.accbal = this.accbal - withdraw;
        }
    }
}



