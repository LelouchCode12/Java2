package com.university.people;

import com.university.interfaces.IStudy;
import com.university.interfaces.IWork;

public class Employee extends Human implements IWork, IStudy {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am employee " + name);
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void study() {
        System.out.println(name + " is learning new skills.");
    }

    @Override
    public void passExam() {
        System.out.println(name + " passed a certification exam.");
    }
}
