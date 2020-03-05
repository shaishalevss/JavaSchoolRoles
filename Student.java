package com.company;
import java.util.*;


public class Student extends Human {
    protected Vector <Course> courses = new Vector <Course>();
    protected Vector grades = new Vector();
    protected String degreeName;
    protected int degreeYear;

    //constructors
    Student(){
        super();
    };

    Student(String firstName, String lastName, int id, String phoneNumber, String degreeName, int degreeYear){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.degreeName = degreeName;
        this.degreeYear = degreeYear;
    }

    //getters
    public Vector getCourses(){
        return courses;
    }

    public Vector getGrades(){
        return grades;
    }

    //setters
    public void setCourses(Vector courses){
        this.courses = courses;
    }

    public void setGrades(Vector grades){
        this.grades = grades;
    }


    //push grade and course into the vectors
    public void addCourse(Course courseName, int grade){
        courses.add(courseName);
        grades.add(grade);
    }

    //returns the average of the student's grades
    public double getAverage(){
        double total = 0;
        int nakazSum = 0;
        int gradeMultiplyNakazSum = 0;
        for (int i = 0; i < grades.size(); i++){
            gradeMultiplyNakazSum += (int)grades.get(i)*courses.get(i).getNakaz();
            nakazSum += courses.get(i).getNakaz();
        }
        total = gradeMultiplyNakazSum/nakazSum;

        return total;
    }

    //gets a course name and return it grade
    public int getGrade(Course courseName) {
        int saveSpot = (int)courses.indexOf(courseName);
        int val = (int)grades.get(saveSpot);
        return val;
    }

    //return the course with the lowest grade
    public Course getCourseLowGrade(){
        int min = 0;
        int saveILocation = 0;
        for(int i = 0; i < grades.size()-1; i++){
            if((int)(grades.get(i)) <= (int)(grades.get(i+1))){
                saveILocation = i;
            } else{
                saveILocation = i+1;
            }
        }
        return courses.get(saveILocation);
    }



    //toString
    public String toString(){
        return super.toString();
    }
}
