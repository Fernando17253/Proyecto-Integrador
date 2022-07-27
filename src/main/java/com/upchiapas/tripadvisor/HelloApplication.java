package com.upchiapas.tripadvisor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Scene scene;
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        scene = new Scene(loadFXML("login-view"));
        stage.setTitle("Login - Tripadvisor");
        stage.setScene(scene);
        stage.show();
    }
    public static Parent loadFXML(String nameview){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameview+".fxml"));
        try {
            return fxmlLoader.load();
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }
    public static void setFXML(String nameview,String title){
        scene.setRoot(loadFXML(nameview));
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setTitle(title);
    }
    public static void main(String[] args) {
        launch();
    }
}