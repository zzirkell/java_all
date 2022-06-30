package com.example.tr_possibility;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private ImageView fine_triangle;

    @FXML
    private ImageView strange_triangle;

    @FXML
    private Text itog;

    @FXML
    private TextField nd_side;

    @FXML
    private TextField rd_side;

    @FXML
    private ImageView sad_triangle;

    @FXML
    private TextField st_side;

    @FXML
    void calc_start(MouseEvent event) {
        itog.setText("");
        sad_triangle.setVisible(false);
        fine_triangle.setVisible(false);
        strange_triangle.setVisible(false);
        try{
            int a = Integer.parseInt(st_side.getText());
            int b = Integer.parseInt(nd_side.getText());
            int c = Integer.parseInt(rd_side.getText());

            if (a + b > c && c + b > a && a + c > b) {
                double poluper = (a + b + c) * 0.5;
                double area = Math.sqrt((poluper*(poluper-a)*(poluper-b)*(poluper-c)));
                itog.setText("Triangle area is " + area + "\nEverything is OK");
                fine_triangle.setVisible(true);
            }
            if (a+c < b){
                itog.setText(a + "+" + c + "<"+ b + "\n This triangle doesn't exist.\nRewrite the sides, please...");
                sad_triangle.setVisible(true);
            }
            if (a+b < c){
                itog.setText(a + "+" + b + "<"+ c + "\n This triangle doesn't exist.\nRewrite the sides, please...");
                sad_triangle.setVisible(true);
            }
            if (c+b < a){
                itog.setText(b + "+" + c + "<"+ a + "\n This triangle doesn't exist.\nRewrite the sides, please...");
                sad_triangle.setVisible(true);
            }
        }catch (Exception e){
            itog.setText("Something went wrong. \nRewrite the sides, please...");
            strange_triangle.setVisible(true);
        }

    }
}