package com.example.lab18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {
    @FXML
    private TextArea tarea;

    @FXML
    private TextField tfield;

    @FXML
    private void clickbut(ActionEvent event){
        tarea.appendText("Your message: " + tfield.getText() + "\n");
        tfield.setText(" ");
        tfield.requestFocus();
    }

    @FXML
    private void clickenter(KeyEvent eventTwo) {
        if (eventTwo.getCode() == KeyCode.ENTER) {
            tarea.appendText("Your message: " + tfield.getText() + "\n");
            tfield.setText(" ");
            tfield.requestFocus();
        }
    }
}