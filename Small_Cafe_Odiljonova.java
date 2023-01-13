package Week_12_GUI_Functionality;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;

//Odiljonova Khilola CIT 244

public class Small_Cafe_Odiljonova extends Application{
    
   // Create Fields
        CheckBox HotDogBox;
        CheckBox SliceCheezPizzaBox;
        CheckBox SlicePeperPizzaBox;
        CheckBox friesBox;
        CheckBox PittTax;
        Label TotalBox;
  
        
        public static void main(String[] args) {
        
        launch(args);
        }
     @Override
    public void start(Stage primaryStage) {
        
        //Create the CheckBoxs
        HotDogBox = new CheckBox("Hot Dog - $6.25");
        HotDogBox.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 12));
        SliceCheezPizzaBox = new CheckBox("Slice Of Cheese Pizza - $3.00 ");
        SliceCheezPizzaBox.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 12));
        SlicePeperPizzaBox = new CheckBox("Slice Of Pepperoni Pizza - $4.00");
        SlicePeperPizzaBox.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 12));
        friesBox = new CheckBox("French Fries - $ 1.75");
        friesBox.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 12));
        PittTax = new CheckBox("Sales tax rate is currently 6%");
        PittTax.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 12));
        
        // Text (Title in the VBox)
        Text title = new Text(20, 20, "Small Cafe Menu");
        title.setFill(Color.RED);
        title.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20));
   
        // Create the Button controler
        Button totalBox = new Button("Cost Total");
        totalBox.setStyle("-fx-background-color:#90ee90");
        // Register the event handler
        totalBox.setOnAction(new TotalButtonHandler());
 
        //Create a Label for the total
        TotalBox = new Label("$0.00");
        TotalBox.setStyle("-fx-background-color:#90ee90");
        // Put the CheckBoxes in a VBox
        VBox checkBox = new VBox(15, HotDogBox, SliceCheezPizzaBox, SlicePeperPizzaBox,
        friesBox, PittTax);
        
        // Create another VBox to use as the root node.
        VBox mainBox = new VBox(15, title,checkBox, totalBox, TotalBox);
        
        //Set the main VBox's alignment to center
        mainBox.setAlignment(Pos.CENTER);
        
        //Set the main VBox's padding to 15 pixels
        mainBox.setPadding(new Insets(15));
        mainBox.setFillWidth(true);
        mainBox.setStyle("-fx-background-color : gold");
        // Create a Scene
        Scene sc = new Scene(mainBox);
    
        // Add the Scene to the Stage
        primaryStage.setTitle("Small Cafe");
        primaryStage.setScene(sc);
        
        //Show the window
        primaryStage.show();
        
    }
       /**
        Event handler class for totalBox
        */
       class TotalButtonHandler implements EventHandler<ActionEvent>{
           @Override
           public void handle(ActionEvent event){
               
               // Variable to hold the result
               double result = 0;
               double tax = 0.06;
               
               //Add all the foods
               if(HotDogBox.isSelected()){
                   result += 6.25;
               }
               if(SliceCheezPizzaBox.isSelected()){
                   result += 3.00;
               }
               if(SlicePeperPizzaBox.isSelected()){
                   result += 4.00;
               }
               if(friesBox.isSelected()){
                   result += 1.75;
               }
               if(PittTax.isSelected()){
                   result += tax;
               }
               
               //Display the results.
               TotalBox.setText(String.format("$%,.2f", result));
           }
       }
    }
