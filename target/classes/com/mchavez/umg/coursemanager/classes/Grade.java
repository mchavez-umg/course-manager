/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mchavez.umg.coursemanager.classes;

import java.io.Serializable;

/**
 *
 * @author marlon
 */
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Course course;
    private double grade;

    public Grade() {
    }

    public Grade(Course course, double grade) {
        this.course = course;
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
