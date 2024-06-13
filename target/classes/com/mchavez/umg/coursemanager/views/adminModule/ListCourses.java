package com.mchavez.umg.coursemanager.views.adminModule;

import com.mchavez.umg.coursemanager.Coursemanager;
import com.mchavez.umg.coursemanager.classes.Course;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author marlon
 */
public class ListCourses extends javax.swing.JPanel {

    public ListCourses() {
        initComponents();
        actualizarTabla();
    }

    public void actualizarTabla() {
        DefaultTableModel data = new DefaultTableModel(new String[]{"Id", "Nombre", "Sección", "Fecha Inicio", "Fecha Fin", "Profesor"}, Coursemanager.courses.size());
        jTable1.setModel(data);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        int row = 0;

        for (Course e : Coursemanager.courses) {
            jTable1.setValueAt(e.getId(), row, 0);
            jTable1.setValueAt(e.getName(), row, 1);
            jTable1.setValueAt(e.getSection(), row, 2);
            jTable1.setValueAt(sdf.format(e.getStartDate()), row, 3);
            jTable1.setValueAt(sdf.format(e.getEndDate()), row, 4);
            jTable1.setValueAt(e.getTeacher(), row, 5);
            row++;
        }
    }
    
    public void drawJSON(String rutaConNombre) {
        JSONArray courseList = new JSONArray();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

        for (Course course : Coursemanager.courses) {
            JSONObject courseObject = new JSONObject();
            courseObject.put("id", course.getId());
            courseObject.put("nombre", course.getName());
            courseObject.put("seccion", course.getSection());
            courseObject.put("fecha_inicio", sdf.format(course.getStartDate()));
            courseObject.put("fecha_fin", sdf.format(course.getEndDate()));
            courseObject.put("profesor", course.getTeacher());

            courseList.add(courseObject);
        }

        try (FileWriter file = new FileWriter(rutaConNombre)) {
            file.write(courseList.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readJSON(File rutaConNombre) {
        JSONParser jp = new JSONParser();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

        try {
            FileReader r = new FileReader(rutaConNombre);
            Object obj = jp.parse(r);
            JSONArray courseList = (JSONArray) obj;

            Coursemanager.courses.clear(); 

            for (Object c : courseList) {
                JSONObject courseObject = (JSONObject) c;

                Course course = new Course();
                course.setId(Integer.parseInt(courseObject.get("id").toString()));
                course.setName(courseObject.get("nombre").toString());
                course.setSection(courseObject.get("seccion").toString());
                course.setStartDate(sdf.parse(courseObject.get("fecha_inicio").toString()));
                course.setEndDate(sdf.parse(courseObject.get("fecha_fin").toString()));
                course.setTeacher(courseObject.get("profesor").toString());

                Coursemanager.courses.add(course);
              
            }
            
             actualizarTabla();
             r.close();
            
        } catch (Exception e) {
            e.printStackTrace();
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

        setMinimumSize(new java.awt.Dimension(770, 500));
        setPreferredSize(new java.awt.Dimension(1920, 1280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 630, 320));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de cursos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar JSON");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 170, 40));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cargar JSON");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 180, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/welcome-bg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            UpdateCourse m = new UpdateCourse(jTable1.getSelectedRow());
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
            drawJSON(archivo.getSelectedFile().toPath().toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this, "Cargar");
        if (retorno == JFileChooser.APPROVE_OPTION) {
            readJSON(archivo.getSelectedFile());
        }
    }//GEN-LAST:event_jButton3ActionPerformed


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
