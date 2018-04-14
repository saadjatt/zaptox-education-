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
public class AssignBean {
    private int id;
    private String teacherName;
    private String courseName;

    public AssignBean(int id, String teacherName, String courseName) {
        this.id = id;
        this.teacherName = teacherName;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return  teacherName + courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
}
