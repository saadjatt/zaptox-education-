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
public class CourseBean {
    private int id ;
    private String course_name;
    private String time;
    private double fee;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public CourseBean(int id, String course_name, String time, double fee) {
        this.id = id;
        this.course_name = course_name;
        this.time = time;
        this.fee = fee;
    }

    
    @Override
    public String toString() {
        return course_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    
}
