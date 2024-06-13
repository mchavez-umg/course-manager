package com.mchavez.umg.coursemanager.views.adminModule;

import com.mchavez.umg.coursemanager.Coursemanager;
import com.mchavez.umg.coursemanager.classes.Student;
import com.mchavez.umg.coursemanager.classes.Teacher;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
        DefaultTableModel data = new DefaultTableModel(new String[]{"Carné","Nombre", "Apellido"}, Coursemanager.students.size());
        jTable1.setModel(data);

        int row = 0;

        for (Student e : Coursemanager.students) {
            jTable1.setValueAt(e.getUser(), row, 0);
            jTable1.setValueAt(e.getName(), row, 1);
            jTable1.setValueAt(e.getSecondName(), row, 2);
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cargar XML");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, 40));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar XML");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 130, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mchavez/umg/coursemanager/assets/welcome-bg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this,"Cargar");
        if(retorno==JFileChooser.APPROVE_OPTION){
            readXMLFile(archivo.getSelectedFile());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String contenido = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<students>\n";
        
        for(Student e: Coursemanager.students){
            
            contenido+="\t<student>\n";
          
            contenido+="\t\t<carne>";
            contenido+=e.getUser();
            contenido+="</carne>\n";
            
            contenido+="\t\t<nombre>";
            contenido+=e.getName();
            contenido+="</nombre>\n";
          
            contenido+="\t\t<apellido>";
            contenido+=e.getSecondName();
            contenido+="</apellido>\n";
            
            contenido+="\t\t<contraseña>";
            contenido+=e.getPassword();
            contenido+="</contraseña>\n";
           
          
            contenido+="\t</student>\n";
        }
        contenido+="</students>";
        
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this,"Guardar");
        if(retorno==JFileChooser.APPROVE_OPTION){
            drawXMLFile(archivo.getSelectedFile().toPath().toString(),contenido);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    public void drawXMLFile(String rutaConNombre,String contenido){
    
        try{
            FileWriter fw = new FileWriter(rutaConNombre);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(contenido);
            pw.close();
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
        
    public void readXMLFile(File archivo) {
    try {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(archivo);

        doc.getDocumentElement().normalize();
        NodeList nodos = doc.getElementsByTagName("student");

        for (int i = 0; i < nodos.getLength(); i++) {
            Node nodo = nodos.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) nodo;
                String user = e.getElementsByTagName("carne").item(0).getTextContent();
                boolean exists = false;

                for (Student student : Coursemanager.students) {
                    if (student.getUser().equals(user)) {
                        student.setName(e.getElementsByTagName("nombre").item(0).getTextContent());
                        student.setSecondName(e.getElementsByTagName("apellido").item(0).getTextContent());
                        student.setPassword(e.getElementsByTagName("contraseña").item(0).getTextContent());
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    Student estudent = new Student();
                    estudent.setUser(user);
                    estudent.setName(e.getElementsByTagName("nombre").item(0).getTextContent());
                    estudent.setSecondName(e.getElementsByTagName("apellido").item(0).getTextContent());
                    estudent.setPassword(e.getElementsByTagName("contraseña").item(0).getTextContent());
                    Coursemanager.students.add(estudent);
                }
            }
        }
        actualizarTabla();
    } catch (Exception e) {
        e.printStackTrace();
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
