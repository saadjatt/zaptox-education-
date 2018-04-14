/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databse;

/**
 *
 * @author HP
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Load {
    public static String url ="jdbc:mysql://localhost/server_login";
    public static String password ="";
    public static String user ="root";
    
    public static Connection con;
    
    public static void load() {
        try {
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Load");
        } catch (SQLException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    
    
    }
}
