/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package simple;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Main.class, (java.lang.String[])null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            GridPane page = (GridPane) FXMLLoader.load(Main.class.getResource("simple.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("FXML is Simple");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}