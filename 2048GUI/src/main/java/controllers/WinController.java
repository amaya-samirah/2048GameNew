package controllers;

import java.io.IOException;

import game.gui.App;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class WinController {

    @FXML
    private Button button_exit;

    @FXML
    private Button button_goHome;

    @FXML
    void exitGame(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void goHome(ActionEvent event) throws IOException {
        App.setRoot("home");
    }

}
