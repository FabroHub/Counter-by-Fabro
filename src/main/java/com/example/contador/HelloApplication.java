package com.example.contador;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("contador.fxml"));

        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Simple Counter");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // This makes able the Keyboard events
        root.requestFocus();
        root.setOnKeyPressed(event -> {
            HelloController controller = fxmlLoader.getController();
            controller.accion(event);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}