package controllers;

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
    void quitGame(ActionEvent event) {

    }

    @FXML
    void startGame(ActionEvent event) {
        setImages();

        label_bestScore.setText("BEST SCORE: "+App.game.getCurrUser().getBestScore());
        label_currScore.setText("SCORE: 0");
        int gameBoard[][] = App.game.getBoard();
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (gameBoard[y][x] != 0) {
                    addBlock(y, x, gameBoard[y][x]);
                }
            }
        }
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

    public void setImages() {
        im_2.setImage(new Image(getClass().getResourceAsStream("/images/two.png")));
        im_4.setImage(new Image(getClass().getResourceAsStream("/images/four.png")));
        im_8.setImage(new Image(getClass().getResourceAsStream("/images/eight.png")));
        im_16.setImage(new Image(getClass().getResourceAsStream("/images/sixteen.png")));
        im_32.setImage(new Image(getClass().getResourceAsStream("/images/thirtytwo.png")));
        im_64.setImage(new Image(getClass().getResourceAsStream("/images/sixtyfour.png")));
        im_128.setImage(new Image(getClass().getResourceAsStream("/images/onetwentyeight.png")));
        im_256.setImage(new Image(getClass().getResourceAsStream("/images/twofiftysix.png")));
        im_512.setImage(new Image(getClass().getResourceAsStream("/images/fivetwelve.png")));
        im_1024.setImage(new Image(getClass().getResourceAsStream("/images/tentwentyfour.png")));
        im_2048.setImage(new Image(getClass().getResourceAsStream("/images/twentyfortyeight.png")));

        im_2.setFitWidth(82);
        im_2.setFitHeight(77);
        im_4.setFitWidth(82);
        im_4.setFitHeight(77);
        im_8.setFitWidth(82);
        im_8.setFitHeight(77);
        im_16.setFitWidth(82);
        im_16.setFitHeight(77);
        im_32.setFitWidth(82);
        im_32.setFitHeight(77);
        im_64.setFitWidth(82);
        im_64.setFitHeight(77);
        im_128.setFitWidth(82);
        im_128.setFitHeight(77);
        im_256.setFitWidth(82);
        im_256.setFitHeight(77);
        im_512.setFitWidth(82);
        im_512.setFitHeight(77);
        im_1024.setFitWidth(82);
        im_1024.setFitHeight(77);
        im_2048.setFitWidth(82);
        im_2048.setFitHeight(77);
    }

    public void addBlock(int yPos, int xPos, int block) {
        switch (block) {
            case 2:
                board_grid.add(im_2, yPos, xPos);
                break;
            case 4:
                board_grid.add(im_4, yPos, xPos);
                break;
            case 8:
                board_grid.add(im_8, yPos, xPos);
                break;
            case 16:
                board_grid.add(im_16, yPos, xPos);
                break;
            case 32:
                board_grid.add(im_32, yPos, xPos);
                break;
            case 64:
                board_grid.add(im_64, yPos, xPos);
                break;
            case 128:
                board_grid.add(im_128, yPos, xPos);
                break;
            case 256:
                board_grid.add(im_256, yPos, xPos);
                break;
            case 512:
                board_grid.add(im_512, yPos, xPos);
                break;
            case 1024:
                board_grid.add(im_1024, yPos, xPos);
                break;
            case 2048:
                board_grid.add(im_2048, yPos, xPos);
                break;
            default:
                throw new AssertionError();
        }
    }

}
