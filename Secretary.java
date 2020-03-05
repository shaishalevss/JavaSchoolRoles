package com.company;

public class Secretary extends Worker implements administration, isGetCar {



    //constructor
    Secretary(){
        super();
    }

    Secretary(String firstName, String lastName, int id, String phoneNumber, int hourlySalary,int monthlyHours, int taxPrecent){
        super(firstName, lastName, id, phoneNumber, hourlySalary, monthlyHours, taxPrecent);
    }


    @Override
    public int level() {
        return 1;
    }

    @Override
    public String permission() {
        return "all";
    }

    @Override
    public String model() {
        return "audi";
    }


    //permission - all level - 1
    //toString
    public String toString(){
        return super.toString() + ", Permission: " + permission() + ", Level: " + level();
    }
}
