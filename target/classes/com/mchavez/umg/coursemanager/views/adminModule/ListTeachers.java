
package com.mchavez.umg.coursemanager.views.adminModule;

import com.mchavez.umg.coursemanager.Coursemanager;
import static com.mchavez.umg.coursemanager.Coursemanager.teachers;
import com.mchavez.umg.coursemanager.classes.Teacher;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marlon
 */
public class ListTeachers extends javax.swing.JPanel {

   
    public ListTeachers() {
        initComponents();
        actualizarTabla();
    }

    public void actualizarTabla() {
        DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre", "Apellido", "Usuario", "Contraseña", "Especialidad"}, Coursemanager.teachers.size());
        jTable1.setModel(data);
      

        int row = 0;

        for (Teacher e : Coursemanager.teachers) {
            jTable1.setValueAt(e.getName(), row, 0);
            jTable1.setValueAt(e.getSecondName(), row, 1);
            jTable1.setValueAt(e.getUser(), row, 2);
            jTable1.setValueAt(e.getPassword(), row, 3);
            jTable1.setValueAt(e.getEspecialidad(), row, 4);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 375, 330));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jLabel1.setText("Lista de profesores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 24, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 110, 30));

        jButton2.setText("Guardar CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 400, 130, -1));

        jButton3.setText("Cargar CSV");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 130, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/welcome-bg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable1.getSelectedRow() >= -1) {
            UpdateTeacher m = new UpdateTeacher(jTable1.getSelectedRow());
            m.setVisible(true);
            m.setLocationRelativeTo(this);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona por lo menos un registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this, "Guardar");
        if (retorno == JFileChooser.APPROVE_OPTION) {
            saveFile(archivo.getSelectedFile().toPath().toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this, "Cargar");
        if (retorno == JFileChooser.APPROVE_OPTION) {
            readFile(archivo.getSelectedFile().toPath().toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    public void readFile(String rutaConNombre) {
        try {
            File f = new File(rutaConNombre);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(",");

                String user = data[2];
                boolean exists = false;

                for (Teacher teacher : Coursemanager.teachers) {
                    if (teacher.getUser().equals(user)) {
                        teacher.setName(data[0]);
                        teacher.setSecondName(data[1]);
                        teacher.setPassword(data[3]);
                        teacher.setEspecialidad(data[4]);
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    Teacher e = new Teacher();
                    e.setName(data[0]);
                    e.setSecondName(data[1]);
                    e.setUser(data[2]);
                    e.setPassword(data[3]);
                    e.setEspecialidad(data[4]);
                    Coursemanager.teachers.add(e);
                }
            }

            actualizarTabla();
            fr.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void saveFile(String file) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(file);
            pw = new PrintWriter(fichero);
            
            for(Teacher t: teachers){
                String linea = 
                        t.getName() + "," + 
                        t.getSecondName() + "," +
                        t.getUser()+ "," +
                        t.getPassword()+ "," +
                        t.getEspecialidad();
                pw.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        finally{
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
