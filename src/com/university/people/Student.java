package com.university.people;

import com.university.interfaces.IStudy;

public final class Student extends Human implements IStudy {

    private final String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am student " + name + ", " + age + " years old.");
    }

    @Override
    public void study() {
        System.out.println(name + " is studying at " + university);
    }

    @Override
    public void passExam() {
        System.out.println(name + " passed the exam!");
    }

    public final void showUniversity() {
        System.out.println("University: " + university);
    }
}