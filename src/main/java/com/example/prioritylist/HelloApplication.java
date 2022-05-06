package com.example.prioritylist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) throws IOException {
        window.setTitle("Priority List");
        window.show();
    }

}