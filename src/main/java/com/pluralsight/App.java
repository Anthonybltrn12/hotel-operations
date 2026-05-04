package com.pluralsight;

public class App {

    public static void main(String[] args) {
        Employee Chris = new Employee(123,"Chris","SOftware", 25.00, 35);
        System.out.println(Chris.getTotalPay());
    }
}
