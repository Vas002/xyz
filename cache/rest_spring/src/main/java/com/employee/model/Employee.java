package com.employee.model;

public class Employee {

    String address;
    Double salary;

    public Employee(String address, Double salary) {
        this.address = address;
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}


