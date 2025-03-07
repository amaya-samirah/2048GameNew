package controllers;

import java.io.IOException;

import game.gui.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Game;
import model.UserList;

public class HomeController {

    @FXML
    private Button button_login;

    @FXML
    private TextField txt_password;

    @FXML
    private TextField txt_userName;

    @FXML
    void login(ActionEvent event) throws IOException {
        String userName = txt_userName.getText();
        String password = txt_password.getText();

        UserList users = UserList.getInstance();
        App.game = new Game(users);

        boolean loginSuccess = App.game.logIn(userName, password);
        if (!loginSuccess) {
            System.out.println("Login Failed");
        } else {
           System.out.println("Login Success"); 
           App.setRoot("mode");
        }
    }
}
