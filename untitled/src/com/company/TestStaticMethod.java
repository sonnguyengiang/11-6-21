package com.company;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(1,"nam");
        Student student2 = new Student(2,"minh");
        Student student3 = new Student(3,"bao");

        student1.display();
        student2.display();
        student3.display();
    }
}
