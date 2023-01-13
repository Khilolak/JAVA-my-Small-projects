package Week_12_GUI_Design;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Show_Text extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage){
      // Create a pane to hold the texts
      Pane pane = new Pane();
      pane.setPadding(new Insets(5, 5, 5, 5));
      Text text1 = new Text(20, 20, "Programming is fun");
      text1.setFont(Font.font("Courier", FontWeight.BOLD,
              FontPosture.ITALIC, 15));
      pane.getChildren().add(text1);
      
      Text text2 = new Text(60, 60, "Programming is fun\nDisplay text");
      pane.getChildren().add(text2);
      
      Text text3 = new Text(10, 100, "Programming is fun\nDisplay text");
      text3.setFill(Color.BURLYWOOD);
      text3.setUnderline(true);
      text3.setStrikethrough(true);
      pane.getChildren().add(text3);
      
      // Create a scene and place it in the stage
      Scene scene = new Scene(pane);
      primaryStage.setTitle("Show Text");
      primaryStage.setScene(scene);
      primaryStage.show();
      
      
    }

   /**
     *The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
