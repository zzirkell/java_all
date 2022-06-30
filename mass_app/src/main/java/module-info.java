module com.example.mass_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mass_app to javafx.fxml;
    exports com.example.mass_app;
}