/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.StudentBean;
import Model.SubjectBean;
import Model.TeacherCourseBean;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saad Jatt
 */
public class TeacherForm extends javax.swing.JFrame {

    /**
     * Creates new form Teacher
     */
public   static  int teacher_id;
public   static  String course;
public   static  double fees;
public static  String teacher_Name ;
ArrayList<StudentBean> list;
    DefaultTableModel model;

    public TeacherForm() {
        initComponents();
        icon();
        model= (DefaultTableModel) this.jTable_fee.getModel();
        list= new ArrayList<>();
        teacher_id = new Login().teacherID;
       // System.out.println(teacher_id);
        teacher_Name = new Login().teacherName;
        
        //System.out.println(teacher_id);
        
        TeacherCourseBean tc = Controller.CourseBAL.getCourseId(teacher_id, teacher_Name);
        
       
       
        String i = ""+tc;
        int c_id = Integer.parseInt(i);
        
          SubjectBean subBean= Controller.CourseBAL.getCourse(c_id);
          course=""+subBean;
          fees=subBean.getFee();
       
          this.jLabel_teacherName.setText(""+Login.name);
          this.jLabel_course.setText(""+course);
          
          
          showIntable();
        
        
        
        
        
        
    }

  private void icon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tacher.png")));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel_teacherName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_fee = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_course = new javax.swing.JLabel();
        jLabel_Logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_teacherName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_teacherName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_teacherName.setText("jLabel1");
        jDesktopPane1.add(jLabel_teacherName);
        jLabel_teacherName.setBounds(700, 20, 150, 40);

        jTable_fee.setBackground(new java.awt.Color(102, 102, 102));
        jTable_fee.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTable_fee.setForeground(new java.awt.Color(255, 255, 255));
        jTable_fee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Course", "Fees", "Paid/Unpaid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_fee.setGridColor(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(jTable_fee);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 280, 220);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(650, 70, 60, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fee Submission Area");
        jButton1.setToolTipText("Student Fee Submission Mode");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(700, 500, 230, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(650, 20, 40, 40);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Students");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(30, 310, 100, 20);

        jLabel_course.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_course.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_course.setText("jLabel1");
        jDesktopPane1.add(jLabel_course);
        jLabel_course.setBounds(700, 70, 140, 40);

        jLabel_Logout.setToolTipText("Logout Teacher");
        jLabel_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LogoutMouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel_Logout);
        jLabel_Logout.setBounds(810, 120, 130, 30);

        jLabel1.setToolTipText("Add / VIew Students");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(290, 260, 370, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/teacher.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 950, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseClicked
        // TODO add your handling code here:
       new   Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel_LogoutMouseClicked

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
             StudentCRUD c = new StudentCRUD();
        this.jDesktopPane1.add(c);
        c.show();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FeeSubmit c = new FeeSubmit();
        this.jDesktopPane1.add(c);
        c.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Logout;
    private javax.swing.JLabel jLabel_course;
    private javax.swing.JLabel jLabel_teacherName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_fee;
    // End of variables declaration//GEN-END:variables
public void showIntable(){
model.setRowCount(0);
   // System.out.println("t_id===="+teacher_id);
list = Controller.StudentBAL.getTeacherStudent((teacher_id-2));
    for (StudentBean sb : list) {
        Vector v = new Vector();
        
        v.add(sb.getName());
        v.add(sb.getT_course());
        v.add(sb.getFees());
        v.add(sb.getPaid());
        
        model.addRow(v);
        
        
    }



}

}
