package com.brent;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your grade");
        int grde = sc.nextInt();
        if (grde<=49){
            System.out.println("your grade is F");
        }else if(grde > 49 && grde < 60){
            System.out.println("your grade is C");
        } else if(grde > 59 && grde < 80){
        System.out.println("your grade is B");
    }  else if(grde > 79){
        System.out.println("your grade is A");
    }
    }
}
