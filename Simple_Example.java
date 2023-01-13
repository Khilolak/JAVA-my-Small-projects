package Week_12_GUI_Functionality;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.geometry.*;

public class Simple_Example extends Application {
    @Override
    public void start(Stage primaryStage){
        // Create a pane and set its properties
        GridPane pa = new GridPane();
        pa.setPadding(new Insets(10, 10, 10, 10));
       
        // Button
        Button b = new Button("BUTTON");
        
        String[] words = {"Example", "Something", "Word", "Look", "Cake",
       "Test", "Button", "Lola" };
        
        // Lambda
        b.setOnAction((ActionEvent e) -> {
            System.out.println("Button Pressed");
            //System.out.println((int)(Math.random()* words.length));
            b.setText(words[(int)(Math.random()* words.length)]);
        });
        
        
        pa.add(b, 1, 0);
        
        // Create a scene and place it in the stage
        Scene sc = new Scene(pa);
        primaryStage.setWidth(200);
        primaryStage.setMinHeight(200);
        primaryStage.setTitle("Key Event Demo"); // Set the stage title
        primaryStage.setScene(sc); // Place the scene in the stage
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        
         launch(args);
    }
    
}
