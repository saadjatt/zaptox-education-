/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.TeacherBal.con;
import Model.StudentBean;
import Model.TeacherBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class StudentBAL {
  public static Connection con = Databse.Load.con;
    
    public static ArrayList<StudentBean> getStudnet() {
        ArrayList<StudentBean> s_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student WHERE std_status='1' ";
            PreparedStatement ps = con.prepareStatement(query);

            // ps.setString(1, name);
            //  ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int std_id =rs.getInt("std_id");
                String std_name = rs.getString("std_name");
                int std_age = rs.getInt("std_age");
                
                String std_gender = rs.getString("std_gender");
                String std_city = rs.getString("std_city");
                String t_course = rs.getString("t_course");
                int t_id = rs.getInt("t_id");
                        
                
                int std_status = rs.getInt("std_status");
                double fees = (double)rs.getInt("std_fees");
                String paid = rs.getString("std_paid");
               s_list.add(new StudentBean(std_id, std_age, std_name, std_gender, std_city, t_id, t_course,fees,paid));
               

            }

        } catch (Exception e) {
            System.out.println("Error in getStudent");
            e.printStackTrace();
        }
        return s_list;
    }
    
       public static ArrayList<StudentBean> getTeachersStudent(int teacherId) {
        ArrayList<StudentBean> stu_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student WHERE t_id = "+teacherId;
            PreparedStatement ps = con.prepareStatement(query);


            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("std_id");
               String name=  rs.getString("std_name");
                int age = rs.getInt("std_age");
                String gender = rs.getString("std_gender");
                String city = rs.getString("std_city");
                
                int status = rs.getInt("std_status");
                String course= rs.getString("t_course");
                int teacher_id = rs.getInt("t_id");
              
                
               // stu_list.add(new StudentBean(id, age, name, gender, city, teacher_id, course));
                 double fees = (double)rs.getInt("std_fees");
                String paid = rs.getString("std_paid");
              stu_list.add(new StudentBean(id, age, name, gender, city, teacher_id, course,fees,paid));
               

            }
        } catch (Exception e) {
            System.out.println("Error in getTransation");
            e.printStackTrace();
        }

        return stu_list;
    }
    
    
       public static int addStudent(String name, int age,String gender,String city ,int t_id , String course,double fees) {
        String query = "INSERT INTO `server_login`.`student`  VALUES (NULL, '"+name+"', '"+age+"', '"+gender+"', '"+city+"', '1', '"+t_id+"', '"+course+"', '"+fees+"', 'Unpaid')";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in addStudent");
            e.printStackTrace();
        }
        return i;

    }
    
         public static int updateStudent(int id, String name,int age, String gender ,String city) {
        String query = " UPDATE `server_login`.`student` SET `std_name` = '"+name+"' , `std_age` = '"+age+"' ,`std_gender` = '"+gender+"', `std_city` = '"+city+"' WHERE `std_id` = '"+id+"'";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in updateCustomer");
            e.printStackTrace();
        }
        return i;

    }
         
            public static int cascadeDel(int id) {
        String query = "UPDATE `server_login`.`student` SET `std_status` = '0' WHERE `std_id` = '"+id+"' ";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in delCustomer");
            e.printStackTrace();
        }
        return i;
    }
            
            public static ArrayList<StudentBean> getTeacherStudent(int teacherId) {
        ArrayList<StudentBean> stu_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student WHERE t_id = "+teacherId+" and std_status= '1' ";
            PreparedStatement ps = con.prepareStatement(query);


            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("std_id");
               String name=  rs.getString("std_name");
                int age = rs.getInt("std_age");
                String gender = rs.getString("std_gender");
                String city = rs.getString("std_city");
                
                int status = rs.getInt("std_status");
                String course= rs.getString("t_course");
                int teacher_id = rs.getInt("t_id");
              
                
               // stu_list.add(new StudentBean(id, age, name, gender, city, teacher_id, course));
                 double fees = (double)rs.getInt("std_fees");
                String paid = rs.getString("std_paid");
              stu_list.add(new StudentBean(id, age, name, gender, city, teacher_id, course,fees,paid));
               

            }
        } catch (Exception e) {
            System.out.println("Error in getStudentsWithInitially");
            e.printStackTrace();
        }

        return stu_list;
    }
            
            
            public static ArrayList<StudentBean> getStudentFee() {
        ArrayList<StudentBean> stu_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student  where std_status= '1' ";
            PreparedStatement ps = con.prepareStatement(query);


            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("std_id");
               String name=  rs.getString("std_name");
                int age = rs.getInt("std_age");
                String gender = rs.getString("std_gender");
                String city = rs.getString("std_city");
                
                int status = rs.getInt("std_status");
                String course= rs.getString("t_course");
                int teacher_id = rs.getInt("t_id");
              
                
               // stu_list.add(new StudentBean(id, age, name, gender, city, teacher_id, course));
                 double fees = (double)rs.getInt("std_fees");
                String paid = rs.getString("std_paid");
              stu_list.add(new StudentBean(id, age, name, gender, city, teacher_id, course,fees,paid));
               

            }
        } catch (Exception e) {
            System.out.println("Error in getStudentsWithInitially");
            e.printStackTrace();
        }

        return stu_list;
    }
            
            public static ArrayList<StudentBean> getSearch(int te_id,String name) {
       ArrayList<StudentBean> list1 = new ArrayList<>();
        try {
            String query = "SELECT * FROM student WHERE std_name LIKE '%"+name+"%' AND t_id='"+te_id+"' and std_status = '1'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
           // System.out.println("Done");
            while (rs.next()) {
                int std_id =rs.getInt("std_id");
                String std_name = rs.getString("std_name");
                int std_age = rs.getInt("std_age");
                
                String std_gender = rs.getString("std_gender");
                String std_city = rs.getString("std_city");
                String t_course = rs.getString("t_course");
                int t_id = rs.getInt("t_id");
                int std_status = rs.getInt("std_status");
                 double fees = (double)rs.getInt("std_fees");
                String paid = rs.getString("std_paid");
                
               list1.add(new StudentBean(std_id, std_age, std_name, std_gender, std_city, t_id, t_course,fees,paid));
               

            }
        } catch (Exception e) {
            System.out.println("Error in getSearch");
            e.printStackTrace();
        }
        return list1;
    }
            
              public static int feeSubmit(int Id) {
        String query = " UPDATE student SET std_paid = 'Paid' WHERE std_id = '"+Id+"'";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in feesubmit");
            e.printStackTrace();
        }
        return i;
    }

         
}
