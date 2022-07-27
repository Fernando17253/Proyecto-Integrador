package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import com.upchiapas.tripadvisor.models.User;
import com.upchiapas.tripadvisor.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class RegitroUsuController {
    private User entry = new User();
    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField textCorreoUsu;

    @FXML
    private TextField txtNombreUsu;

    @FXML
    private TextField txtPasswordUsu;

    @FXML
    void btnRegistrarUsuOnMouseClicked(MouseEvent event) {
        User entry;
        ValidateUser vec = new ValidateUser();
        entry = new User(txtNombreUsu.getText(),textCorreoUsu.getText(),txtPasswordUsu.getText());
        vec.vecUser.add(entry);
        HelloApplication.setFXML("login-view", "login plant");
    }

}


