package Week_13_GUI;

import java.awt.Color;
import javafx.animation.RotateTransition;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.util.Duration;

/**
 * Odiljonova Khilola
 * CIT244 I love my Java
 */
public class ACE_Image extends Application
{
   
    
@Override
public void start(Stage primaryStage){
    //Constants for the scene size
    final double SCENE_WIDTH = 250.0;
    final double SCENE_HEIGHT = 300.0;
    
    //Constants for the animation
     final double HALF_SEC = 500.0;
     final double FROM_ANGLE = 0.0;
     final double TO_ANGLE = 360.0;
     
     //Constant for the layout padding space
     final double PADDING_SPACE = 20.0;
      
     // Create a BorderPane
     BorderPane bp = new BorderPane();
     
     //Make a DropShadow effect
     DropShadow dsh = new DropShadow();
     //Make a SepiaTone effect
     SepiaTone sep = new SepiaTone();
     //Make a Reflection effect
     Reflection  ref = new Reflection();
     //Combine the DropShadow with the SepiaTone
     sep.setInput(dsh);
     //Combine the SepiaTone with the Reflection 
     ref.setInput(sep);
     
     //Create an Image and ImageView components
     Image im = new Image("https://images.fineartamerica.com/images/artworkimages/medium/1/poker-playing-card-ace-diamond-miroslav-nemecek-transparent.png", 200, 200, false, false);
     ImageView imv = new ImageView(im);
     imv.setEffect(ref);
     // Create a RotateTransition object for the ImageView
     RotateTransition rt =
             new RotateTransition(new Duration(HALF_SEC), imv);
     rt.setFromAngle(FROM_ANGLE);
     rt.setToAngle(TO_ANGLE);
     
     //Put the ImageView in the center of the BorderPane
     bp.setCenter(imv);
     
     // Create a Button to start the animation
     Button spinB = new Button("Spin");
      spinB.setStyle("-fx-background-color : red");
      
     // Create an event handler for the Button 
     spinB.setOnAction(event ->
     {
         rt.play();
     });
     
     //Put the Button in an HBox
     HBox hb = new HBox(spinB);
     hb.setAlignment(Pos.CENTER);
     hb.setPadding(new Insets(PADDING_SPACE));
     
     //Put the HBox in the bottom region of the BorderPane
     bp.setBottom(hb);
     
     //Create a Scene and display it
     Scene sc = new Scene(bp, SCENE_WIDTH, SCENE_HEIGHT);
     primaryStage.setTitle("Spin ACE Diamond");
     primaryStage.setScene(sc);
     primaryStage.show();
   }

  public static void main(String[] args) {
       launch(args);
    }
}