package com.mchavez.umg.coursemanager.views;

import com.mchavez.umg.coursemanager.Coursemanager;
import com.mchavez.umg.coursemanager.classes.Student;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marlon
 */
public class ListStudents extends javax.swing.JPanel {


     public ListStudents() {
        initComponents();
        actualizarTabla();
    }
    
    
     public void actualizarTabla() {
        DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre", "Apellido"}, Coursemanager.students.size());
        jTable1.setModel(data);

        int row = 0;

        for (Student e : Coursemanager.students) {
            jTable1.setValueAt(e.getName(), row, 0);
            jTable1.setValueAt(e.getSecondName(), row, 1);
            row++;
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 69, 375, 330));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jLabel1.setText("Lista de estudiantes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 21, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 400, 160, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/welcome-bg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            UpdateStudent m = new UpdateStudent(jTable1.getSelectedRow());
            m.setVisible(true);
            m.setLocationRelativeTo(this);
        } else {
           JOptionPane.showMessageDialog(null, "Selecciona por lo menos un registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
