package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import com.upchiapas.tripadvisor.models.PlanTratamiento;
import com.upchiapas.tripadvisor.models.Planta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class TestPlantaController implements Initializable {

    private String dtallo,dsuelo,dtemp,driego;
    @FXML
    private Button btnguardar;

    @FXML
    private Button btnregresar;
    @FXML
    private Button btnsalir;

    @FXML
    private ComboBox<String> comboxRiego;

    @FXML
    private ComboBox<String> comboxSuelo;

    @FXML
    private ComboBox<String> comboxTallo;

    @FXML
    private ComboBox<String> comboxTemperatura;

    @FXML
    private ImageView imagenplant;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void btnregresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("curacionPlanLogin-view","Curacion Login");
    }
    @FXML
    void btnguardarOnMouseClicked(MouseEvent event) {
        PlanTratamiento vec = new PlanTratamiento();
        Planta dat;
        dat = new Planta(dtallo,dtemp,dsuelo,driego);
        vec.vecTratoPLant.add(dat);
        HelloApplication.setFXML("tratamientoPlan-view","Tratamiento plant");
    }

    @FXML
    void comboxRiegoOnAction(ActionEvent event) {
        this.driego=comboxRiego.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void comboxSueloOnAction(ActionEvent event) {
        this.dsuelo=comboxSuelo.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void comboxTalloOnAction(ActionEvent event) {
        this.dtallo=comboxTallo.getSelectionModel().getSelectedItem().toString();

    }

    @FXML
    void comboxTemperaturaOnAction(ActionEvent event) {
        this.dtemp=comboxTemperatura.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void nuevaimagenOnMouseDragged(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listRaiz = FXCollections.observableArrayList("(1) Raiz profunda","(2) Raiz exparcida","(3)Raiz Acuatica");
        ObservableList<String> listTemper = FXCollections.observableArrayList("(1) temp Fria","(2) temp Calurosa","(3) Ambos estados");
        ObservableList<String> listRiego = FXCollections.observableArrayList("(1) hace 3-8 Dias","(2) hace 15-18","(3) Mas del Mes");
        ObservableList<String> listSuelo = FXCollections.observableArrayList("(1) Suelo lodoso","(2) Suelo seco","(3)Suelo piedroso","(4) Acuatico");
        comboxTallo.setItems(listRaiz);
        comboxTemperatura.setItems(listTemper);
        comboxRiego.setItems(listRiego);
        comboxSuelo.setItems(listSuelo);
    }
}
