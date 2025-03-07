package game.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Scene scene;

    public void start(Stage stage) throws IOException {
        System.out.println("Reached start method");
        scene = new Scene(loadFXML("home"), 389, 473);
        System.out.println("Reached new scene creation");
        stage.setScene(scene);
        System.out.println("Reached stage set scene");
        stage.show();
        System.out.println("Reached stage show");
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/game/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
