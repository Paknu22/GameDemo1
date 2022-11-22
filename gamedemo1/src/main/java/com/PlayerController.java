package com;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PlayerController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    String name;
    double score;
    public ArrayList<String> playerInventory = new ArrayList();
    @FXML
    TextField nameContainer;

    public PlayerController() {
    }

    public void switchToMainMenu(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load((URL)Objects.requireNonNull(this.getClass().getResource("MainMenuScene.fxml")));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        this.stage.setScene(this.scene);
        this.stage.show();
        this.name = this.nameContainer.getText();
        System.out.println(this.name);
    }
}
