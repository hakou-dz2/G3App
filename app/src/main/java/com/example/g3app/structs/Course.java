package com.example.g3app.structs;

public class Course {
    private String Name;
    private Double Grade;
    private Double credit;
    private Double Coeff;

    public Course(String name, Double grade, Double credit, Double coeff) {
        Name = name;
        Grade = grade;
        this.credit = credit;
        Coeff = coeff;
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

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCoeff() {
        return Coeff;
    }

    public void setCoeff(Double coeff) {
        Coeff = coeff;
    }
}
