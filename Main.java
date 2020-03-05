package com.company;

public class Main {

    public static void main(String[] args) {
        Worker yossi = new Cleaner("Yossi", "Levi", 20004040, "0505556661", 80, 20, 10);
        System.out.println(yossi);
        //firstName - Yossi ,lastName - Levi ,id - 20004040 ,phone - 0505556661
        System.out.println(((Maintenance) yossi).responsibility());
        //cleanliness
        Worker ploni = new Secretary("ploni", "almoni", 20004042, "0505556662", 20, 50, 10);
        System.out.println(ploni);
        //firstName - ploni ,lastName - almoni ,id - 20004042 ,phone - 0505556662 ,permission - all level - 1
        if(ploni instanceof isGetCar)
            System.out.println(((isGetCar) ploni).model());
        //audi

    }
}