package Week_13_GUI;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;

public class CollorPickRectangle extends Application {
    // labels
    Label l;
     public static void main(String[] args) {
        launch(args);
    }
    //Launch the application
    public void start(Stage s) {
    
        //set title for the stage
        s.setTitle("Creating color picker");
        
        //creat a tile pane
        TilePane r = new TilePane();
        
        //create a label
        l = new Label("This is a color picker example ");
        
        // create a color picker
        ColorPicker cp = new ColorPicker(Color.AQUA);
        
        //Rectangle
        Rectangle rec = new Rectangle(75, 50);
        rec.setFill(Color.AQUA);
        
        //Lambda for our color picker
        cp.setOnAction((ActionEvent e) -> {
            System.out.println("Changing color to -> " + cp.getValue());
            rec.setFill(cp.getValue());
        });
        
        //add label
        r.getChildren().add(l);
        r.getChildren().add(cp);
        r.getChildren().add(rec);
        
        //create a scene
        Scene sc = new Scene(r, 200, 200);
        
        //set the scene
        s.setScene(sc);
        s.show();
        
   
    }   
}
