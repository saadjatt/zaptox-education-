/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.TeacherBal.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author HP
 */

public class CourseAssignBAL {
      public static Connection con = Databse.Load.con;

        public static ArrayList<HashMap<String, Object>> GetAssignCourse() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        try {
            String query = "SELECT t.t_name,c_name FROM teacher_course tc INNER JOIN teacher t USING(t_id) INNER JOIN course USING(c_id)";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HashMap<String, Object> map = new HashMap<String, Object>();
               
                map.put("t_name", rs.getString("t_name"));
                map.put("c_name", rs.getString("c_name"));
                list.add(map);
                
            }
        } catch (Exception e) {
            System.out.println("Error in getStudent Join");
            e.printStackTrace();
        }
       // System.out.println("---"+list);
        return list;
    }
        
        
           
       public static int assignTeacherCourse(int t_id,int c_id ,String t_name ) {
        String query = "INSERT INTO `server_login`.`teacher_course`  VALUES ('"+t_id+"', '"+c_id+"','"+t_name+"','1')";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in assignCourse");
            e.printStackTrace();
        }
        return i;
    }
        
    
}

    

