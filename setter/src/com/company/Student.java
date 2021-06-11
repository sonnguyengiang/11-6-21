package com.company;

public class Student {
    private int age = 14;
    private String name = "nam";
    public Student() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void display() {
        System.out.println(getName() + " " + getAge());
    }
}
