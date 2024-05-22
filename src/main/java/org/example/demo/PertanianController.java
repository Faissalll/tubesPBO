package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PertanianController  {

    @FXML
    private Button Back2;

    @FXML
    private Button CalcM;

    @FXML
    private TextField EmasP;

    @FXML
    private TextField HutangP;

    @FXML
    private TextField KerugianP;

    @FXML
    private TextField KeuntunganP;

    @FXML
    private TextField ModalP;

    @FXML
    private TextField PiutangP;

    @FXML
    private Button ZakatPenghasilan;

    @FXML
    private Button ZakatPerdagangan;

    @FXML
    void Back1M(ActionEvent event) {

    }

    @FXML
    void Calc1M(ActionEvent event) {

    }

    @FXML
    void Zakat1(ActionEvent event) {

    }

    @FXML
    void Zakat3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Maal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}
