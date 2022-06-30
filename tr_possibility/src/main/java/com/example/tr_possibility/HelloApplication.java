package com.example.tr_possibility;

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
        Image image = new Image("C:/Users/mazek/IdeaProjects/tr_possibility/src/main/resources/com/example/tr_possibility/1612668994_26-p-zelenii-treugolnik-na-prozrachnom-fone-33.jpg");
        stage.getIcons().add(image);
        stage.setTitle("Area_Triangle");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


