/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mchavez.umg.coursemanager.views.studentModule;

import com.mchavez.umg.coursemanager.Coursemanager;
import com.mchavez.umg.coursemanager.classes.Grade;
import com.mchavez.umg.coursemanager.classes.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marlon
 */
public class listStudentGrades extends javax.swing.JPanel {

    Student userStudentLoged = Coursemanager.studentLoged;

    public listStudentGrades() {
        initComponents();
        actualizarTabla();
    }

    public void actualizarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Curso");
        modelo.addColumn("Nota Final");

        Map<String, Grade> latestGrades = new HashMap<>();

        for (Student student : Coursemanager.students) {
            if (student.getName().equals(userStudentLoged.getName())) {
                List<Grade> grades = student.getGrades();
                if (grades != null) {
                    for (Grade grade : grades) {
                        latestGrades.put(grade.getCourse().getName(), grade);
                    }
                }
            }
        }

        for (Map.Entry<String, Grade> entry : latestGrades.entrySet()) {
            Grade grade = entry.getValue();
            modelo.addRow(new Object[]{
                grade.getCourse().getName(),
                grade.getGrade()
            });
        }

        jTable1.setModel(modelo);
    }

    private void calcularPromedio() {
        double sumaNotas = 0;
        int totalCursos = 0;
        for (Student student : Coursemanager.students) {
            if (student.getName().equals(userStudentLoged.getName())) {
                List<Grade> grades = student.getGrades();
                if (grades != null) {
                    for (Grade grade : grades) {
                        totalCursos = totalCursos + 1;
                        sumaNotas += grade.getGrade();
                        double promedio = sumaNotas / totalCursos;
                        jLabel1.setText(String.valueOf(promedio));
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Listado de calificaciones");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 640, 350));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Listado de calificaciones");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Promedio: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, 20));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("0");
        jLabel1.setAlignmentY(0.1F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 70, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setText("Generar Promedio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 180, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/bg-login.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calcularPromedio();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}