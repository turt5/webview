package com.example.ishrak;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Webview implements Initializable {

    @FXML
    private WebView webpage;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WebEngine webEngine = webpage.getEngine();
        webEngine.load("https://xhwebsite5.com/");
    }
}
