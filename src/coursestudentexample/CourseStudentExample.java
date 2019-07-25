/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursestudentexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author AYBU
 */
public class CourseStudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            Course math = new Course("Math");
            Course chem = new Course("Chemistry");
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Serife\\Documents\\NetBeansProjects\\Numbers.txt"))); 
            
            String line; 
            String[] splittedLine = null; 
            int count = 0;            
            
            while((line = br.readLine()) != null){ 
                    
                    splittedLine = line.split(" "); 
                        if(splittedLine[2].equals("Math")){
                            Student st = new Student(
                                    splittedLine[0],
                                    splittedLine[1], 
                                    Integer.parseInt(splittedLine[3]), 
                                    Double.parseDouble(splittedLine[4]), 
                                    Double.parseDouble(splittedLine[5]), 
                                    Double.parseDouble(splittedLine[6]));
                            math.addStudent(st);
                        }else{
                            Student st = new Student(splittedLine[0],splittedLine[1], Integer.parseInt(splittedLine[3]), Double.parseDouble(splittedLine[4]), 
                                    Double.parseDouble(splittedLine[5]), Double.parseDouble(splittedLine[6]));
                            chem.addStudent(st);
                        }
                        math.getList();
        }
        }catch (FileNotFoundException ex) { 
            System.out.println("Bulunamadi");
        } catch (IOException ex) {
            System.out.println("Bulunamadi");
        }
    }
}

    
    

