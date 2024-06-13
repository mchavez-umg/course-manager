/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mchavez.umg.coursemanager;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.mchavez.umg.coursemanager.classes.Course;
import com.mchavez.umg.coursemanager.classes.Student;
import com.mchavez.umg.coursemanager.classes.Teacher;
import com.mchavez.umg.coursemanager.views.adminModule.Login;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marlon
 */
public class Coursemanager {

    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Teacher> teachers = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();
    public static Teacher teacherloged = new Teacher();
    public static Student studentLoged = new Student();

    private static final String DATA_FILE_PATH = "data.ser";

    public static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE_PATH))) {
            oos.writeObject(students);
            oos.writeObject(teachers);
            oos.writeObject(courses);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadData() {
        File dataFile = new File(DATA_FILE_PATH);
        if (dataFile.exists()) {

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE_PATH))) {
                students = (ArrayList<Student>) ois.readObject();
                teachers = (ArrayList<Teacher>) ois.readObject();
                courses = (ArrayList<Course>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo de datos 'data.ser' no existe. Se creará uno nuevo.");
        }
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        loadData();

        Login loginView = new Login();
        loginView.setVisible(true);

        Runtime.getRuntime().addShutdownHook(new Thread(Coursemanager::saveData));
    }
}
