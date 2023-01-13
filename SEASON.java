package Week_12_GUI_Design;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class SEASON extends Application  {
    @Override//Override the start method in the Application class
public void start (Stage primaryStage) {
    
    // Create a pane to hold the image views
        BorderPane pane = new BorderPane(); //1
        pane.setPadding(new Insets(15, 15, 15, 15));
        
    // Create a scene and place a button in the scene 
    Circle cir1 = new Circle();
    cir1.setCenterX(150);
    cir1.setCenterY(150);
    cir1.setRadius(75);
    cir1.setStroke(Color.BLUE);
    cir1.setFill(Color.BURLYWOOD);// Circle in site is color
  //  circle.setFill(null); // Circle in site is do not color

  Circle cir2 = new Circle();
    cir2.setCenterX(100);
    cir2.setCenterY(100);
    cir2.setRadius(50);
    cir2.setStroke(Color.AQUA);
    cir2.setFill(Color.BISQUE);// Circle in site is color
  //  circle.setFill(null); // Circle in site is do not color
  
  Circle cir3 = new Circle();
    cir3.setCenterX(50);
    cir3.setCenterY(50);
    cir3.setRadius(25);
    cir3.setStroke(Color.YELLOWGREEN);
    cir3.setFill(Color.BLACK);// Circle in site is color
  //  circle.setFill(null); // Circle in site is do not color
  
  Circle cir4 = new Circle();
    cir4.setCenterX(25);
    cir4.setCenterY(25);
    cir4.setRadius(10);
    cir4.setStroke(Color.RED);
    cir4.setFill(Color.CORAL);// Circle in site is color
  //  circle.setFill(null); // Circle in site is do not color
    
     pane.getChildren().add(cir1);
     pane.getChildren().add(cir2);
     pane.getChildren().add(cir3);
     pane.getChildren().add(cir4);
    
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
