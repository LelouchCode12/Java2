package com.university.people;

public abstract class Human {

    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void introduce();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}