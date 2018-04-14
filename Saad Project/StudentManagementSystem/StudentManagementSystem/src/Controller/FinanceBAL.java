/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.StudentBAL.con;
import Model.FinanceBean;
import Model.StudentBean;
import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class FinanceBAL {
     public static Connection con = Databse.Load.con;
    
    public static ArrayList<FinanceBean> getStudentPaid() {
        ArrayList<FinanceBean> s_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student WHERE std_status='1' and std_paid='paid' ";
            PreparedStatement ps = con.prepareStatement(query);

    
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               // int std_id =rs.getInt("std_id");
                String std_name = rs.getString("std_name");
                int std_age = rs.getInt("std_age");
                
                String std_gender = rs.getString("std_gender");
                String std_city = rs.getString("std_city");
                String t_course = rs.getString("t_course");
                String t_id = rs.getString("t_id");
                        
                
                int std_status = rs.getInt("std_status");
                double fees = (double)rs.getInt("std_fees");
                String paid = rs.getString("std_paid");
               s_list.add(new FinanceBean(std_name, t_course, t_id, fees));

            }

        } catch (Exception e) {
            System.out.println("Error in getStudent");
            e.printStackTrace();
        }
        return s_list;
    }
    
    
      public static ArrayList<FinanceBean> getStudentUnpaid() {
        ArrayList<FinanceBean> s1_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student WHERE std_status='1' and std_paid='unpaid' ";
            PreparedStatement ps = con.prepareStatement(query);

    
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               // int std_id =rs.getInt("std_id");
                String std_name = rs.getString("std_name");
                int std_age = rs.getInt("std_age");
                
                String std_gender = rs.getString("std_gender");
                String std_city = rs.getString("std_city");
                String t_course = rs.getString("t_course");
                String t_id = rs.getString("t_id");
                        
                
                int std_status = rs.getInt("std_status");
                double fees = (double)rs.getInt("std_fees");
                String paid = rs.getString("std_paid");
               s1_list.add(new FinanceBean(std_name, t_course, t_id, fees));

            }

        } catch (Exception e) {
            System.out.println("Error in getStudentUnpaid");
            e.printStackTrace();
        }
        return s1_list;
    }
    
      
       public static ArrayList<StudentBean> getStudentData(String name) {
        ArrayList<StudentBean> s_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM student WHERE std_status='1'  and std_name '"+name+"' and std_fees = 'unpaid'";
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
}
