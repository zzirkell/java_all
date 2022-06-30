package com.example.dodo2;


import com.example.dodo2.HelloController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 335, 600);

        HelloController helloController = fxmlLoader.getController();
        scene.setOnKeyPressed(keyEvent -> helloController.povorot(keyEvent));
        Image image = new Image("C:/Users/mazek/IdeaProjects/dodo2/src/main/resources/com/example/dodo2/original_doodle.png");
        stage.getIcons().add(image);
        stage.setTitle("Doodle Jump");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}