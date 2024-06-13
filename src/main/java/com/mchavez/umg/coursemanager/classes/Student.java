/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mchavez.umg.coursemanager.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlon
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String secondName;
    private String user;
    private String password;
    private List<Grade> grades;

    public Student() {
    }

    public Student(String name, String secondName, String user, String password, List<Grade> grades) {
        this.name = name;
        this.secondName = secondName;
        this.user = user;
        this.password = password;
        if (grades == null) {
            this.grades = new ArrayList<>();
        } else {
            this.grades = grades;
        }

    }

    public void addGrade(Course course, double grade) {
        if (grades == null) {
            grades = new ArrayList<>();
        } else {
            for (Grade existingGrade : grades) {
                if (existingGrade.getCourse().equals(course)) {
                    existingGrade.setGrade(grade);
                    return;
                }
            }
        }

        Grade newGrade = new Grade(course, grade);
        grades.add(newGrade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

}
