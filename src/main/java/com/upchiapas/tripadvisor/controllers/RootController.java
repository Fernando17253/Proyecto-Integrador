package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.input.MouseEvent;
public class RootController {
    @FXML
    private Button btnCuracion;
    @FXML
    private Button btnRegistraplanta;
    @FXML
    void registrarPlantaOnMouseClicked(MouseEvent event) {
    //  HelloApplication.setFXML("registroPlan-view","root menu plan");
    }
    @FXML
    void btnCuracionOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("curacionPlanLogin-view","tipo plan");

    }

}
