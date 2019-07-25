/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursestudentexample;

import java.util.ArrayList;

/**
 *
 * @author AYBU
 */
public class Course {
    private String courseName;
    private int numberOfStudents = 0;    
    private ArrayList<Student> students;
    
    public Course(String courseName){
        this.courseName = courseName;
        students = new ArrayList<Student>(); // students'i kullanabilmek için initialize ettik.
    }
    
    public void addStudent(Student student){
        students.add(student);
        numberOfStudents++;
    }
    
    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }
    
    public void getList(){
        for(int i=0; i<this.students.size(); i++){
            System.out.println(students.get(i).toString()); //student türünde bir obje döndürür.bunu da toStringe dönüþtürerek getirir.
        }
    }
}