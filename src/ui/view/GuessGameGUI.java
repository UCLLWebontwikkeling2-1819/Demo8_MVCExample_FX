package ui.view;

import domain.GuessGame;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 * Sets up the user interface of the game
 * Adds the game control to the buttons
 */
public class GuessGameGUI {
    private final GuessGame game = new GuessGame();
    private final TextField inputField = new TextField();
    private final Text message = new Text();
    private final Button quit = new Button("Done");
    private final Button guessButton = new Button("Guess a number");

    public GuessGameGUI(GridPane root) {
        setupPane(root);

        customExitButton(quit);

        // add event to guess Button
        this.guessButton.setOnAction(event ->
        {
            int guessedNumber = Integer.parseInt(inputField.getText());
            message.setText(game.guess(guessedNumber));
        });


        addNodesToRoot(root);


    }

    private void addNodesToRoot(GridPane root) {
        // add nodes to root
        root.add(message, 0, 0, 2, 1);
        root.add(guessButton, 0, 1, 2, 1);
        root.add(inputField, 0, 2);
        root.add(quit, 2, 3);
        quit.setAlignment(Pos.BASELINE_RIGHT);
    }


    private void customExitButton(Button quit) {
        // add event to button quit
        this.quit.setOnAction(event ->
                Platform.exit()
        );
    }

    private void setupPane(GridPane root) {
        // setup pane
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(15);
        root.setHgap(15);
    }
}
