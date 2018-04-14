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
public class TeacherBean {
    private int id;
    private String name ;
    
    private int age ;
    private String password ;

    public TeacherBean(int id, String name, int age, String password, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
        this.gender = gender;
    }
    


    @Override
    public String toString() {
        return name;
    }
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
           
}
