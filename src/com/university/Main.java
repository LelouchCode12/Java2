package com.university;

import com.university.interfaces.IStudy;
import com.university.interfaces.IWork;
import com.university.people.Employee;
import com.university.people.Human;
import com.university.people.Student;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Student("Aсанали", 19, "AITU");
        Human h2 = new Employee("Алихан", 25, 250000);

        Student s1 = new Student("Dana", 20, "KBTU");
        Employee e1 = new Employee("Махаббат", 40, 300000);

        IStudy studyRef = new Student("Сауле", 18, "ENU");
        IWork workRef = new Employee("Жанна", 45, 400000);

        h1.introduce();
        h1.sleep();

        h2.introduce();
        h2.sleep();

        s1.study();
        s1.passExam();
        s1.showUniversity();

        e1.work();
        System.out.println("Salary: " + e1.getSalary());
        e1.study();
        e1.passExam();

        studyRef.study();
        studyRef.passExam();

        workRef.work();
        System.out.println("Salary: " + workRef.getSalary());
    }
}
