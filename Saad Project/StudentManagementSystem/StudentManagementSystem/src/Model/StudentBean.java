/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class StudentBean {
    private int studentId;
    private int age;
    private String name;
    private String gender;
    private String city;
   private int t_id;
   private String t_course;
   private double fees;
   private String paid;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name;
    }

    public StudentBean(int studentId, int age, String name, String gender, String city, int t_id, String t_course, double fees, String paid) {
        this.studentId = studentId;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.t_id = t_id;
        this.t_course = t_course;
        this.fees = fees;
        this.paid = paid;
    }


    

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_course() {
        return t_course;
    }

    public void setT_course(String t_course) {
        this.t_course = t_course;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }
    
    
            
    
}
