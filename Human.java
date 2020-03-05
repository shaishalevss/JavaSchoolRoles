package com.company;
import java.util.*;

public abstract class Human {
    Scanner in = new Scanner(System.in);

    protected String firstName;
    protected String lastName;
    protected int id;
    protected String phoneNumber;

    //constructor
    public Human(){ };

    public Human(String firstName, String lastName, int id, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getFirstName (){
        return firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public int getId (){
        return id;
    }

    public String getPhoneNumber (){
        return phoneNumber;
    }

    //setter
    public void  setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String role() {
        return this.getClass().getSimpleName();
    }

    //toString
    public String toString(){
        return "First Name: " + firstName + " ,Last Name: " + lastName + " ,Id: " + id + " ,Phone: " + phoneNumber;
    }

}
