/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
public class FinanceBean {
    String name ;
    String course ;
    String teacher ;
     double fees;

    @Override
    public String toString() {
        return "FinanceBean{" + "name=" + name + ", course=" + course + ", teacher=" + teacher + ", fees=" + fees + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
     
     
    public FinanceBean(String name, String course, String teacher, double fees) {
        this.name = name;
        this.course = course;
        this.teacher = teacher;
        this.fees = fees;
    }
   
    
    
}
