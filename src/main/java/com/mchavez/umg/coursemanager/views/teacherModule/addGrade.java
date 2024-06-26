/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mchavez.umg.coursemanager.views.teacherModule;

import com.mchavez.umg.coursemanager.Coursemanager;
import com.mchavez.umg.coursemanager.classes.Course;
import com.mchavez.umg.coursemanager.classes.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author marlon
 */
public class addGrade extends javax.swing.JFrame {

    Student studentSelected;
    Course courseSelected;

    public addGrade() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public addGrade(String nameCourse, String nameStudent) {
        initComponents();
        this.setLocationRelativeTo(this);
        studentSelected = new Student();

        for (Course course : Coursemanager.courses) {
            if (course.getName().equals(nameCourse)) {
                courseSelected = course;
                break;
            }
        }

        for (Student student : Coursemanager.students) {
            if (student.getName().equals(nameStudent)) {
                studentSelected = student;
                break;
            }
        }

        if (courseSelected == null) {
            System.out.println("El curso '" + nameCourse + "' no se encontró.");
        }

        if (studentSelected == null) {
            System.out.println("El estudiante '" + nameStudent + "' no se encontró.");
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, 40));

        jLabel1.setText("Nota:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 40));

        jButton2.setBackground(new java.awt.Color(115, 181, 68));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, 40));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel12.setText("Asignar Nota");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/backgroundLogin.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuTeacher menu = new menuTeacher();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (courseSelected != null && studentSelected != null) {
            try {
                double gradeValue = Double.parseDouble(jTextField1.getText());
                if (gradeValue >= 0 && gradeValue <= 100) {
                    studentSelected.addGrade(courseSelected, gradeValue);
                    JOptionPane.showMessageDialog(this, "Nota agregada exitosamente al estudiante " + studentSelected.getName() + " para el curso " + courseSelected.getName(),
                            "Éxito", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    JOptionPane.showMessageDialog(null, "La nota a asignar debe ser de 0 a 100",
                            "Operación fallida", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar la nota. Asegúrate de ingresar un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar la nota. Asegúrate de seleccionar un curso y un estudiante válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
