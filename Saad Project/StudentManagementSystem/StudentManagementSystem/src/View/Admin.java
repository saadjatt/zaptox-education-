/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.LoginBean;
import Model.TeacherBean;
import java.awt.Toolkit;
//import static View.Teacher.s_list;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    ArrayList<LoginBean> t_list;
    ArrayList<TeacherBean> t1_list;
    DefaultTableModel model;
    
    public Admin() {
        initComponents();
        icon();
        model = (DefaultTableModel) this.jTable1.getModel();
        t_list= new ArrayList<>();
        t1_list= new ArrayList<>();
    
        ShowInTable();
       int id = this.jTable1.getSelectedRow();
       Watch();
      
        
    }
    public Admin(String s) {
        initComponents();
        model = (DefaultTableModel) this.jTable1.getModel();
        t_list= new ArrayList<>();
    
        ShowInTable();
       int id = this.jTable1.getSelectedRow();
       
    }
    
    int time = 0;
        public void Watch(){
    
    new Thread() {
            public void run() {
                while (time == 0) {
                    Calendar cal = new GregorianCalendar();
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int am_pm = cal.get(Calendar.AM_PM);
                    
                    String day;
                    if (am_pm == 1) {
                        day = "PM";
                    } else {
                        day = "AM";
                        
                    }
                    
                    String NowTime = hour + ":" + min + ":" + sec + " " + day;
                    watch.setText(NowTime);
                    
                }
                
            }
            
        }.start();
}

    private void icon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("admin.png")));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        watch = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_assCourse = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 102, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 156, 143);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teachers Login Keys");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(20, 230, 120, 20);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(780, 140, 160, 40);

        watch.setFont(new java.awt.Font("Loopy", 1, 36)); // NOI18N
        watch.setForeground(new java.awt.Color(0, 102, 204));
        watch.setText("Watch");
        jDesktopPane1.add(watch);
        watch.setBounds(640, 530, 230, 50);

        jLabel3.setText(" ");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(290, 410, 380, 50);

        jLabel_assCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_assCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_assCourseMouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel_assCourse);
        jLabel_assCourse.setBounds(290, 340, 380, 50);

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(290, 280, 380, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/21123992_1559031044149529_2068902867_n.jpg"))); // NOI18N
        jLabel4.setText(" ");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(0, 0, 960, 610);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("Vew Record");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("View");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all.png"))); // NOI18N
        jMenuItem1.setText("All Record");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
    
        
//        this.jTextField_city.setText(s_list.get(id).getCity());
//        
    }//GEN-LAST:event_jTable1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel_assCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_assCourseMouseClicked
        // TODO add your handling code here:
         CourseCRUD c =new CourseCRUD();
       this.jDesktopPane1.add(c);
        c.show();
    }//GEN-LAST:event_jLabel_assCourseMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
               TeacherCRUD c =new TeacherCRUD();
       this.jDesktopPane1.add(c);
        c.show();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         AssignTeacher c =new AssignTeacher();        

       this.jDesktopPane1.add(c);
        c.show();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Record().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Admin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_assCourse;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel watch;
    // End of variables declaration//GEN-END:variables

    public void ShowInTable(){
model.setRowCount(0);
t1_list = Controller.TeacherBal.getTeacher();
for (TeacherBean tb : t1_list) {
                
                Vector v = new Vector();
        v.add(tb.getName());
        v.add(tb.getPassword());
        model.addRow(v);
                
            }
            
        
        
      
        
        
        
    }


}

