package com.upchiapas.tripadvisor.models;

import javax.swing.*;
import java.util.ArrayList;

public class ValidateUser{
    public static ArrayList<User> vecUser = new ArrayList<>();
    public ValidateUser() {
        vecUser.add(new User("pedro","pedro","123"));
    }
    public void plantaBienvenida(){
        //System.out.println("Bienvenido a Vital Plant");
        JOptionPane.showMessageDialog(null,"Bienvenido a Vital Plant");

    }
    public void plantaBienvenida(String nombre){
        JOptionPane.showMessageDialog(null,nombre);
    }
    public boolean auntenticarUser(String usser,String password){
        boolean status = false;
        User user=findUser(usser);
        if (user!=null && user.getPassword().equals(password)){
            status=true;
        }
        return status;
    }
    private User findUser(String usser){
        User user =null;
        boolean status = false;
        int index=0;
        while (!status && index<vecUser.size()){
            if(vecUser.get(index).getUssername().equals(usser)){
                user = vecUser.get(index);
                status = true;
            }
            index++;
        }
        return user;
    }
}
