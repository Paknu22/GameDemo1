package com;

import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GameSessionController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label InformationLabel;
    @FXML
    private RadioButton rButton1;
    @FXML
    private RadioButton rButton2;
    @FXML
    private RadioButton rButton3;
    @FXML
    private RadioButton rButton4;
    @FXML
    private RadioButton rButton5;
    @FXML
    private RadioButton rButton6;
    @FXML
    private RadioButton rButton7;
    @FXML
    Button BackButton;
    @FXML
    ImageView image1;

    public GameSessionController() {
    }

    public void informationScene(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("InformationScene.fxml"));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        this.stage.setScene(this.scene);
        this.stage.show();
        this.stage.setResizable(false);
    }

    public void getInformation(ActionEvent event) throws IOException {
        if (this.rButton1.isSelected()) {
            this.InformationLabel.setText("Information 1");
        } else if (this.rButton2.isSelected()) {
            this.InformationLabel.setText("Information 2");
        } else if (this.rButton3.isSelected()) {
            this.InformationLabel.setText("Information 3");
        } else if (this.rButton4.isSelected()) {
            this.InformationLabel.setText("Information 4");
        } else if (this.rButton5.isSelected()) {
            this.InformationLabel.setText("Information 5");
        } else if (this.rButton6.isSelected()) {
            this.InformationLabel.setText("Information 6");
        } else if (this.rButton7.isSelected()) {
            this.InformationLabel.setText("Information 7");
        }

    }

    public void mainMenu(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("MainMenuScene.fxml"));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        this.stage.setScene(this.scene);
        this.stage.show();
        this.stage.setResizable(false);
    }

    public void HelpScene(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load(((Class)Objects.requireNonNull(this.getClass())).getResource("MainMenuHelp.fxml"));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        this.stage.setScene(this.scene);
        this.stage.show();
        this.stage.setResizable(false);
    }

    public void HelpSceneInformation(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("InformationHelp.fxml"));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        this.stage.setScene(this.scene);
        this.stage.show();
        this.stage.setResizable(false);
    }

    public void gameScene(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("../../../../target/classes/com/WorldMap.fxml"));
        this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        this.stage.setScene(this.scene);
        this.stage.show();
    }
}
