module com.example.butt_colour {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.butt_colour to javafx.fxml;
    exports com.example.butt_colour;
}