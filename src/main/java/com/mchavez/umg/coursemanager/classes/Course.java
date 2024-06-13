/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mchavez.umg.coursemanager.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marlon
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String section;
    private Date startDate;
    private Date endDate;
    private String teacher;
    public ArrayList<Student> students = new ArrayList<>();

    public Course() {
    }

    public Course(int id, String name, String section, Date startDate, Date endDate, String teacher) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

   
    
    

}
