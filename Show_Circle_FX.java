package Week_12_GUI_Design;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Show_Circle_FX extends Application  {
    @Override//Override the start method in the Application class
public void start (Stage primaryStage) {
    // Create a scene and place a button in the scene 
    Circle circle = new Circle();
    circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(50);
    circle.setStroke(Color.BLUE);
    circle.setFill(Color.BURLYWOOD);// Circle in site is color
  //  circle.setFill(null); // Circle in site is do not color

    // Create a pane to hold the circle
    Pane pane = new Pane();
    pane.getChildren().add(circle);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("Show Circle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
}

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     * 
     */
    public static void main(String[] args) {
          launch(args);
    }
    
}
