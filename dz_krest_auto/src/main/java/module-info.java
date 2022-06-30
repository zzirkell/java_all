module com.example.dz_krest_auto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dz_krest_auto to javafx.fxml;
    exports com.example.dz_krest_auto;
}