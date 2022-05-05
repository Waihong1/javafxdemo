package com.example.javafxdemo;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class WorldClockController implements Initializable {
    Time time = new Time(new CurrentTime().currentTime(),0);
    Time time2 = new Time(new CurrentTime().currentTime(),1 );
    Time time3 = new Time(new CurrentTime().currentTime(),2 );
    Time time4 = new Time(new CurrentTime().currentTime(),-1 );
    Time time5 = new Time(new CurrentTime().currentTime(),-2 );
    Time time6 = new Time(new CurrentTime().currentTime(),-3 );
    Time time7 = new Time(new CurrentTime().currentTime(),-4 );


    @FXML
    private Text timer;
    @FXML
    private Text timer2;
    @FXML
    private Text timer3;
    @FXML
    private Text timer4;
    @FXML
    private Text timer5;
    @FXML
    private Text timer6;
    @FXML
    private Text timer7;

    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1),  e -> {

        time.oneSecondPassed();
        timer.setText(time.getCurrentTime());
    }));


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timer.setText(time.getCurrentTime());

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        timer2.setText(time2.getCurrentTime());

        timeline2.setCycleCount(Timeline.INDEFINITE);
        timeline2.play();

        timer3.setText(time3.getCurrentTime());

        timeline3.setCycleCount(Timeline.INDEFINITE);
        timeline3.play();

        timer4.setText(time4.getCurrentTime());

        timeline4.setCycleCount(Timeline.INDEFINITE);
        timeline4.play();

        timer5.setText(time4.getCurrentTime());

        timeline5.setCycleCount(Timeline.INDEFINITE);
        timeline5.play();

        timer6.setText(time6.getCurrentTime());

        timeline6.setCycleCount(Timeline.INDEFINITE);
        timeline6.play();

        timer7.setText(time7.getCurrentTime());

        timeline7.setCycleCount(Timeline.INDEFINITE);
        timeline7.play();
    }


    Timeline timeline2 = new Timeline(new KeyFrame(Duration.seconds(1),  e -> {

        time2.oneSecondPassed();

        timer2.setText(time2.getCurrentTime());
    }));

    Timeline timeline3 = new Timeline(new KeyFrame(Duration.seconds(1),  e -> {

        time3.oneSecondPassed();

        timer3.setText(time3.getCurrentTime());
    }));

    Timeline timeline4 = new Timeline(new KeyFrame(Duration.seconds(1),  e -> {

        time4.oneSecondPassed();

        timer4.setText(time4.getCurrentTime());
    }));
    Timeline timeline5 = new Timeline(new KeyFrame(Duration.seconds(1),  e -> {

        time5.oneSecondPassed();

        timer5.setText(time5.getCurrentTime());
    }));

    Timeline timeline6 = new Timeline(new KeyFrame(Duration.seconds(1),  e -> {

        time6.oneSecondPassed();

        timer6.setText(time6.getCurrentTime());
    }));
    Timeline timeline7 = new Timeline(new KeyFrame(Duration.seconds(1),  e -> {

        time7.oneSecondPassed();

        timer7.setText(time7.getCurrentTime());
    }));

}




