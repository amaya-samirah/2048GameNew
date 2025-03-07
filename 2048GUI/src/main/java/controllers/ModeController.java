package controllers;

import java.io.IOException;

import game.gui.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ModeController {

    @FXML
    private Button button_1024;

    @FXML
    private Button button_128;

    @FXML
    private Button button_2048;

    @FXML
    private Button button_256;

    @FXML
    private Button button_512;

    @FXML
    void mode1024(ActionEvent event) throws IOException {
        App.game.setMode(1024);
        App.setRoot("play");
        System.out.println("Game Mode: 1024");
    }

    @FXML
    void mode128(ActionEvent event) throws IOException {
        App.game.setMode(128);
        App.setRoot("play");
        System.out.println("Game Mode: 128");
    }

    @FXML
    void mode2048(ActionEvent event) throws IOException {
        App.game.setMode(2048);
        App.setRoot("play");
        System.out.println("Game Mode: 2048");
    }

    @FXML
    void mode256(ActionEvent event) throws IOException {
        App.game.setMode(256);
        App.setRoot("play");
        System.out.println("Game Mode: 256");
    }

    @FXML
    void mode512(ActionEvent event) throws IOException {
        App.game.setMode(512);
        App.setRoot("play");
        System.out.println("Game Mode: 512");
    }

}
