package com;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public HelloApplication() {
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StartScene.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        stage.setTitle("World of Skovbrand");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
