package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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
    void loginClicked(MouseEvent event) {
        String userName = txt_userName.getText();
        String password = txt_password.getText();

        UserList users = UserList.getInstance();
        Game game = new Game(users);

        boolean loginSuccess = game.logIn(userName, password);
        if (!loginSuccess) {
            System.out.println("Login Failed");
        }
        System.out.println("Login Success");

    }

}
