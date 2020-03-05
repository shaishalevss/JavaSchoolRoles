package com.company;

public class Worker extends Human {
    protected int hourlySalary;
    protected int monthlyHours;
    protected int taxPrecent;

    //constructors
    Worker(){
        super();
    }

    public Worker(String firstName, String lastName, int id, String phoneNumber, int hourlySalary, int monthlyHours, int taxPrecent) {
        super(firstName, lastName, id, phoneNumber);
        this.hourlySalary = hourlySalary;
        this.monthlyHours = monthlyHours;
        this.taxPrecent = taxPrecent;
    }

    //getters
    public int getHourlySalary(){
        return hourlySalary;
    }

    public int getMonthlyHours(){
        return monthlyHours;
    }

    public int getTaxPrecent(){
        return taxPrecent;
    }

    //setters
    public void setHourlySalary(int hourlySalary){
        this.hourlySalary = hourlySalary;
    }

    public void setMonthlyHours(int monthlyHours){
        this.monthlyHours = monthlyHours;
    }

    public void setTaxPrecent(int taxPrecent){
        this.taxPrecent = taxPrecent;
    }

    //function that calculate and return the salary
    public double salary(){
        double totalAmount;
        double temp;
        temp =  ((100-(double)taxPrecent)/100);
        totalAmount = (hourlySalary*monthlyHours)*temp;  //x*y*(z/100)
        return totalAmount;
    }

    //toString
    public String toString(){
        return super.toString();
    }
}
