package com.upchiapas.tripadvisor.controllers;
import com.upchiapas.tripadvisor.HelloApplication;
import com.upchiapas.tripadvisor.models.User;
import com.upchiapas.tripadvisor.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController extends  ValidateUser{
    ValidateUser user = new ValidateUser();
    RegitroUsuController entry = new RegitroUsuController();
    @FXML
    private Button btnCrearCuenta;
    @FXML
    private Button btnIniciarSeccion;

    @FXML
    private Button btnSalir;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUssername;

    @FXML
    void btnIniciarSesionOnMouseClicked(MouseEvent event) {
        plantaBienvenida();
        if (user.auntenticarUser(txtUssername.getText(),txtPassword.getText())){
            HelloApplication.setFXML("root-view","home - TripAdvisor");
            /*Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("login - info ");
            alert.setContentText("Bienvenido al Sistema ");
            alert.showAndWait();*/
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("login - Error");
            alert.setContentText("El usuario no existe ");
            alert.showAndWait();
        }
    }
    @FXML
    void btnCrearCuentaUsuario(MouseEvent event) {
        plantaBienvenida("Bienvenido a Regitro Usuario");
        HelloApplication.setFXML("registroUsu-view","creat cuenta");
    }
    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

}
