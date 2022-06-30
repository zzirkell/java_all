package com.example.dodo2;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private Button menu_but;

    @FXML
    private Button easy;

    @FXML
    private Button mid;

    @FXML
    private Button hard;

    @FXML
    private Button reset_but;

    @FXML
    private Button winter_but;

    @FXML
    private Button original_but;

    @FXML
    private Button football_but;

    @FXML
    private Button startB;

    @FXML
    private AnchorPane anchor_main;  //pane

    @FXML
    public Rectangle platform;    //platform

    public List<Rectangle> platforms = new ArrayList<>();  //platforms


    Image dood_main;
    Image back_main;
    Color platform_color;


    @FXML
    public ImageView doodle;  //doodle

    @FXML
    public ImageView backgr;


    int beetwen_platforms_y = 90;

    public void platforms_appearence_x(int beetwen_platforms_y) {
        for (int k = 0; k < (1 + (int) (Math.random() * 2)); k++) {
            platform = new Rectangle();
            platform.setFill(platform_color);
            platform.setHeight(10);
            platform.setWidth(50);
            platform.setLayoutY(beetwen_platforms_y);
            int beetwen_platforms_x = (int) (20+(Math.random() * 25));
            if (k == 1) {
                beetwen_platforms_x = 60 + beetwen_platforms_x + (int) (Math.random() * 300);
            }
            if (k == 2) {
                beetwen_platforms_x = 60 + beetwen_platforms_x + (int) (Math.random() * 200);
            }
            if (k == 3) {
                beetwen_platforms_x = 60 + beetwen_platforms_x + (int) (Math.random() * 100);
            }
            /*if (k == 4){
                beetwen_platforms_x = 60+beetwen_platforms_x+(int)(Math.random()*21);
            }*/
            platform.setLayoutX(beetwen_platforms_x);
            platforms.add(platform);
            anchor_main.getChildren().add(platforms.get(platforms.size() - 1));
        }
    }

    public void platforms_appearence() {  //появление платформ
        //int beetwen_platforms_y = 0;
        for (int j = 0; j < 6; j++) {
            platforms_appearence_x(beetwen_platforms_y);
            beetwen_platforms_y += 100;
        }
    }

    AnimationTimer timer;

    @FXML
    void set_football() {
        System.out.println("butt");
        football_but.setVisible(false);
        winter_but.setVisible(false);
        original_but.setVisible(false);
        dood_main = new Image("C:/Users/mazek/IdeaProjects/dodo2/src/main/resources/com/example/dodo2/footbal_doodle.png");
        back_main = new Image("C:/Users/mazek/IdeaProjects/dodo2/src/main/resources/com/example/dodo2/footbal_back.png");
        platform_color = Color.rgb(13, 215, 131);
        hard.setVisible(true);
        easy.setVisible(true);
        mid.setVisible(true);
    }

    @FXML
    void set_original() {
        System.out.println("butt");
        football_but.setVisible(false);
        winter_but.setVisible(false);
        original_but.setVisible(false);
        dood_main = new Image("C:/Users/mazek/IdeaProjects/dodo2/src/main/resources/com/example/dodo2/original_doodle.png");
        back_main = new Image("C:/Users/mazek/IdeaProjects/dodo2/src/main/resources/com/example/dodo2/original_back.png");
        platform_color = Color.rgb(45, 54, 110);
        hard.setVisible(true);
        easy.setVisible(true);
        mid.setVisible(true);

    }

    @FXML
    void set_winter() {
        System.out.println("butt");
        football_but.setVisible(false);
        winter_but.setVisible(false);
        original_but.setVisible(false);
        dood_main = new Image("C:/Users/mazek/IdeaProjects/dodo2/src/main/resources/com/example/dodo2/winter_doodle.png");
        back_main = new Image("C:/Users/mazek/IdeaProjects/dodo2/src/main/resources/com/example/dodo2/winter_back.png");
        platform_color = Color.rgb(193, 17, 17);
        hard.setVisible(true);
        easy.setVisible(true);
        mid.setVisible(true);

    }
    int step;

    @FXML
    void easy_mod() {
        startB.setVisible(true);
        hard.setVisible(false);
        easy.setVisible(false);
        mid.setVisible(false);
        step = 1;
    }

    @FXML
    void hard_mode() {
        startB.setVisible(true);
        hard.setVisible(false);
        easy.setVisible(false);
        mid.setVisible(false);
        step = 10;
    }

    @FXML
    void mid_mode() {
        startB.setVisible(true);
        hard.setVisible(false);
        easy.setVisible(false);
        mid.setVisible(false);
        step = 5;
    }

    @FXML
    public void startButton() {
        platforms.clear();
        System.out.println("butt");
        startB.setVisible(false);

        backgr = new ImageView();
        backgr.setImage(back_main);
        backgr.setFitWidth(335);
        backgr.setFitHeight(600);
        backgr.setLayoutX(0);
        backgr.setLayoutY(0);
        anchor_main.getChildren().add(backgr);
        //появление персонажа
        platforms_appearence();
        doodle = new ImageView();
        doodle.setImage(dood_main);
        doodle.setFitWidth(30);
        doodle.setFitHeight(30);
        doodle.setLayoutX(135);
        doodle.setLayoutY(560);
        anchor_main.getChildren().add(doodle);

        //platforms_appearence_x(beetwen_platforms_y);


        //запуск таймера
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                updateGame();

            }
        };
        timer.start();
    }


    //int step = 5; //скорость дудла
    double start_y = 560;
    boolean doddle_move_up = true;  //флаг направления движения дудла по вертикали

    private void updateGame() {
        if (doddle_move_up == true) {
            if ((doodle.getLayoutY() >= (start_y - 180))) { //260
                //&& (doodle.getLayoutY()>=0)
                //if (doodle.getLayoutY() >= (300)){
                doodle.setLayoutY(doodle.getLayoutY() - step);
                //System.out.println(doodle.getLayoutY());
            } else {
                doddle_move_up = false;
            }

        }

        if (doddle_move_up == false) {
            if (doodle.getLayoutY() <= 560) {
                doodle.setLayoutY(doodle.getLayoutY() + step);
                //System.out.println(doodle.getLayoutY());
            } else {
                doddle_move_up = true;
            }
        }

        if (doddle_move_up == false) {
            int i = 0;
            while (i < platforms.size()) {
                //System.out.println("------------------");
                //System.out.println(platforms.size());
                //System.out.println(platforms.get(i).getLayoutY());
                //System.out.println(doodle.getLayoutY());

                if ((platforms.get(i).getLayoutY() == (doodle.getLayoutY() + 30)) && (Math.abs(platforms.get(i).getLayoutX() + 25 - doodle.getLayoutX() - 15) <= 25)) {
                    System.out.println(Math.abs(platforms.get(i).getLayoutX() - doodle.getLayoutX()));
                    start_y = doodle.getLayoutY();
                    doddle_move_up = true;
                    //int ryadi = (int)((600-platforms.get(na_udalenie).getLayoutY()-10)/100);
                    int j = 0;
                    while (j < platforms.size()) {

                        platforms.get(j).setLayoutY(platforms.get(j).getLayoutY() + 90);
                        if (platforms.get(j).getLayoutY() > 600) {
                            platforms.get(j).setVisible(false);
                            platforms.remove(j);
                            platforms_appearence_x(0);

                        }
                        j++;
                    }
                }
                i++;
                /*if (platforms.get(i).getLayoutY()==(doodle.getLayoutY()+60)) {
                    //System.out.println("vishe");
                    //System.out.println("------------------");
                    int na_udalenie = i;
                    while ((na_udalenie + 1) < platforms.size()) {

                        if (platforms.get(na_udalenie).getLayoutY() == platforms.get(na_udalenie + 1).getLayoutY() ) {
                            na_udalenie += 1;
                        } else {
                            if (platforms.get(na_udalenie).getLayoutY() != platforms.get(na_udalenie + 1).getLayoutY()) {
                                platforms.get(na_udalenie + 1).setVisible(false);
                                platforms.remove(na_udalenie + 1);
                            }
                        }
                    }
                }*/

                    /*int ryadi = (int)((600-platforms.get(na_udalenie).getLayoutY()-10)/100);
                    System.out.println(ryadi);
                    for(int t = 0; t<2; t++){
                        for (int g=0; g<platforms.size();g++){
                            platforms.get(g).setLayoutY(platforms.get(g).getLayoutY()+100);
                        }
                        platforms_appearence_x(beetwen_platforms_y);
                        beetwen_platforms_y +=100;
                   }*/

            }
        }

        if (doodle.getLayoutY() > 560) {
            System.out.println(doodle.getLayoutY());
            timer.stop();
            doodle.setVisible(false);
            for (int p = 0; p < platforms.size(); p++) {
                platforms.get(p).setVisible(false);
            }
            backgr.setVisible(false);
            reset_but.setVisible(true);
            menu_but.setVisible(true);


        }
    }


    @FXML
    public void povorot(KeyEvent event) { //перемещение дудла по горизнтали
        switch (event.getCode()) {
            case D:
                if ((doodle.getLayoutX() < 335) && (doodle.getLayoutX() > 0)) {
                    doodle.setLayoutX(doodle.getLayoutX() + 40);
                } else {
                    doodle.setLayoutX(Math.abs(335 - Math.abs(doodle.getLayoutX())));
                }
                break;
            case A:
                if ((doodle.getLayoutX() < 335) && (doodle.getLayoutX() > 0)) {
                    doodle.setLayoutX(doodle.getLayoutX() - 40);
                } else {
                    doodle.setLayoutX(Math.abs(335 - Math.abs(doodle.getLayoutX())));
                }
                break;
        }
    }


    @FXML
    void menu_click(MouseEvent event) {
        reset_but.setVisible(false);
        menu_but.setVisible(false);
        original_but.setVisible(true);
        winter_but.setVisible(true);
        football_but.setVisible(true);
        doddle_move_up = true;
        beetwen_platforms_y = 90;

    }


    @FXML
    void reset_click() {
        reset_but.setVisible(false);
        menu_but.setVisible(false);
        backgr.setVisible(true);
        doodle.setVisible(true);
        doddle_move_up = true;
        doodle.setLayoutX(135);
        doodle.setLayoutY(560);
        platforms.clear();
        beetwen_platforms_y = 90;
        platforms_appearence();
        /*for (int p = 0; p < platforms.size(); p++) {
            platforms.get(p).setVisible(true);
        }*/

        timer.start();

    }
}