package com.brent;
import java.util.Scanner;
public class Area {
    private static final double pie = 3.142;
    public static void main(String[]args) {
        Area dav = new Area();
        Area vad = new Area();
        Area sam = new Area();
        Area mas = new Area();
        Area cbe = new Area();
        System.out.println("Enter 1 for rectangle/n Enter 2 for triangle/n Enter 3 for circle/n Enter 4 for trapezium/n Enter 5 for cube");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Enter two numbers");
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("The area of the rectangle is " + dav.area(a, b));
            }
            case 2 -> {
                System.out.println("Enter two numbers");
                Scanner scanner1 = new Scanner(System.in);
                double p = scanner1.nextDouble();
                double q = scanner1.nextDouble();
                System.out.println("The area of the triangle is " + vad.area(p, q));
            }
            case 3 -> {
                System.out.println("Enter a number");
                Scanner scanner2 = new Scanner(System.in);
                double f = scanner2.nextDouble();
                System.out.println("The area of the circle is " + sam.area(f));
            }
            case 4 -> {
                System.out.println("Enter three numbers");
                Scanner scanner3 = new Scanner(System.in);
                double x = scanner3.nextDouble();
                double y = scanner3.nextDouble();
                double z = scanner3.nextDouble();
                System.out.println("The area of the trapezium is " + mas.area(x, y, z));
            }
            case 5 -> {
                System.out.println("Enter any number");
                Scanner scanner4 = new Scanner(System.in);
                int c = scanner4.nextInt();
                System.out.println("The area of the cube is " + cbe.area(c));
            }
        }
    }
    int area(int a, int b) {
        return a * b;
    }

    double area(double p, double q) {
        return (0.5 * p * q);
    }

    double area(double f) {
        return (0.5 * (f * f) * pie);
    }
    double area(double x, double y, double z ) {
        return (0.5 * (x + y) * z);
    }
    int area(int c) {
        return (6 * (c * c));
    }
}



