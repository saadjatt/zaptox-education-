/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.FinanceBAL.con;
import Model.BalanceBean;
import Model.FinanceBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class BalanceBAL {
    
    public static double getTotalBalance() {
       double total=0.0;
        try {
            String query = "SELECT sum(std_fees) total FROM student WHERE std_status='1' and std_paid='paid' ";
            PreparedStatement ps = con.prepareStatement(query);

    
            ResultSet rs = ps.executeQuery();
             
            while (rs.next()) {
               // int std_id =rs.getInt("std_id");
                total = rs.getDouble("total");
                
               

            }

        } catch (Exception e) {
            System.out.println("Error in totalBalnace");
            e.printStackTrace();
        }
        return total;
    }
    
     public static double getRemainBalance() {
       double remain=0.0;
        try {
            String query = "SELECT sum(std_fees) remain FROM student WHERE std_status='1' and std_paid='unpaid' ";
            PreparedStatement ps = con.prepareStatement(query);

    
            ResultSet rs = ps.executeQuery();
             
            while (rs.next()) {
               // int std_id =rs.getInt("std_id");
                remain = rs.getDouble("remain");
                
               

            }

        } catch (Exception e) {
            System.out.println("Error in totalBalnace");
            e.printStackTrace();
        }
        return remain;
    }
    
}
