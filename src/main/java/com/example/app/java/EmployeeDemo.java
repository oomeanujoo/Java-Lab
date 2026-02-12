package com.example.app.java;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculatePay();

    public void showDetails() {
        System.out.println(name + " (ID: " + id + ")");
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    void calculatePay() {
        System.out.println("Salary for " + name + ": " + salary);
    }
}

class Contractor extends Employee {
    double rate;
    int hours;

    Contractor(String name, int id, double rate, int hours) {
        super(name, id);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    void calculatePay() {
        System.out.println("Pay for " + name + ": " + (rate * hours));
    }
}

// ✅ Only one public class allowed in a file, and it must match the filename
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee full = new FullTimeEmployee("Alice", 101, 60000.0);
        Employee contractor = new Contractor("Bob", 102, 50.0, 160);

        System.out.println("=== Full-Time Employee ===");
        full.showDetails();
        full.calculatePay();

        System.out.println("\n=== Contractor ===");
        contractor.showDetails();
        contractor.calculatePay();
    }
}
