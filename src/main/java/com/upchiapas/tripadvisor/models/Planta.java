package com.upchiapas.tripadvisor.models;

public class Planta {
    private String tipo;
    private String tallo;
    private String temp;
    private String suelo;
    private String riego;
    public Planta(){

    }
    public Planta(String tallo, String temp, String suelo, String riego){
        //this.tipo=tipo;
        this.tallo=tallo;
        this.temp=temp;
        this.suelo=suelo;
        this.riego=riego;
    }
    //public void planta(String color){

    //}
    //public void

    public String getTallo() {
        return tallo;
    }

    public void setTallo(String tallo) {
        this.tallo = tallo;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getRiego() {
        return riego;
    }

    public void setRiego(String riego) {
        this.riego = riego;
    }

    public String getSuelo() {
        return suelo;
    }

    public void setSuelo(String suelo) {
        this.suelo = suelo;
    }

    @Override
    public String toString() {
        return "El tallo es "+getTallo();
    }
}
