package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.models.PlanTratamiento;
import com.upchiapas.tripadvisor.models.Planta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import javax.swing.*;
import java.util.Objects;

public class PlantTratamientoController {
    //private String opsColor;
    @FXML
    private Button btnTratamiento;

    @FXML
    private Button btnregresarCura;

    @FXML
    private Label labelCaptus;

    @FXML
    private TextField txtRiego;

    @FXML
    private TextField txtSuelo;

    @FXML
    private TextField txtTallo;

    @FXML
    private TextField txtTemp;

    @FXML
    void btnTratamientoOnMouseClicked(MouseEvent even) {

        PlanTratamiento op = new PlanTratamiento();
        op.tratamientoplanta();
        Planta dat;
        dat = op.infoRetornoPlan();
      //  String s = op.letraColor();

        /*System.out.println("El color es "+s);
        if (s.equals("num1")){
            System.out.println("entra");
        }*/

        if ("(1) Raiz profunda".equals(dat.getTallo())){
            System.out.println("entra");
        }
        System.out.println(dat.getTallo());
        txtTallo.setText(dat.getTallo());
        txtTemp.setText(dat.getTemp());
        txtSuelo.setText(dat.getSuelo());
        txtRiego.setText(dat.getRiego());

    }

    @FXML
    void btnregresarCuraOnMouseClicked(MouseEvent event) {

    }

}
