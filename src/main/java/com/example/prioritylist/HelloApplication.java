package com.example.prioritylist;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class HelloApplication extends Application {
    //Here is where everything will actually be sorted and displayed

    private TextField dName;
    private TextField pName;
    private TextField dAge;
    private TextField pAge;
    private TextField dPro;
    private TextField pPro;
    private TextField prob;
    private TextField priority;
    private TextField output;
    private ArrayDeque<Case> cases = new ArrayDeque<>();
    private VBox priority1 = new VBox();
    private VBox priority2 = new VBox();
    private VBox priority3 = new VBox();

    private int pri1Count=0;
    private int pri2Count=0;
    private int pri3Count=0;

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

        dName = new TextField();
        dName.setPromptText("Doctor's name here");

        pName = new TextField();
        pName.setPromptText("Patient's name here");

        names.getChildren().addAll(pName,dName);
        inputs.getChildren().add(names);

        //input ages
        HBox age = new HBox();

        dAge = new TextField();
        dAge.setPromptText("Doctor's age");

        pAge = new TextField();
        pAge.setPromptText("Patient's age");

        age.getChildren().addAll(pAge,dAge);

        inputs.getChildren().add(age);

        //input professions/field(in the doctor's case)
        HBox profession = new HBox();

        dPro = new TextField();
        dPro.setPromptText("Doctor's field");

        pPro = new TextField();
        pPro.setPromptText("Patient profession");

        profession.getChildren().addAll(pPro,dPro);

        inputs.getChildren().add(profession);

        //input patient's problem
        HBox problem = new HBox();

        prob = new TextField();
        prob.setPromptText("Patient's problem");

        problem.getChildren().add(prob);

        inputs.getChildren().add(problem);

        //input priority
        HBox pri = new HBox();

        priority = new TextField();
        priority.setPromptText("enter priority level (1-3)");

        pri.getChildren().add(priority);

        inputs.getChildren().add(pri);

        //button to add new case
        Button add = new Button("Add");
        add.setOnAction(new CreateCase());

        inputs.getChildren().add(add);

        Button undo = new Button("Undo");
        undo.setOnAction(new Undo());
        inputs.getChildren().add(undo);

        //text field to add a text file for output
        TextField output = new TextField();
        output.setPromptText("enter a text file to output to");
        inputs.getChildren().add(output);

//        Button send = new Button("send to file");
//        undo.setOnAction(new Print());
//        inputs.getChildren().add(send);

        //-----------------------------------------------------------------------

        //displaying the cases that are created
        VBox allPriority = new VBox();
        showAll.getChildren().add(allPriority);

        priority1 = new VBox();
        Label pri1 = new Label("priority 1:");
        priority1.getChildren().add(pri1);
        allPriority.getChildren().add(priority1);

        priority2 = new VBox();
        Label pri2 = new Label("priority 2:");
        priority2.getChildren().add(pri2);
        allPriority.getChildren().add(priority2);

        priority3 = new VBox();
        Label pri3 = new Label("priority 3:");
        priority3.getChildren().add(pri3);
        allPriority.getChildren().add(priority3);

        //displays everything
        PrimaryStage.setScene(scene);

    }
//Make cases
    class CreateCase implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            //creates the needed classes that make up the Case class
            Patient patient = new Patient(pName.getText(),pPro.getText(),pAge.getText(),prob.getText());

            Doctor doctor = new Doctor(dName.getText(),dAge.getText(),dPro.getText());

            Case newCase = new Case(patient,doctor,Integer.parseInt(String.valueOf(priority.getText())));

            if(newCase.getPriority() == 1){
                Label caseDisplay = new Label("---------------\n"+newCase.toString()+"\n--------------------");
                priority1.getChildren().add(caseDisplay);
                cases.addFirst(newCase);
                pri1Count++;
                System.out.println(cases.getFirst().toString());
            }

            if(newCase.getPriority() == 2){
                Label caseDisplay = new Label("---------------\n"+newCase.toString()+"\n--------------------");
                priority2.getChildren().add(caseDisplay);
                cases.addFirst(newCase);
                pri2Count++;
                System.out.println(cases.getFirst().toString());
            }

            if(newCase.getPriority() == 3){
                Label caseDisplay = new Label("---------------\n"+newCase.toString()+"\n--------------------");
                priority3.getChildren().add(caseDisplay);
                cases.addFirst(newCase);
                pri3Count++;
                System.out.println(cases.getFirst().toString());
            }

        }
    }

//    class Print implements EventHandler<ActionEvent> {
//
//        @Override
//        public void handle(ActionEvent actionEvent) {
//
//            File outputFile = new File(output);
//
//            for(int i = 0; i<priority1.getChildren().size();i++){
//                priority1.getChildren().get(i);
//            }
//
//        }
//    }

    class Undo implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {

            if(cases.isEmpty())
                return;

            for(int i=0;i<priority1.getChildren().size();i++){
                if(cases.getFirst().equals((Label)  priority1.getChildren().get(i))){
                    priority1.getChildren().remove(priority1.getChildren().get(i));
                }
            }

            for(int i=0;i<priority2.getChildren().size();i++){
                if(cases.getFirst().equals(priority2.getChildren().get(i))){
                    priority2.getChildren().remove(priority2.getChildren().get(i));
                }
            }

            for(int i=0;i<priority3.getChildren().size();i++){
                if(cases.getFirst().equals(priority3.getChildren().get(i))){
                    priority3.getChildren().remove(priority3.getChildren().get(i));
                }
            }

            System.out.println(cases.getFirst().toString());

            cases.removeFirst();



        }
    }

}