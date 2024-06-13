/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mchavez.umg.coursemanager.Class;

/**
 *
 * @author marlon
 */
public class Teacher {
    public String name;
    public String secondName;
    public String user;
    public String password;

    public Teacher() {
    }

    public Teacher(String name, String secondName, String user, String password) {
        this.name = name;
        this.secondName = secondName;
        this.user = user;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", secondName=" + secondName + ", user=" + user + ", password=" + password + '}';
    }
    
    
    
}
