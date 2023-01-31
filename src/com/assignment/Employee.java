//Write a program by creating an 'Employee' class having the following methods and printthe final salary.
// 1 - 'getInfo()' which takes the salary, number of hours of work per day of employee asparameter
// 2   -   'AddSal()'   which   adds   $10   to   salary   of   the   employee   if   it   is   less   than   $500.
// 3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work perday is more than 6 hours.
package com.assignment;
import java.util.Scanner;
public class Employee {
    private double salary;
    private int hours;
    public void getinfo(double salary, int hours){
        System.out.println("Enter your salary");
        Scanner sc = new Scanner(System.in);
        this.salary = sc.nextDouble();
        System.out.println("Enter the number of hours you work");
        this.hours = sc.nextInt();
    }
    public void addSal(){
        if(this.salary<500){
            this.salary = 10 + this.salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public void AddWork(){
        if(hours>6){
            this.salary = this.salary + 5;
        }

    }

    public static void main(String[] args) {
       Employee employee = new Employee();
       employee.getinfo(employee.salary, employee.hours);
       employee.addSal();
       employee.AddWork();
       System.out.println(employee.getSalary());
    }
}
