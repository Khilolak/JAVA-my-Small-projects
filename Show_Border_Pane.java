package Week_12_GUI_Design;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Show_Border_Pane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage){
        // Create a border pane
        BorderPane pane = new BorderPane();
        
        // Place nodes in the pane
        pane.setTop(new CustomPane("Top"));
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("Center"));
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show Border Pane"); // Set the stage title
        primaryStage.setScene(scene);
        primaryStage.show(); // Display the stage
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}

   // Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane{
    public CustomPane(String title){
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}