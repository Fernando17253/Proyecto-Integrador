package com.upchiapas.tripadvisor.controllers;
import javafx.scene.image.ImageView;
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistroPlanController implements Initializable {
    //Image image = new Image("@assets/img/ImagenFondo.jpg");
    private String s,f,r;
    @FXML
    private ImageView imagenview;
    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnSalir;

    @FXML
    private ComboBox<String> comboxColor;

    @FXML
    private ComboBox<String> comboxFruto;

    @FXML
    private ComboBox<String> comboxPlan;

    @FXML
    private TextField txtNombrePlant;

    @FXML
    void btnGuardarOnMouseClicked(MouseEvent event) {
        String url =System.getProperty("user.dir")+"\\paginaweb\\ProyectoFunda.html";
        File rec = new File(url);
        PlanTratamiento dato = new PlanTratamiento();
        Planta plant ;
        plant= new Planta(s,f,r,txtNombrePlant.getText());
        //dato.vecPlanta.add(plant);
        HelloApplication.setFXML("root-view","Menu plan");
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void coboxColorOnAction(ActionEvent event) {

        this.r= comboxColor.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void comboxFrutoOnAction(ActionEvent event) {

        this.f=comboxFruto.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void comboxPlan(ActionEvent event) {
        this.s = comboxPlan.getSelectionModel().getSelectedItem().toString();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listRaiz = FXCollections.observableArrayList("(1) Raiz profunda","(2) Raiz exparcida","(3)Raiz Acuatica");
        ObservableList<String> listFruto = FXCollections.observableArrayList("(1) si produce fruto","(2) No producefruto" );
        ObservableList<String> listClima = FXCollections.observableArrayList("(1) si calurozo","(2) No caluroso","(3) los dos clima");
        comboxPlan.setItems(listRaiz);
        comboxFruto.setItems(listFruto);
        comboxColor.setItems(listClima);
    }
    @FXML
    void imagenviewdato(MouseEvent event) {
        //imagenview.setImage(image);

    }

}
