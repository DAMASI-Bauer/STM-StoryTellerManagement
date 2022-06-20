package com.damasi.stm.controller;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLExampleController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void changeScene(MouseEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/" + ((TreeItem) ((TreeView) event.getSource()).getSelectionModel().getSelectedItem()).getValue().toString() + ".fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } finally {

        }

    }
}