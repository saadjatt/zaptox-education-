/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author HP
 */
import static Controller.CourseBAL.con;
import static Controller.LoginBAL.con;
import Model.LoginBean;
import Model.TeacherBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
public class TeacherBal {
    public static Connection con = Databse.Load.con;
    
    public static ArrayList<TeacherBean> getTeacher() {
        ArrayList<TeacherBean> t_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM teacher WHERE t_status ='1' ";
            PreparedStatement ps = con.prepareStatement(query);

            // ps.setString(1, name);
            //  ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id =rs.getInt("t_id");
                String t_name = rs.getString("t_name");
                String t_gemder = rs.getString("t_gender");
                int t_age = rs.getInt("t_age");
                String t_password = rs.getString("t_password");
                int status = rs.getInt("t_status");
               t_list.add(new TeacherBean(id, t_name, t_age, t_password, t_gemder) );

            }

        } catch (Exception e) {
            System.out.println("Error in getTeacher");
            e.printStackTrace();
        }
        return t_list;
    }
    
        public static int addTeacher(String name, String gender , int age ,String password ) {
        String query = "INSERT INTO `server_login`.`teacher` VALUES (NULL, '"+name+"', '"+gender+"', '"+age+"', '"+password+"','1','1');";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in addTeacher");
            e.printStackTrace();
        }
        return i;

    }
     
    public static int updateTeacher(int id, String name, String gender , int age , String password ) {
        String query = "UPDATE `server_login`.`teacher` SET `t_name` = '"+name+"' , `t_gender` = '"+gender+"' , `t_age` = '"+age+"' , `t_password` = '"+password+"' WHERE `t_id` = '"+id+"'";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in updateTeacher");
            e.printStackTrace();
        }
        return i;

    }
    
       public static int cascadeDel(int Id) {
        String query = "UPDATE `server_login`.`teacher` SET `t_status` = '0' , `t_list` = '0' WHERE `t_id` = '"+Id+"'";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in delTeacher");
            e.printStackTrace();
        }
        return i;
    }
       
       
       public static ArrayList<TeacherBean> getTeacherAssign() {
        ArrayList<TeacherBean> t_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM teacher WHERE  t_list ='1' AND t_status='1'";
            PreparedStatement ps = con.prepareStatement(query);

            // ps.setString(1, name);
            //  ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id =rs.getInt("t_id");
                String t_name = rs.getString("t_name");
                String t_gemder = rs.getString("t_gender");
                int t_age = rs.getInt("t_age");
                String t_password = rs.getString("t_password");
                int status = rs.getInt("t_status");
               t_list.add(new TeacherBean(id, t_name, t_age, t_password, t_gemder) );

            }

        } catch (Exception e) {
            System.out.println("Error in getTeacher");
            e.printStackTrace();
        }
        return t_list;
    }
       
       
       
       public static int assignTeacherID(int Id) {
        String query = "UPDATE `server_login`.`teacher` SET  `t_list` = '0' WHERE `t_id` = '"+Id+"'";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in delTeacher");
            e.printStackTrace();
        }
        return i;
    }
       
         public static ArrayList<TeacherBean> getSearch(String name) {
       ArrayList<TeacherBean> list1 = new ArrayList<>();
        try {
            String query = "SELECT * FROM teacher WHERE t_name LIKE '%"+name+"%' AND t_status='1'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
           // System.out.println("Done");
            while (rs.next()) {
                int id =rs.getInt("t_id");
                String t_name = rs.getString("t_name");
                String t_gemder = rs.getString("t_gender");
                int t_age = rs.getInt("t_age");
                String t_password = rs.getString("t_password");
                int status = rs.getInt("t_status");
               list1.add(new TeacherBean(id, t_name, t_age, t_password, t_gemder));
                //System.out.println(list);
            }
        } catch (Exception e) {
            System.out.println("Error in getcustomer");
            e.printStackTrace();
        }
        return list1;
    }
       
    
    
       
       
       
    
}
    
    
    
