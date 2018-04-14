/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginBAL;
import Model.LoginBean;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.time.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.util.converter.LocalTimeStringConverter;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login_form
     */
    
    boolean flag = false;
    public static String name ;
    int time = 0;
public  static String password ;
public static  int teacherID ;
public static  String teacherName ;

    
    public Login() {
        
        initComponents();
        icon();
        this.setTitle("Admin Login");
        this.setResizable(false);
        this.setLocation(290, 300);
        watch();
        
        
    }
    int hour,min,sec,am_pm =0;
    String day,NowTime;
    public void watch(){
    
    new Thread() {
            public void run() {
                while (time == 0) {
                    Calendar cal = new GregorianCalendar();
                     hour = cal.get(Calendar.HOUR);
                     min = cal.get(Calendar.MINUTE);
                     sec = cal.get(Calendar.SECOND);
                     am_pm = cal.get(Calendar.AM_PM);
                    
                    
                    if (am_pm == 1) {
                        day = "PM";
                    } else {
                        day = "AM";
                        
                    }
                    
                     NowTime = hour + ":" + min + ":" + sec + " " + day;
                    Watch.setText(NowTime);
                    
                }
                
            }
            
        }.start();
}
    
    private void icon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("login.png")));
        
    }

    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_login = new javax.swing.JButton();
        jTextField_user = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jLabel1_user = new javax.swing.JLabel();
        jLabel1_user1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Watch = new javax.swing.JLabel();
        jLabel_invalid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton_login.setText("Login");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jTextField_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_userKeyReleased(evt);
            }
        });

        jPasswordField_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_passKeyReleased(evt);
            }
        });

        jLabel1_user.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel1_user.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1_user.setText("Password");

        jLabel1_user1.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel1_user1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1_user1.setText("Username");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGIN-logo.jpg"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Forgot Password");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        Watch.setFont(new java.awt.Font("Loopy", 1, 36)); // NOI18N
        Watch.setForeground(new java.awt.Color(0, 51, 255));
        Watch.setText(".");
        Watch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel_invalid.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel_invalid.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_invalid, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1_user)
                                    .addComponent(jLabel1_user1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(40, 40, 40)
                                        .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_user)
                                        .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23))
                    .addComponent(Watch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Watch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton_login))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_invalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed



         name = this.jTextField_user.getText();
       password = this.jPasswordField_pass.getText();
        
     LoginBean bean = LoginBAL.getLogin(name, password); //login DB Shifted into ArrayList
        if (bean == null) {
            this.jLabel_invalid.setText("Invalid user or password..!!");
        } else if (bean.getPost().equals("Admin")) {
             new Admin().setVisible(true);
            this.dispose();
        }
        
        
        else if (bean.getPost().equals("Teacher")) {
            this.dispose();
            
                    teacherID = bean.getId();
                    teacherName =bean.getName();
          

         
          
             new TeacherForm().setVisible(true);
        
        }
        else if (bean.getPost().equals("Finance")) {
             new Finance().setVisible(true);
            this.dispose();
        }
        
        
        else {
            JOptionPane.showMessageDialog(this, "Please put correct Password or Username ");
            this.jTextField_user.setText("");
            this.jPasswordField_pass.setText("");
        }
         
        
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        
        JOptionPane.showMessageDialog(this, "For Teacher : Sir Ali\nFor Admin: Saad\nFor Finance: asd ");
    }//GEN-LAST:event_jLabel4MousePressed

    private void jTextField_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_userKeyReleased
        
           this.jLabel_invalid.setText("");
    }//GEN-LAST:event_jTextField_userKeyReleased

    private void jPasswordField_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_passKeyReleased
        
           this.jLabel_invalid.setText("");
    }//GEN-LAST:event_jPasswordField_passKeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login_form().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Watch;
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_user;
    private javax.swing.JLabel jLabel1_user1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_invalid;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_user;
    // End of variables declaration//GEN-END:variables
}
