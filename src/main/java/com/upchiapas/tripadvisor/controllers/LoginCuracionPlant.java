package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;

import com.upchiapas.tripadvisor.models.PlanTratamiento;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
public class LoginCuracionPlant {

    @FXML
    private Button btnCaptusCura;

    @FXML
    private Button btnFollageCura;

    @FXML
    private Button btnOrquidiaCura;
    @FXML
    private Button btnregresarCura;
    @FXML
    void btnCaptusCuraOnMouseClicked(MouseEvent event) {
        PlanTratamiento op = new PlanTratamiento();
        op.vecColor.add("num1");
        HelloApplication.setFXML("testCuracion-view","test curacion");
    }

    @FXML
    void btnFollageCuraOnMouseClicked(MouseEvent event) {
        PlanTratamiento op = new PlanTratamiento();
        op.vecColor.add("2");
        HelloApplication.setFXML("testCuracion-view","test curacion");
    }

    @FXML
    void btnOrquidiaCuraOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnregresarCuraOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("root-view","root plant");
    }

}

