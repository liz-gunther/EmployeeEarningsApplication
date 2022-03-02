package com.lizgunther.javabasics;

public class Manager extends Employee {

    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    @Override
    public double calculateTransportAllowance() {
        return (.15 * getBasicSalary());
    }
}


