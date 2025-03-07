module game.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens game.gui to javafx.fxml;
    exports game.gui;

    opens controllers to javafx.fxml;
    exports controllers;

    opens model to javafx.fxml;
    exports model;
    
}