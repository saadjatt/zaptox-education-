/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import View.Finance;
import View.Login;
import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

    UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(com.jtattoo.plaf.hifi.HiFiLookAndFeel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         Databse.Load.load();
         new Login().setVisible(true);
        

        
//        Databse.Load.load();
  //      new Finance().setVisible(true);
    }
    
}
