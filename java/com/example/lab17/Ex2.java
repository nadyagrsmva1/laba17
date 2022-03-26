package com.example.lab17;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class Ex2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root,300,275));
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
