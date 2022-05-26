package com.example.prioritylist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    //Here is where everything will actually be sorted and displayed

    private TextField dName;
    private TextField pName;
    private TextField dAge;
    private TextField pAge;
    private TextField dPro;
    private TextField pPro;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage PrimaryStage) throws IOException {
        PrimaryStage.setTitle("Priority List");
        PrimaryStage.setHeight(800);
        PrimaryStage.setWidth(800);
        PrimaryStage.show();

        //puts everything together for display
        HBox showAll = new HBox();
        Scene scene = new Scene(showAll);

        VBox inputs = new VBox();
        showAll.getChildren().add(inputs);

        //name inputs
        HBox names = new HBox();

        TextField dName = new TextField();
        dName.setPromptText("Doctor's name here");

        TextField pName = new TextField();
        pName.setPromptText("Patient's name here");

        names.getChildren().addAll(pName,dName);
        inputs.getChildren().add(names);

        //input ages
        HBox age = new HBox();

        TextField dAge = new TextField();
        dAge.setPromptText("Doctor's age");

        TextField pAge = new TextField();
        pAge.setPromptText("Patient's age");

        age.getChildren().addAll(pAge,dAge);

        inputs.getChildren().add(age);

        //input professions
        HBox profession = new HBox();

        TextField dPro = new TextField();
        dPro.setPromptText("Doctor's field");

        TextField pPro = new TextField();
        pPro.setPromptText("Patient profession");

        profession.getChildren().addAll(pPro,dPro);

        inputs.getChildren().add(profession);

        //input patient's problem
        HBox problem = new HBox();

        TextField prob = new TextField();
        prob.setPromptText("Patient's problem");

        problem.getChildren().add(prob);

        inputs.getChildren().add(problem);

        //displays everything
        PrimaryStage.setScene(scene);

        //button to add new case
        Button add = new Button("Add");


    }

}