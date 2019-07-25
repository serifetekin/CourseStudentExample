/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursestudentexample;

/**
 *
 * @author AYBU
 */
public class Student {
    private String name;
    private String surname;
    private int age;
    private double md1, md2, fin;
    
    public Student(String name, String surname, int age, double md1, double md2, double fin){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.md1 = md1;
        this.md2 = md2;
        this.fin = fin;
    }
    
    public double getAverage(){
        return this.md1*0.30 + this.md2*0.30 + this.fin*0.40;
    }
    
    public String toString(){
        return this.name + " " + this.surname + " " + this.md1 + " " + this.md2 + " " + this.fin + " " + this.getAverage();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the md1
     */
    public double getMd1() {
        return md1;
    }

    /**
     * @param md1 the md1 to set
     */
    public void setMd1(double md1) {
        this.md1 = md1;
    }

    /**
     * @return the md2
     */
    public double getMd2() {
        return md2;
    }

    /**
     * @param md2 the md2 to set
     */
    public void setMd2(double md2) {
        this.md2 = md2;
    }

    /**
     * @return the fin
     */
    public double getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(double fin) {
        this.fin = fin;
    }
    
}
