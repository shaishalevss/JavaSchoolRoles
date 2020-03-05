package com.company;


public class Lecturer extends Worker {
    protected String departmemt;
    protected int degreeNumber;

    //constructors
    Lecturer(){
        super();
    };
    Lecturer(String firstName, String lastName, int id, String phoneNumber, int hourlySalary, int monthlyHours, int taxPrecent, String departmemt, int degreeNumber){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.hourlySalary = hourlySalary;
        this.monthlyHours = monthlyHours;
        this.taxPrecent = taxPrecent;
        this.departmemt = departmemt;
        this.degreeNumber = degreeNumber;
    }

    //getters
    public String getDepartmemt(){
        return departmemt;
    }

    public int getDegreeNumber(){
        return degreeNumber;
    }

    //setters
    public void setDepartmemt(String departmemt){
        this.departmemt = departmemt;
    }

    public void setDegreeNumber(int degreeNumber){
        this.degreeNumber = degreeNumber;
    }

    //toString
    public String toString(){
        return super.toString() + " ,Department: " + departmemt + " " + degreeNumber;
    }
}
