/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author c0664341
 */
public class Course extends Student {

    
    
    List<Student> student = new ArrayList<Student>();
    
    public Course() {
    }   
    
    public static void add(Student student)
    {
        
    }
    public static void remove(Student student)
    {
        
    }
    public static void remove(String id)
    {
        
    }
    public static void remove(int position)
    {
        
    }
    public static void insert(Student student, int position)
    {
        
    }
    public Student get(String id)
    {
        return null;
        
    }
     public Student get(int position)
    {
        return null;
        
    }
    public static List<Student> getAll()
    {
        return null;
        
    }    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        return true;
    }
    

    @Override
    public String toString() {
        return "Course{" + "student=" + student + '}';
    }
    

    public Set<Student> getAllByGender(String gender){
        return null;
        
    }
    public Map<String,Set<Student>> getGradeMap(){
        return null;
        
    }
    
    
    
    
    
    
}
