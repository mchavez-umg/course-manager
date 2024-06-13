/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mchavez.umg.coursemanager.views;

import com.mchavez.umg.coursemanager.Coursemanager;
import com.mchavez.umg.coursemanager.classes.Student;
import com.mchavez.umg.coursemanager.classes.Teacher;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author marlon
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        setImageLabel(jLabel3, "src/main/java/com/mchavez/umg/coursemanager/assets/icons/usuario.png");
        setImageLabel(jLabel9, "src/main/java/com/mchavez/umg/coursemanager/assets/icons/cerrar.png");
        setImageLabel(jLabel6, "src/main/java/com/mchavez/umg/coursemanager/assets/acceso.png");

        jPasswordField1.putClientProperty("JComponent.roundRect", true);
        jTextField2.putClientProperty("JComponent.roundRect", true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/bg-login.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 107, 135));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 570));

        jPanel4.setBackground(new java.awt.Color(253, 253, 253));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("AnjaliOldLipi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 107, 135));
        jLabel5.setText("Usuario");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 60, 30));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 20, 20));

        jLabel8.setFont(new java.awt.Font("AnjaliOldLipi", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(23, 107, 135));
        jLabel8.setText("Contraseña");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 90, 30));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 20, 20));

        jButton1.setBackground(new java.awt.Color(4, 54, 74));
        jButton1.setFont(new java.awt.Font("Mallanna", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICAR SESION");
        jButton1.setAlignmentY(0.0F);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 310, 40));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(4, 54, 74));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 280, 40));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setForeground(new java.awt.Color(4, 54, 74));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 280, 40));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 120, 120));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 107, 135));
        jLabel4.setText("Login");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/bg-login.png"))); // NOI18N
        jLabel2.setText("LOf");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 570));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 470, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String user = jTextField2.getText();
         String password = jPasswordField1.getText();
        
        if("admin".equals(user)&&"admin".equals(password)){
            AdminHome a = new AdminHome();
            a.setVisible(true);
            this.dispose();
        }
        else {
            boolean isStudent = false;
            boolean isTeacher = false;
            
            for (Teacher teacher : Coursemanager.teachers) {
                if (teacher.getUser().equals(user) && teacher.getPassword().equals(password)) {
                    Coursemanager.teacherloged = teacher;
                    isTeacher = true;
                    break;
                }
            }

            if (!isTeacher) {
                for (Student student : Coursemanager.students) {
                    if (student.getUser().equals(user) && student.getPassword().equals(password)) {
                        Coursemanager.studentLoged = student;
                        isStudent = true;
                        break;
                    }
                }
            }

            if (isTeacher) {
                TeacherHome teacherHome = new TeacherHome();
                teacherHome.setVisible(true);
                this.dispose();
            } else if (isStudent) {
                StudentHome studentHome = new StudentHome();
                studentHome.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
