package com.example.lab17;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    int sum=0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;

    @FXML
    private Button calculate;
    @FXML
    private Button clear;

    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;

    @FXML
    private TextField textA;
    @FXML
    private TextField textB;
    @FXML
    private TextField textSum;

    @FXML
    private Label labelForButtons;
    @FXML
    private Label myLabel;

    @FXML
    private void ClickButton1(ActionEvent event1){
        labelForButtons.setText("Clicked Button1");
    }
    @FXML
    private void ClickButton2(ActionEvent event2){
        labelForButtons.setText("Clicked Button2");
    }
    @FXML
    private void ClickButton3(ActionEvent event3){
        labelForButtons.setText("Clicked Button3");
    }
    @FXML
    private void ClickCalculate(ActionEvent event4){
        Double a = Double.parseDouble(textA.getText().replaceAll(",","."));
        Double b = Double.parseDouble(textB.getText().replaceAll(",","."));
        textSum.setText(String.valueOf(a+b));
    }
    @FXML
    private void ClickClear(ActionEvent event5){
        textSum.setText("");
        textA.setText("");
        textB.setText("");
    }
    @FXML
    private void ClickPlus(ActionEvent event6){
        if(sum<3){
            sum++;
            myLabel.setText("Число = "+String.valueOf(sum));
        }
    }
    @FXML
    private void ClickMinus(ActionEvent event7){
        if(sum>-5){
            sum--;
            myLabel.setText("Число = "+String.valueOf(sum));
        }
    }
}