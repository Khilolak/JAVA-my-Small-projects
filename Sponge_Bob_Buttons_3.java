package Week_12_GUI_Functionality;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Sponge_Bob_Buttons_3 extends Application{
    
    public static void main(String[] args) {
        
        launch(args);//0
    }
     @Override
    public void start(Stage primaryStage) throws Exception {
        
        // Create a pane to hold the image views
        BorderPane pane = new BorderPane(); //1
        pane.setPadding(new Insets(15, 15, 15, 15));
        
        // Load images
        Image spongebob = new Image("https://i.pinimg.com/564x/52/01/aa/5201aa66743f162c6adb565d8754d14a.jpg", 100, 100, false, false);
        Image patrick = new Image("https://preview.redd.it/gbtfz3bu81n11.jpg?width=960&crop=smart&auto=webp&s=200a83e73b47a95776bc1a7b1cc3aadbf1f61966", 100, 100, false, false);
        Image plankton = new Image("https://i.pinimg.com/564x/bd/a9/44/bda944b838ecbf867917c445a69347d7.jpg", 100, 100, false, false);
        Image squidward = new Image("https://i.pinimg.com/564x/a8/04/32/a80432f24bfc4bbfb934f76d11c49fd7.jpg", 100, 100, false, false);
        Image krabs = new Image("https://i.kym-cdn.com/entries/icons/original/000/026/111/4917038d8bbd7fe362bed691690c7da4.jpg", 100, 100, false, false);
        
        // Make the buttons the images will sit on
        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        Button b4 = new Button();
        Button b5 = new Button();
        
        // Add the nodes to the pane
        pane.setCenter(b1);
        b1.setGraphic(new ImageView(spongebob));
        
        pane.setLeft(b2);
        b2.setGraphic(new ImageView(patrick));
        
        pane.setRight(b3);
        b3.setGraphic(new ImageView(plankton));
        
        pane.setTop(b4);
        b4.setGraphic(new ImageView(squidward));
        BorderPane.setAlignment(b4, Pos.TOP_CENTER);
        
        pane.setBottom(b5);
        b5.setGraphic(new ImageView(krabs));
        BorderPane.setAlignment(b5, Pos.BOTTOM_CENTER);
        
        // *** ADD FUNCTIONALITY HERE ***
        b1.setOnAction((ActionEvent e) -> {
            System.out.println("Spongebob");
        });
        b2.setOnAction((ActionEvent e) ->{
            System.out.println("Patrick");
        });
        
        b3.setOnAction((ActionEvent e) ->{
            System.out.println("Plankton");
        });
        
        b4.setOnAction((ActionEvent e) ->{
            System.out.println("Squidward");
        });
        
        b5.setOnAction((ActionEvent e) ->{
            System.out.println("Krabs");
        });
        
        //Change a picture with a mouse click
        b1.setOnMouseClicked(e ->{
            // Right click
            if(e.getButton() == MouseButton.SECONDARY){
                b1.setGraphic(new ImageView(patrick));
            }
            // Left Click
            else if(e.getButton() ==MouseButton.PRIMARY){
                b1.setGraphic(new ImageView(spongebob));
            }
        });
        
        //Change a picture with a mouse click
        b2.setOnMouseClicked(e ->{
            // Right click
            if(e.getButton() == MouseButton.SECONDARY){
                b2.setGraphic(new ImageView(spongebob));
            }
            // Left Click
            else if(e.getButton() ==MouseButton.PRIMARY){
                b2.setGraphic(new ImageView(patrick));
            }
        });
        
        //Change a picture with a mouse click
        b3.setOnMouseClicked(e ->{
            // Right click
            if(e.getButton() == MouseButton.SECONDARY){
                b3.setGraphic(new ImageView(squidward));
            }
            // Left Click
            else if(e.getButton() ==MouseButton.PRIMARY){
                b3.setGraphic(new ImageView(plankton));
            }
        });
        
        //Change a picture with a mouse click
        b4.setOnMouseClicked(e ->{
            // Right click
            if(e.getButton() == MouseButton.SECONDARY){
                b4.setGraphic(new ImageView(krabs));
            }
            // Left Click
            else if(e.getButton() ==MouseButton.PRIMARY){
                b4.setGraphic(new ImageView(squidward));
            }
        });
        
        //Change a picture with a mouse click
        b5.setOnMouseClicked(e ->{
            // Right click
            if(e.getButton() == MouseButton.SECONDARY){
                b5.setGraphic(new ImageView(plankton));
            }
            // Left Click
            else if(e.getButton() ==MouseButton.PRIMARY){
                b5.setGraphic(new ImageView(krabs));
            }
        });
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);//2
        primaryStage.setTitle("Sponge Bob Buttons"); // Set the stage title//3
        primaryStage.setScene(scene);//4
        primaryStage.show(); // Display the stage      //5 Okna yaratildi
    }
}
