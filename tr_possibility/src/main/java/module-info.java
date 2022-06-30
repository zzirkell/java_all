module com.example.tr_possibility {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tr_possibility to javafx.fxml;
    exports com.example.tr_possibility;
}