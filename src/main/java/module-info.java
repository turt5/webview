module com.example.ishrak {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.ishrak to javafx.fxml;
    exports com.example.ishrak;
}