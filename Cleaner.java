package com.company;

public class Cleaner extends Worker implements Maintenance {



    //constructor
    Cleaner(){
        super();
    }

    Cleaner(String firstName, String lastName, int id, String phoneNumber, int hourlySalary,int monthlyHours, int taxPrecent){
        super(firstName, lastName, id, phoneNumber, hourlySalary, monthlyHours, taxPrecent);
    }




    //Cleaner("Yossi", "Levi", 20004040, "0505556661", 80, 20, 10)

    @Override
    public String responsibility() {
        return "cleanliness";
    }

    //toString
    public String toString(){
        return super.toString();
    }
}
