package com.example.g3app;

public class Course {
    private String Name;
    private Double Grade;

    public Course(String name, Double grade) {
        Name = name;
        Grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getGrade() {
        return Grade;
    }

    public void setGrade(Double grade) {
        Grade = grade;
    }
}
