package com.example.butt_colour;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Rectangle rec_1;

    @FXML
    private Rectangle rec_2;

    @FXML
    private Rectangle rec_3;

    @FXML
    private Rectangle rec_4;

    @FXML
    private Text rgb_1;

    @FXML
    private Text rgb_2;

    @FXML
    private Text rgb_3;

    @FXML
    private Text rgb_4;

    Color platform_color;

    @FXML
    void fill_random_1(){
        int i = (int)(Math.random()*256);;
        int i1 = (int)(Math.random()*256);
        int i2 = (int)(Math.random()*256);
        platform_color = Color.rgb(i, i1, i2);
        rgb_1.setText("r: "+ i + "g: "+ i1 + "b: " + i2);


    }

    @FXML
    void fill_random_2(){
        int i = (int)(Math.random()*256);;
        int i1 = (int)(Math.random()*256);
        int i2 = (int)(Math.random()*256);
        platform_color = Color.rgb(i, i1, i2);
        rgb_2.setText("r: "+ i + "g: "+ i1 + "b: " + i2);


    }

    @FXML
    void fill_random_3(){
        int i = (int)(Math.random()*256);;
        int i1 = (int)(Math.random()*256);
        int i2 = (int)(Math.random()*256);
        platform_color = Color.rgb(i, i1, i2);
        rgb_3.setText("r: "+ i + "g: "+ i1 + "b: " + i2);


    }

    @FXML
    void fill_random_4(){
        int i = (int)(Math.random()*256);;
        int i1 = (int)(Math.random()*256);
        int i2 = (int)(Math.random()*256);
        platform_color = Color.rgb(i, i1, i2);
        rgb_4.setText("r: "+ i + "g: "+ i1 + "b: " + i2);


    }


    @FXML
    void onr_1() {
        fill_random_2();
        rec_2.setFill(platform_color);
        fill_random_3();
        rec_3.setFill(platform_color);
        fill_random_4();
        rec_4.setFill(platform_color);

    }

    @FXML
    void onr_2() {
        fill_random_1();
        rec_1.setFill(platform_color);
        fill_random_3();
        rec_3.setFill(platform_color);
        fill_random_4();
        rec_4.setFill(platform_color);

    }

    @FXML
    void onr_3() {
        fill_random_2();
        rec_2.setFill(platform_color);
        fill_random_1();
        rec_1.setFill(platform_color);
        fill_random_4();
        rec_4.setFill(platform_color);

    }

    @FXML
    void onr_4() {
        fill_random_2();
        rec_2.setFill(platform_color);
        fill_random_3();
        rec_3.setFill(platform_color);
        fill_random_1();
        rec_1.setFill(platform_color);

    }
}