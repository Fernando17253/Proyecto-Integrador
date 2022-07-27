package com.upchiapas.tripadvisor.models;

import javax.swing.JOptionPane;

public class User {

    private String nombre;
    private String ussername;
    private String password;
    public User(){

    }
    public User(String nombre,String ussername,String password) {
        this.nombre = nombre;
        this.ussername=ussername;
        this.password=password;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUssername() {
        return ussername;
    }

    public void setUssername(String ussername) {
        this.ussername = ussername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "El nombre es "+getNombre()+" El correo "+getUssername()+" la contrasella es "+getPassword();
    }
}
