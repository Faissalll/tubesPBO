package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class MenuController {

    @FXML
    private Button Fitrah;

    @FXML
    private Button Maal;

    @FXML
    void printMenuFitrah(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Fitrah.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    @FXML
    void printMenuMaal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Maal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
