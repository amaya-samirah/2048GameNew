package controllers;

import java.io.IOException;

import game.gui.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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
    void quitGame(ActionEvent event) throws IOException {
        App.game.logOut();
        App.setRoot("home");
    }

    @FXML
    void startGame(ActionEvent event) {
        label_bestScore.setText("BEST SCORE: "+App.game.getCurrUser().getBestScore());
        label_currScore.setText("SCORE: 0");
        //int gameBoard[][] = App.game.getBoard();
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (App.game.getBoard(y, x) != 0) {
                    addBlock(y, x, App.game.getBoard(y, x));
                }
            }
        }
    }

    @FXML
    void moveDown(ActionEvent event) {
        App.game.move(-1);
        updateBoard();
        
    }

    @FXML
    void moveLeft(ActionEvent event) {
        App.game.move(-2);
        updateBoard();
    }

    @FXML
    void moveRight(ActionEvent event) {
        App.game.move(2);
        updateBoard();
    }

    @FXML
    void moveUp(ActionEvent event) {
        App.game.move(1);
        updateBoard();
    }

    public void result() throws IOException {
        if (App.game.hasWon()) {
            App.setRoot("win");
        } else if (App.game.hasLost()) {
            App.setRoot("lose");
        }
    }

    public void addBlock(int yPos, int xPos, int block) {
        switch (block) {
            case 2:
                im_2 = new ImageView(new Image(getClass().getResourceAsStream("/images/two.png")));
                im_2.setFitWidth(82);
                im_2.setFitHeight(77);
                board_grid.add(im_2, xPos, yPos);
                break;
            case 4:
                im_4 = new ImageView(new Image(getClass().getResourceAsStream("/images/four.png")));
                im_4.setFitWidth(82);
                im_4.setFitHeight(77);
                board_grid.add(im_4, xPos, yPos);
                break;
            case 8:
                im_8 = new ImageView(new Image(getClass().getResourceAsStream("/images/eight.png")));
                im_8.setFitWidth(82);
                im_8.setFitHeight(77);
                board_grid.add(im_8, xPos, yPos);
                break;
            case 16:
                im_16 = new ImageView(new Image(getClass().getResourceAsStream("/images/sixteen.png")));
                im_16.setFitWidth(82);
                im_16.setFitHeight(77);
                board_grid.add(im_16, xPos, yPos);
                break;
            case 32:
                im_32 = new ImageView(new Image(getClass().getResourceAsStream("/images/thirtytwo.png")));
                im_32.setFitWidth(82);
                im_32.setFitHeight(77);
                board_grid.add(im_32, xPos, yPos);
                break;
            case 64:
                im_64 = new ImageView(new Image(getClass().getResourceAsStream("/images/sixtyfour.png")));
                im_64.setFitWidth(82);
                im_64.setFitHeight(77);
                board_grid.add(im_64, xPos, yPos);
                break;
            case 128:
                im_128 = new ImageView(new Image(getClass().getResourceAsStream("/images/onetwentyeight.png")));
                im_128.setFitWidth(82);
                im_128.setFitHeight(77);
                board_grid.add(im_128, xPos, yPos);
                break;
            case 256:
                im_256 = new ImageView(new Image(getClass().getResourceAsStream("/images/twofiftysix.png")));
                im_256.setFitWidth(82);
                im_256.setFitHeight(77);
                board_grid.add(im_256, xPos, yPos);
                break;
            case 512:
                im_512 = new ImageView(new Image(getClass().getResourceAsStream("/images/fivetwelve.png")));
                im_512.setFitWidth(82);
                im_512.setFitHeight(77);
                board_grid.add(im_512, xPos, yPos);
                break;
            case 1024:
                im_1024 = new ImageView(new Image(getClass().getResourceAsStream("/images/tentwentyfour.png")));
                im_1024.setFitWidth(82);
                im_1024.setFitHeight(77);
                board_grid.add(im_1024, xPos, yPos);
                break;
            case 2048:
                im_2048 = new ImageView(new Image(getClass().getResourceAsStream("/images/twentyfortyeight.png")));
                im_2048.setFitWidth(82);
                im_2048.setFitHeight(77);
                board_grid.add(im_2048, xPos, yPos);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void deleteBlock(int yPos, int xPos) {
        board_grid.getChildren().removeIf(node -> 
        GridPane.getColumnIndex(node) == xPos && GridPane.getRowIndex(node) == yPos);
    }

    public void updateBoard() {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (App.game.getBoard(y, x) != 0) {
                    addBlock(y, x, App.game.getBoard(y, x));
                } else {
                    deleteBlock(y, x);
                }
            }
        }

        updateScore();
    }

    public void updateScore() {
        label_currScore.setText("SCORE: "+App.game.getCurrScore());
    }
}
