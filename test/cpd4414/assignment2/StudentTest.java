/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0664502
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }
    
    @Test
     public void testStuGetName() 
     {
         
        System.out.println("getName");        
        Student instance = new Student("Parth", "123", "M", 4.0);
        String expResult = "Parth";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);        
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getId();
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testStuGetId() 
     {
         
        System.out.println("getName");        
        Student instance = new Student("Parth", "123", "M", 4.0);
        String expResult = "123";
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Student instance = new Student();
        instance.setId(id);
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getGender();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStuGetGender() 
     {
         
        System.out.println("getName");        
        Student instance = new Student("Parth", "123", "M", 4.0);
        String expResult = "M";
        String result = instance.getGender();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Student instance = new Student();
        instance.setGender(gender);
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testStuGetGrade() 
     {
         
        System.out.println("getGrade");
        Student instance = new Student("Parth", "123", "M", 4.0);
        double expResult = 4.0;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 0.0;
        Student instance = new Student();
        instance.setGrade(grade);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Object();
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "{\"name\":\"" + instance.getName()  + "\",\"id\":\"" + instance.getId() + "\",\"gender\":\"" + instance.getGender() + "\",\"grade\":\"" + instance.getGrade() +"}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testobjectwiththesamenameandid() {
        System.out.println("equals");
        
        Student instance = new Student("Parth", "123", "M", 4.0);
        Student instance2 = new Student("Parth", "123", "M", 4.0);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testobjectwiththesamenamebutadifferentid() {
        System.out.println("equals");
        
        Student instance = new Student("Parth", "c1235", "M", 4.0);
        Student instance2 = new Student("Parth", "c12345", "M", 4.0);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }

     @Test
    public void testobjectwiththesameidbutadifferentname() {
        System.out.println("equals");
        
        Student instance = new Student("Parth","c1235", "M", 4.0);
        Student instance2 = new Student("jaynee","c1235", "M", 4.0);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testobjectwithbothadifferentidandadifferentname() {
        System.out.println("equals");
        
        Student instance = new Student("Parth","c1235", "M", 4.0);
        Student instance2 = new Student("jaynee","c12345", "M", 4.0);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
    
    
}
