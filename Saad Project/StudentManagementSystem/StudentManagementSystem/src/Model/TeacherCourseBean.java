/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Saad Jatt
 */
public class TeacherCourseBean {
    private int courseId;

    @Override
    public String toString() {
        return ""+courseId ;
    }

    public TeacherCourseBean(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    
    
}
