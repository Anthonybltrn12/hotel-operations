package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void hours_should_be_totaled_correctly_after_shift(){
        //arrange
        Employee ant = new Employee(12,"Ant","Software",35.00, 0);
        ant.punchIn(7);
        ant.punchOut(12);
        int expectedOutput = 5;

        //act
        int actualOutput = ant.getHoursWorked();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void total_pay_should_be_added(){
        //arrange
        Employee ant = new Employee(12,"Ant","Software",10.00, 20);
        double expectedOutput = 200;

        //act
        double actualOutput = ant.getTotalPay();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void pay_should_reflect_overtime_hours(){
        //arrange
        Employee ant = new Employee(12,"Ant","Software",10.00, 50);
        double expectedOutput = 550;

        //act
        double actualOutput = ant.getTotalPay();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void should_get_correct_amount_of_overTime_hours(){
        //arrange
        Employee ant = new Employee(12,"Ant","Software",10.00, 60);
        int expectedOutput = 20;

        //act
        int actualOutput = ant.getOverTimeHours();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }

}