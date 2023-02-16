package com.example.ishrak;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import java.io.IOException;

public class HomeController {

    @FXML
    private Button letsgo;
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    void LetsgoClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("webview.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
    @FXML
    private WebView webpage;


}