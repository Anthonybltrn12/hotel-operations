package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int startTime;


    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getTotalPay(){
        double totalPay = 0;
        if(this.hoursWorked > 40){
            totalPay = (this.getRegularHours() * this.payRate) + (this.getOverTimeHours() * (this.payRate * 1.5));
        }else{
            totalPay = this.getRegularHours() * this.payRate;
        }
        return totalPay;
    }
    public int getRegularHours(){

        if(this.hoursWorked <= 40){
           return this.hoursWorked;
        }
        return 40;

    }
    public int getOverTimeHours(){
        int overTime = 0;
        if(this.hoursWorked > 40){
            overTime = this.hoursWorked - 40;
        }
        return overTime;
    }

    public void punchIn(int time){
       this.startTime = time;
    }
    public void punchOut(int time){

        this.hoursWorked += time - this.startTime;
    }
}
