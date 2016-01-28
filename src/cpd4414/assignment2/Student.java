/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2;

import java.util.Objects;

/**
 *
 * @author c0664341
 */
public class Student 
{
    String name;    
    String id;
    String gender;
    double grade;
    
    public Student() {
    }

    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return true;
    }
    
    

    public String toString()
    {
        return "{\"name\":\"" + getName()  + "\",\"id\":\"" + getId() + "\",\"gender\":\"" + getGender() + "\",\"grade\":\"" + getGrade() +"}";
    }
    
    
}
