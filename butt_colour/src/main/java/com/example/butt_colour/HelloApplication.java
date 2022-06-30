package com.example.butt_colour;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Image image = new Image("C:/Users/mazek/Downloads/png-transparent-color-wheel-computer-icons-rgb-color-space-international-commission-on-illumination-color-mode-rgb-miscellaneous-blue-color.png");
        stage.getIcons().add(image);
        stage.setTitle("Change_Colour");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}