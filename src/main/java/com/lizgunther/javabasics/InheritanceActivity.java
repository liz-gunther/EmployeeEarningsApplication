package com.lizgunther.javabasics;

public class InheritanceActivity {
    public static void main(String[] args) {

        Employee employee = new Manager (126534, "Peter", "Chennai India", 237844,
                65000);

        double salary = employee.calculateSalary();
        System.out.println("Manager's salary is: " + salary);
        System.out.println("Manager's travel allowance is: " + employee.calculateTransportAllowance());

        Employee trainee = new Trainee (29846, "Jack", "Mumbai India", 442085,
                45000);

        double traineeSalary = trainee.calculateSalary();
        System.out.println("Trainee's salary is: " + traineeSalary);
        System.out.println("Trainee's travel allowance is: " + employee.calculateTransportAllowance());



    }
}
