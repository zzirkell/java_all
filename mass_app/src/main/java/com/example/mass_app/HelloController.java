package com.example.mass_app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Collections;

public class HelloController {
    @FXML
    private Text before_itog;

    @FXML
    private Button but_add;

    @FXML
    private Button but_delete;

    @FXML
    private Button but_max;

    @FXML
    private Button but_min;

    @FXML
    private TextField field_add;

    @FXML
    private TextField field_delete;

    @FXML
    private Text itog;

    @FXML
    private Text text_for_error;

    ArrayList<Integer> for_itog = new ArrayList<>(0);

    @FXML
    void add_element(MouseEvent event) {
        text_for_error.setVisible(false);
        itog.setText("");
        try {
            int new_to_add = Integer.parseInt(field_add.getText());
            for_itog.add(new_to_add);
        }
        catch (Exception e) {
            text_for_error.setVisible(true);
        }
        field_add.clear();
        itog.setText(for_itog.toString());
    }

    @FXML
    void delete_element(MouseEvent event) {
        text_for_error.setVisible(false);
        itog.setText("");
        try {
            int index_to_remove = Integer.parseInt(field_delete.getText());
            for_itog.remove(index_to_remove);
        }
        catch (Exception e) {
            text_for_error.setVisible(true);
        }
        itog.setText(for_itog.toString());
        field_delete.clear();
    }

    @FXML
    void na_umensh(MouseEvent event) {
        itog.setText("");
        Collections.sort(for_itog);
        itog.setText(for_itog.toString());

    }

    @FXML
    void na_uvelich(MouseEvent event) {
        itog.setText("");
        Collections.sort(for_itog, Collections.reverseOrder());
        itog.setText(for_itog.toString());

    }

}