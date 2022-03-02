package com.lizgunther.javabasics;

public class Trainee extends Employee {

    public Trainee (long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    public double calculateTransportAllowance() {
        return 0;
    }
}

