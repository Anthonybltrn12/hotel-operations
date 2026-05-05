package com.pluralsight;

import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        Employee Chris = new Employee(123,"Chris","SOftware", 25.00, 0);
        Chris.punchIn(5);
        Chris.punchOut();
        System.out.println(Chris.getHoursWorked());


    }
}
