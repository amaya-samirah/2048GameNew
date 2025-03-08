package controllers;

import game.gui.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class PlayController {

    @FXML
    private GridPane board_grid;

    @FXML
    private Button button_down;

    @FXML
    private Button button_left;

    @FXML
    private Button button_quit;

    @FXML
    private Button button_right;

    @FXML
    private Button button_start;

    @FXML
    private Button button_up;

    @FXML
    private ImageView im_2 = new ImageView();
    
    @FXML
    private ImageView im_4 = new ImageView();

    @FXML
    private ImageView im_8 = new ImageView();

    @FXML
    private ImageView im_16 = new ImageView();

    @FXML
    private ImageView im_32 = new ImageView();

    @FXML
    private ImageView im_64 = new ImageView();

    @FXML
    private ImageView im_128 = new ImageView();

    @FXML
    private ImageView im_256 = new ImageView();

    @FXML
    private ImageView im_512 = new ImageView();

    @FXML
    private ImageView im_1024 = new ImageView();

    @FXML
    private ImageView im_2048 = new ImageView();

    @FXML
    private Label label_bestScore;

    @FXML
    private Label label_currScore;

    @FXML
    void quitGame(ActionEvent event) {

    }

    @FXML
    void startGame(ActionEvent event) {
        label_bestScore.setText("BEST SCORE: "+App.game.getCurrUser().getBestScore());
        label_currScore.setText("SCORE: 0");
    }

    @FXML
    void moveDown(ActionEvent event) {

    }

    @FXML
    void moveLeft(ActionEvent event) {

    }

    @FXML
    void moveRight(ActionEvent event) {

    }

    @FXML
    void moveUp(ActionEvent event) {

    }

}
