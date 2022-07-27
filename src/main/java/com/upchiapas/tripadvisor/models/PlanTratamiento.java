package com.upchiapas.tripadvisor.models;

import javax.swing.*;
import java.util.ArrayList;

public class PlanTratamiento implements Tratamiento {
   public  static  ArrayList<String> vecColor = new ArrayList<>();
   public static ArrayList<Planta> vecTratoPLant =new ArrayList<>();
   String s;
   public Planta infoRetornoPlan(){
      //mostrarvec();
      Planta r = null;
      for (Planta posicion :vecTratoPLant) {
         if(posicion.getTallo()!=null) {
            r = new Planta(posicion.getTallo(), posicion.getTemp(), posicion.getSuelo(), posicion.getRiego());
         }
      }
      return r;
   }

   @Override
   public void tratamientoplanta() {
      JOptionPane.showMessageDialog(null,"El tratamiento cactus and suculentas");
   }
   /*public String letraColor(){
      s= null;
      for(int i=0;i<vecColor.size();i++){
         if(vecColor!=null){
            s = vecColor.toString();
         }
      }
      return s;
   }*/

   /*public void mostrarvec(){
      for (Planta op:vecTratoPLant){
         System.out.println(op.toString());
      }
   }*/

}
