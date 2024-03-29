package sample;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    public Pane myPane;
    @FXML
    public Button Mybutton;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Circle circle = new Circle();
        circle.setRadius(30);
        circle.setFill(Color.BLUE);
        circle.setTranslateX(50);
        circle.setTranslateY(50);
        myPane.getChildren().add(circle);
        Mybutton.setOnAction(event -> {
            startAnimation(circle);
        });


    }

    private void startAnimation(Circle circle) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.2),circle);

        transition.setToY(300);
        transition.play();
    }
}
