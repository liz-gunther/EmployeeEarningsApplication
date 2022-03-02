package com.lizgunther.javabasics;

public class Employee {

    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary = 65000;
    private double specialAllowance = 250.80;
    private double hra = 1000.50;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        return salary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateTransportAllowance() {
        return (0.10) * basicSalary;
    }
}