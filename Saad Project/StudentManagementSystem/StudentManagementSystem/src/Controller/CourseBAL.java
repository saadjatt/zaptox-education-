/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.TeacherBal.con;
import Model.CourseBean;
import Model.SubjectBean;
import Model.TeacherBean;
import Model.TeacherCourseBean;
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
public class CourseBAL {
    
       public static Connection con = Databse.Load.con;
    
    public static ArrayList<CourseBean> getCourse() {
        ArrayList<CourseBean> c_list = new ArrayList<>();
        try {
            String query = "SELECT* FROM course WHERE c_status = '1' ";
            PreparedStatement ps = con.prepareStatement(query);

            // ps.setString(1, name);
            //  ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id =rs.getInt("c_id");
                String c_name = rs.getString("c_name");
                String c_time = rs.getString("c_duration");
               Double c_mothly =Double.parseDouble( rs.getString("c_fee"));
                String c_status = rs.getString("c_status");
                
                
               c_list.add(new CourseBean(id, c_name,c_time,c_mothly) );

            }

        } catch (Exception e) {
            System.out.println("Error in getCourse");
            e.printStackTrace();
        }
        return c_list;
    }
    
    public static int addCourse(String name,String time ,double fee ) {
        String query = "INSERT INTO `server_login`.`course`  VALUES (NULL, '"+name+"', '"+time+"', '"+fee+"','1')";
        int i = 0;
        try {
            Statement st = con.createStatement();
            i = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error in addCourse");
            e.printStackTrace();
        }
        return i;

    }
        public static int updateCourse(int id, String name, String time ,double fee ) {
        String query = " UPDATE `server_login`.`course` SET `c_name` = '"+name+"' , `c_duration` = '"+time+"' , `c_fee` = '"+fee+"' WHERE `c_id` = '"+id+"'";
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
    
       public static int cascadeDel(int Id) {
        String query = " UPDATE `server_login`.`course` SET `c_status` = '0' WHERE `c_id` = '"+Id+"' ";
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
    
       
           public static ArrayList<HashMap<String, Object>> getAssignCourse() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        try {
            String query = "SELECT teacher, course FROM course INNER JOIN teacher USING(student_id) INNER JOIN SUBJECT USING(subject_id)";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                map.put("student_name", rs.getString("student_name"));
                map.put("subject_name", rs.getString("subject_name"));
                list.add(map);
                
            }
        } catch (Exception e) {
            System.out.println("Error in getStudentSubject");
            e.printStackTrace();
        }
        System.out.println("---"+list);
        return list;
    }
           
              public static int assignCourse(int t_id,int c_id ) {
        String query = " UPDATE `server_login`.`course` SET `t_id` = '"+t_id+"' WHERE `c_id` = '"+c_id+"' ";
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
              
              
      public static TeacherCourseBean getCourseId(int tid,String t_name) {
         
         TeacherCourseBean Idbean=null;
    try{     
        
        String query="SELECT * FROM teacher_course WHERE t_id=? or t_name =?";
     PreparedStatement ps = con.prepareStatement(query);
     
     
 ps.setInt(1, tid);
 ps.setString(2, t_name);
     
     ResultSet rs = ps.executeQuery();
        
    while(rs.next()){
        int course_id=rs.getInt("c_id");
     
     
     Idbean=new TeacherCourseBean(course_id);
 
    }
        
    
     
     
     } catch(Exception e){
         System.out.println("Error in getCourseId");
         e.printStackTrace();
     }
         
     return Idbean;
             }
      
      
      public static  SubjectBean getCourse(int course_id) {
         
         SubjectBean subBean=null;
    try{     
        
        String query="SELECT * FROM course WHERE c_id=?" ;
     PreparedStatement ps = con.prepareStatement(query);
     // Statement st=con.createStatement();
     
 ps.setInt(1,course_id);
 // ps.setString(2, pas);
     
     ResultSet rs = ps.executeQuery();
        
    while(rs.next()){
     String course=rs.getString("c_name");
     double fee =Double.parseDouble(rs.getString("c_fee"));
     
     subBean=new SubjectBean(course,fee);
 
    }
        
     } catch(Exception e){
         System.out.println("Error in getCourse");
         e.printStackTrace();
     }
    return subBean;
             }
      
      
         
         public static ArrayList<CourseBean> getSearch(String name) {
       ArrayList<CourseBean> list1 = new ArrayList<>();
        try {
            String query = "SELECT * FROM course WHERE c_name LIKE '%"+name+"%' AND c_status='1' ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
           // System.out.println("Done");
            while (rs.next()) {
                        int id =rs.getInt("c_id");
                String c_name = rs.getString("c_name");
                String c_time = rs.getString("c_duration");
               Double c_mothly =Double.parseDouble( rs.getString("c_fee"));
                String c_status = rs.getString("c_status");
                
                
               list1.add(new CourseBean(id, c_name,c_time,c_mothly) );
            }
        } catch (Exception e) {
            System.out.println("Error in getcustomer");
            e.printStackTrace();
        }
        return list1;
    }
              
              
}
