package Week_12_GUI_Functionality;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Control_Circle_With_Mouse_And_Key extends Application {
    private CirclePane circlePane = new CirclePane();
    
    @Override
    public void start (Stage primaryStage){
        //Hold two buttons in an HBox
        HBox hb = new HBox();
        hb.setSpacing(10);
        hb.setAlignment(Pos.CENTER);
        Button btEn = new Button("Enlarge");
        Button btShr = new Button("Shrink");
        hb.getChildren().add(btEn);
        hb.getChildren().add(btShr);
        
        // Create and register the handler
        btEn.setOnAction(e -> circlePane.enlarge());// bu kod circle ni kottalashtiradi
        btShr.setOnAction(e -> circlePane.shrink());// bu kod esa circle ni kichiklashtiradi
        
        BorderPane bP = new BorderPane();
        bP.setCenter(circlePane);
        bP.setBottom(hb);
        BorderPane.setAlignment(hb, Pos.CENTER);
        
        //Create a scene and place it in the stage
        Scene scene = new Scene(bP, 200, 150);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        circlePane.setOnMouseClicked(e ->{
            if(e.getButton() == MouseButton.PRIMARY){ 
                circlePane.enlarge();
            }
            else if(e.getButton() == MouseButton.SECONDARY){
                circlePane.shrink();
            }
        });
        
        scene.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.UP){
                circlePane.enlarge();
            }
            else if (e.getCode() == KeyCode.DOWN) {
                circlePane.shrink();
            }
        });
    }
    
    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e){
            circlePane.enlarge();
          }
        }
     class ShrinkHandler implements EventHandler<ActionEvent>{
         @Override
         public void handle(ActionEvent e){
             circlePane.shrink();
         }
     }
    
    public static void main(String[] args) {
        launch(args);
    }
}
