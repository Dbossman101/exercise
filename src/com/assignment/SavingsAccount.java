//Create   a  SavingsAccount   class.
//Use   a   static   data  member  annualInterestRate to store  the annual interest rate for each of the savers.
//Each member of the class contains a private data member savingsBalance indicating the amount the saver currently has ondeposit.
//Provide member function calculateMonthlyInterest that calculates the monthlyinterest by multiplying the  balance  by  annualInterestRate  divided  by  12;  this  interestshould be added to savingsBalance.
// Provide a static member functionmodifyInterestRate that sets the static annualInterestRate to a new value.
//Write a driverprogram   to   test   class   SavingsAccount.
//Instantiate   two   different   objects   of   classSavingsAccount,   saver1   and   saver2,   with   balances   of   $2000.00   and   $3000.00,respectively.
//Set   the   annualInterestRate   to   3   percent.   Then   calculate   the   monthlyinterest   and   print   the   new   balances   for   each   of   the   savers.Then set theannualInterestRate to 4 percent,
//calculate the next month's interest and print the newbalances for each of the savers.
package com.assignment;
import java.util.Scanner;
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        System.out.println("The monthly interest: "+monthlyInterest);
        savingsBalance = monthlyInterest + savingsBalance;
        System.out.println("Your balance: "+savingsBalance);
    }
    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.03);


        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        SavingsAccount.modifyInterestRate(0.04);

    }
}
