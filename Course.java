package com.company;

public class Course {
    protected String courseName;
    protected int nakaz;
    protected Lecturer lecturerName;

    //constructors
    public Course(){
        super();
    };
    public Course(String courseName, int nakaz, Lecturer lecturerName){
        super();
        this.courseName = courseName;
        this.nakaz = nakaz;
        this.lecturerName = lecturerName;
    };

    //getters
    public String getCourseName (){
        return courseName;
    }

    public int getNakaz (){
        return nakaz;
    }

    public Lecturer getLecturerName (){
        return lecturerName;
    }

    //setter
    public void setCourseName (String courseName){
        this.courseName = courseName;
    }

    public void setNakaz(int nakaz){
        this.nakaz = nakaz;
    }

    public void setLecturerName(Lecturer lecturerName){
        this.lecturerName = lecturerName;
    }


    //toString
    public String toString(){
        return "Name: " + courseName + " ,Nakaz: " +nakaz+ " ,Lecturer: " +lecturerName.getFirstName()+" " +lecturerName.getLastName();
    }

}

