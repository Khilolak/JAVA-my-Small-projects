/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Odiljonova Khilola
 */
public class Menu_coffee extends API_Menu {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // create BorderPane bp gap around and background
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(20, 20, 20, 20));
        bp.setStyle("-fx-background-color: #FFD34E");
       
        Scene scene = new Scene(bp, 620, 510);
       
        Label titleLabel = makeTop("Wellcome to Vietnamese Coffee", 20, Color.RED);
        titleLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 25));
        titleLabel.setAlignment(Pos.CENTER);
        
        bp.setTop(titleLabel);
        BorderPane.setAlignment(titleLabel, Pos.CENTER);
        
        VBox left = leftBread("Bread","White","Wheat");
        bp.setLeft(left); 
               
       VBox center = centerIced("Iced Espresso coffee","Cappuccino",
          "Vanilla Latte","Caramel Macchiato","Mocha dark or white chocolate");
        bp.setCenter(center);
               
        VBox right = rightTradcoffee("Traditional Coffee","Black coffee",
        "Iced black coffee","Iced sweet condensed milk","Hot sweet condensed milk");
        bp.setRight(right);
        // image and button at bottom
        VBox bottom = makeBottom("https://images-na.ssl-images-amazon.com/images/I/91E6UOZBFbL.jpg",
                "Calculate", "Exit");
        bp.setBottom(bottom);
        BorderPane.setAlignment(bottom, Pos.CENTER);
              
        primaryStage.setTitle("Menu");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
