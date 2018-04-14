/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.TeacherBal.con;
import Model.LoginBean;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class LoginBAL {

    public static Connection con = Databse.Load.con;

    public static ArrayList<LoginBean> getLoginAll() {
        ArrayList<LoginBean> list = new ArrayList<>();
        try {
            String query = "SELECT* FROM login";
            PreparedStatement ps = con.prepareStatement(query);

            // ps.setString(1, name);
            //  ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                String post = rs.getString("roll");
                list.add(new LoginBean(id,name, password, post));

            }

        } catch (Exception e) {
            System.out.println("Error in getMangaerFrame");
            e.printStackTrace();
        }
        return list;
    }

    public static LoginBean getLogin(String name, String password) {
        LoginBean bean = null;
        try {
            String query = "SELECT * FROM login WHERE NAME = '"+name+"' AND PASSWORD = '"+password+"' ";
            PreparedStatement ps = con.prepareStatement(query);

       
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String login_name = rs.getString("name");
                String passward = rs.getString("password");
                String post = rs.getString("roll");
                bean = new LoginBean(id,login_name, passward, post);
                
            }

        } catch (Exception e) {
            System.out.println("Error in getMangaerFrame");
            e.printStackTrace();
        }
        return bean;
    }

   
    
        public static int addTeacherLogin(String name ,String password) {
        String query = "INSERT INTO `server_login`.`login`  VALUES (NULL, '"+name+"', '"+password+"', 'Teacher')";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in addTeacherLogin");
            e.printStackTrace();
        }
        return i;

    }
        
            public static int updateLogin(int id, String name, String password ) {
        String query = "UPDATE `server_login`.`login` SET `name` = '"+name+"' , `password` = '"+password+"' WHERE `id` = '"+id+"'";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in updateLogin");
            e.printStackTrace();
        }
        return i;

    }
               public static int LoginDel(int Id) {
        String query = " DELETE FROM `server_login`.`login` WHERE `id` = '"+Id+"'";
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
  
}
