package com.brent;
import java.util.Scanner;
public class Practice2 {
    Scanner sc = new Scanner(System.in);
    void futureinvestment(){
        double investamt;
        int years;
        double rate;
        System.out.println("Input the investment amount: ");
        investamt = sc.nextDouble();
        System.out.println("Input the number of years: ");
        years = sc.nextInt();
        System.out.println("Input the rate of interest: ");
        rate = sc.nextDouble();

        double futureinvestment;
        futureinvestment = (investamt * years * rate);
        System.out.println("The future investment value is "+futureinvestment);

    }

    public static void main(String[] args) {
        Practice2 dave = new Practice2();
        dave.futureinvestment();
    }

    }


