package com.example.lab17;

import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Ex1 extends Application{
    @Override
    public void start(Stage stage){
        Text text = new Text("Hello from JavaFX");
        FlowPane rootNode = new FlowPane();

        Scene scene = new Scene(rootNode,400,400);
        stage.setScene(scene);
        stage.setTitle("First Application");
        rootNode.getChildren().add(text);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }
}
