/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mchavez.umg.coursemanager.views;

import com.mchavez.umg.coursemanager.Coursemanager;
import com.mchavez.umg.coursemanager.classes.Course;
import com.mchavez.umg.coursemanager.classes.Student;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author marlon
 */
public class AssignStudent extends javax.swing.JPanel {

  
    public AssignStudent() {
        initComponents();
        jComboBox1.putClientProperty("JComponent.roundRect", true);
        jComboBox2.putClientProperty("JComponent.roundRect", true);
        jComboBox3.putClientProperty("JComponent.roundRect", true);
        jTable1.setModel(new DefaultTableModel());
        setDataComboBox();
    }
   
    
    public void setDataComboBox() {
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();
        for(Student e : Coursemanager.students){
            jComboBox2.addItem(e.getName());
        }
         
         for(Course c : Coursemanager.courses){
            jComboBox1.addItem(c.getName());
        }
         
         for(Course c : Coursemanager.courses){
            jComboBox3.addItem(c.getName());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 240, 37));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 240, 38));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Curso");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Estudiante");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jButton3.setBackground(new java.awt.Color(115, 181, 68));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 240, 40));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Asignar estudiante");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(23, 107, 135));
        jPanel2.setForeground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Filtrar estudiantes");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Curso");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 240, 37));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 340, 260));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 90, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 460, 510));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/welcome-bg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Course courseSelected = null;
        Student studentSelected = null;

        for (Course c : Coursemanager.courses) {
            if (c.getName().equals(jComboBox1.getSelectedItem().toString())) {
                courseSelected = c;
                break;
            }
        }

        for (Student s : Coursemanager.students) {
            if (s.getName().equals(jComboBox2.getSelectedItem().toString())) {
                studentSelected = s;
                break;
            }
        }

        if (studentSelected != null && courseSelected != null) {
            boolean alreadyAssigned = false;
            for (Student s : courseSelected.getStudents()) {
                if (s.getName().equals(studentSelected.getName())) {
                    alreadyAssigned = true;
                    break;
                }
            }

            if (alreadyAssigned) {
                JOptionPane.showMessageDialog(this, "El estudiante ya está asignado a este curso.",
                "Operación fallida", JOptionPane.ERROR_MESSAGE);
            } else {
                  courseSelected.students.add(studentSelected);
                  JOptionPane.showMessageDialog(this, "Estudiante asignado exitosamente.");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Course courseSelected = null;
         jTable1.setModel(new DefaultTableModel());
        for (Course c : Coursemanager.courses) {
            if (c.getName().equals(jComboBox3.getSelectedItem().toString())) {
                courseSelected = c;
                break;
            }
        }

        if (courseSelected != null) {
           
            DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre", "Usuario"}, 0);

            
            for (Student student : courseSelected.getStudents()) {
                Object[] row = {student.getName(), student.getUser()};
                data.addRow(row);
            }

           
            jTable1.setModel(data);
        } else {
            jTable1.setModel(new DefaultTableModel());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
