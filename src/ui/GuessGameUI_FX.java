package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Main class
 * Run this class to play the game
 */
public class GuessGameUI_FX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        Scene scene = new Scene(root);

        new GuessGameGUI(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Demo Guessgame");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
