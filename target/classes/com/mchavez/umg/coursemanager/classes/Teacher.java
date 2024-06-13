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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String secondName;
    private String user;
    private String password;
    private String especialidad;

    public Teacher() {
    }

    public Teacher(String name, String secondName, String user, String password, String especialidad) {
        this.name = name;
        this.secondName = secondName;
        this.user = user;
        this.password = password;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
