module com.example.dodo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dodo2 to javafx.fxml;
    exports com.example.dodo2;
}