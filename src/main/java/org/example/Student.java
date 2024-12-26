package org.example;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Book>studentBooks;

    public Student(String name, int age, List<Book> studentBooks) {
        this.name = name;
        this.age = age;
        this.studentBooks = studentBooks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getStudentBooks() {
        return studentBooks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentBooks=" + studentBooks +
                '}';
    }
}
