/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StudentBAL;
import Model.StudentBean;
import Model.TeacherBean;
import java.awt.Toolkit;
import java.net.URL;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saad Jatt
 */
public class StudentCRUD extends javax.swing.JInternalFrame {

    /**
     * Creates new form StudentCRUD
     */
    int teacherid;
    ArrayList <StudentBean> s_list;
    
    DefaultTableModel t_model;
    public StudentCRUD() {
        initComponents();
        s_list= new ArrayList<StudentBean>();
        t_model = (DefaultTableModel) this.jTable_std1.getModel();
        s_list= Controller.StudentBAL.getStudnet();
        teacherid=( TeacherForm.teacher_id-1);
        System.out.println(teacherid);
        this.jLabel_teacher.setText(Login.name);
        this.jLabel_course.setText(TeacherForm.course);
        
        showintable(teacherid);
        
        
        
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel_city = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_std1 = new javax.swing.JTable();
        jTextField_name = new javax.swing.JTextField();
        jLabel_stdname = new javax.swing.JLabel();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jLabel_age = new javax.swing.JLabel();
        jLabel_gender = new javax.swing.JLabel();
        jSpinner_age = new javax.swing.JSpinner();
        jLabel_teacher = new javax.swing.JLabel();
        jLabel_course = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_city = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Add Students");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_city.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel_city.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_city.setText("From");
        getContentPane().add(jLabel_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jTable_std1.setBackground(new java.awt.Color(102, 102, 102));
        jTable_std1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 255)));
        jTable_std1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable_std1.setForeground(new java.awt.Color(255, 255, 255));
        jTable_std1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Form"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_std1.setGridColor(new java.awt.Color(0, 102, 204));
        jTable_std1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_std1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_std1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 290, 263));
        getContentPane().add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 121, 101, -1));

        jLabel_stdname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel_stdname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_stdname.setText("Student Name");
        getContentPane().add(jLabel_stdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 124, -1, -1));

        jRadioButton_male.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton_male);
        jRadioButton_male.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_male.setText("Male");
        getContentPane().add(jRadioButton_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 179, -1, -1));

        jRadioButton_female.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton_female);
        jRadioButton_female.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_female.setText("Female");
        getContentPane().add(jRadioButton_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel_age.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel_age.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_age.setText("Age");
        getContentPane().add(jLabel_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 155, 31, -1));

        jLabel_gender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel_gender.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_gender.setText("Gender ");
        getContentPane().add(jLabel_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 183, -1, -1));

        jSpinner_age.setModel(new javax.swing.SpinnerNumberModel(12, 12, 40, 1));
        getContentPane().add(jSpinner_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 152, 87, -1));

        jLabel_teacher.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_teacher.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_teacher.setText("jLabel1");
        getContentPane().add(jLabel_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 29, -1, -1));

        jLabel_course.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_course.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_course.setText("jLabel1");
        getContentPane().add(jLabel_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 46, -1, -1));

        jTextField_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_searchMouseClicked(evt);
            }
        });
        jTextField_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_searchKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 81, 164, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 84, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Students of ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 29, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subject");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 46, -1, -1));

        jComboBox_city.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox_city.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hyderabad City", "Karachi", "Jamshoro", "TandoJam ", " ", " " }));
        jComboBox_city.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBox_city.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jComboBox_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 116, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setToolTipText("Save Student");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setToolTipText("Update Student");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 90, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setToolTipText("Delete Student");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 100, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/std.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_std1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_std1MouseClicked
        // TODO add your handling code here:
        int id = this.jTable_std1.getSelectedRow();

        this.jTextField_name.setText(s_list.get(id).getName());
        //this.jTextField_city.setText(s_list.get(id).getCity());

        String gender = s_list.get(id).getGender();

        //String city = s_list.get(id).getCity();

        int age = s_list.get(id).getAge();

        this.jSpinner_age.setValue(Integer.valueOf(age));

        if (gender.equals("Male")){
            this.jRadioButton_male.setSelected(true);

        }
        else if (gender.equals("Female")){
            this.jRadioButton_female.setSelected(true);

        }
    }//GEN-LAST:event_jTable_std1MouseClicked
static int id = 0;
    private void jTextField_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_searchMouseClicked

    private void jTextField_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchKeyReleased
        // TODO add your handling code here:
        String name = this.jTextField_search.getText();
        //System.out.println(teacherid+"----------"+name);
                 SearchTable(teacherid-1,name);
        
    }//GEN-LAST:event_jTextField_searchKeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         String name = this.jTextField_name.getText();
        int age = (int) this.jSpinner_age.getValue();
    
        String city="";
            if (this.jComboBox_city.getSelectedIndex() ==0){
            city = "Hyderabad City";
            }
            else if (this.jComboBox_city.getSelectedIndex() ==1){
            city = "Karachi";
            }
            else if (this.jComboBox_city.getSelectedIndex() ==2){
            city = "Jamshoro";
            }
            else if (this.jComboBox_city.getSelectedIndex() ==3){
            city = "Tandojam";
            }
        String gender = "";
        int t_id=  (TeacherForm.teacher_id-2);
        //System.err.println("Tid====="+t_id);
        
        if (this.jRadioButton_male.isSelected()){
            gender="Male";
           // s_list.add(new StudentBean(id++,  name,age, gender, city));
            Controller.StudentBAL.addStudent(name, age, gender, city, t_id,TeacherForm.course,TeacherForm.fees);
            showintable(teacherid);

        }

        else  if (this.jRadioButton_female.isSelected()){
            gender="Female";
            // name = "Miss. "+this.jTextField_tName.getText();
          //  s_list.add(new StudentBean(id,  name,age, gender, city));
       //   System.out.println("Teacher Id-----"+TeacherForm.teacher_id);
             Controller.StudentBAL.addStudent(name, age, gender, city, t_id,TeacherForm.course,TeacherForm.fees);
            showintable(teacherid);

        }

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
             if (this.jTextField_name.getText().equals("")){

            JOptionPane.showMessageDialog(this, "Please Select Row First which you want to Update");

        }
        else{

            int id=this.jTable_std1.getSelectedRow();
            String t_name = this.jTextField_name.getText();
            //String city = this.jTextField_city.getText();
            String city="";
            if (this.jComboBox_city.getSelectedIndex() ==0){
            city = "Hyderabad City";
            }
            else if (this.jComboBox_city.getSelectedIndex() ==1){
            city = "Karachi";
            }
            else if (this.jComboBox_city.getSelectedIndex() ==2){
            city = "Jamshoro";
            }
            else if (this.jComboBox_city.getSelectedIndex() ==3){
            city = "Tandojam";
            }
            String gender = s_list.get(id).getGender();
            int  age =(int) this.jSpinner_age.getValue();

            if (this.jRadioButton_male.isSelected()){
                gender ="Male";
                int i = Controller.StudentBAL.updateStudent(s_list.get(id).getStudentId(), t_name, age, gender, city);

                showintable(teacherid);
            }
            else if (this.jRadioButton_female.isSelected()){
                gender ="Female";

                int i =Controller.StudentBAL.updateStudent(s_list.get(id).getStudentId(), t_name, age, gender, city);

                  showintable(teacherid);
            }
            else {JOptionPane.showMessageDialog(this, "Please Select the Gender type");}

        }

        this.jTextField_name.setText("");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        if (this.jTextField_name.getText().equals("")){

            JOptionPane.showMessageDialog(this, "Please Select Row First which you want to Delete");

        }
        else{
            int s_id=   s_list.get(this.jTable_std1.getSelectedRow()).getStudentId();
         
            
            
            int i = Controller.StudentBAL.cascadeDel(s_id);
            JOptionPane.showMessageDialog(this, i + " record deleted");
               showintable(teacherid);
           // showintable(teacherid);
            this.jTextField_name.setText("");
          ///  this.jTextField_city.setText("");
            this.jSpinner_age.setValue(Integer.valueOf(12));

        }
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox_city;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_age;
    private javax.swing.JLabel jLabel_city;
    private javax.swing.JLabel jLabel_course;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_stdname;
    private javax.swing.JLabel jLabel_teacher;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_age;
    private javax.swing.JTable jTable_std1;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
 public void ShowInTable(){
         t_model.setRowCount(0);
         s_list = Controller.StudentBAL.getStudnet();
        for(StudentBean st:s_list){
            Vector v=new Vector();
                v.add(st.getName());
                v.add(st.getAge());
                v.add(st.getGender());
                v.add(st.getCity());
                    t_model.addRow(v);

          }
    }
 
  public void showintable(int teacher_id) {
        t_model.setRowCount(0);
        
        s_list= StudentBAL.getTeacherStudent((teacher_id-1));
         for (StudentBean studentBean : s_list) {
             Vector V = new Vector();
             V.add(studentBean.getName());
             V.add(studentBean.getAge());
             V.add(studentBean.getGender());
             V.add(studentBean.getCity());
             V.add(studentBean.getT_course());
      t_model.addRow(V);
         }

  }
  
public void SearchTable(int t ,String name){
       t_model.setRowCount(0);
s_list = Controller.StudentBAL.getSearch(t,name);

    for (StudentBean studentBean : s_list) {
        Vector V = new Vector();
         V.add(studentBean.getName());
             V.add(studentBean.getAge());
             V.add(studentBean.getGender());
             V.add(studentBean.getCity());
             V.add(studentBean.getT_course());
       
        t_model.addRow(V);
        
    }

}

}
