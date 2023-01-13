package Week_12_GUI_Functionality;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class Calculator_GUI_2 extends Application{
    
    char op;
    double num1;
    double num2;

    @Override
    public void start(Stage primaryStage){
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        
        // Setting spacing between nodes in the pain (H and V)
        pane.setHgap(25); // Boutton lar orasidagi masofa kodi
        pane.setVgap(25); //Boutton lar orasidagi masofa kodi
        
        //VBox
        VBox topBox = new VBox(15);
        topBox.setAlignment(Pos.CENTER);
        
        // Text (Title in the VBox)
        Text title = new Text(20, 20, "Simple Calculator");
        title.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        
        // TextField for our VBox
        TextField tf = new TextField();
        tf.setPrefWidth(300);
        tf.setPadding(new Insets(10, 10, 10, 10));
        tf.setEditable(false);
        tf.setAlignment(Pos.CENTER);
        
        // HBox 1 (First set of buttons)
        HBox hb1 = new HBox(15);
        hb1.setAlignment(Pos.CENTER);
        hb1.setScaleX(1.5); // Buttons orasidagi masofa
        hb1.setScaleY(1.5);
        
        
        // HBox 2 (Second set of buttons)
        HBox hb2 = new HBox(15);
        hb2.setAlignment(Pos.CENTER);
        hb2.setScaleX(1.5);
        hb2.setScaleY(1.5);
        
        // HBox 3 (Third set of buttons)
        HBox hb3 = new HBox(15);
        hb3.setAlignment(Pos.CENTER);
        hb3.setScaleX(1.5);
        hb3.setScaleY(1.5);
        
        // HBox 4 (Four set of buttons)
        HBox hb4 = new HBox(15);
        hb4.setAlignment(Pos.CENTER);
        hb4.setScaleX(1);
        hb4.setScaleY(1);
        
        // HBox 5 (Five set of buttons)
        HBox hb5 = new HBox(15);
        hb5.setAlignment(Pos.CENTER);
        hb5.setScaleY(1.25);
        hb5.setScaleX(1.25);
        
        
        //Buttons
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        
        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button dec = new Button(".");
        
        Button bClear = new Button("Clear");
        Button bCalc = new Button("Calc");
         
        // Add nodes to the pane
        pane.add(topBox, 0, 0);
        topBox.getChildren().add(title);
        topBox.getChildren().add(tf);
        
        // Add buttons to HBox 1
        pane.add(hb1, 0, 1);
        hb1.getChildren().add(b1);
        hb1.getChildren().add(b2);
        hb1.getChildren().add(b3);
        
        //Add buttons to HBox 2
        pane.add(hb2, 0, 2);
        hb2.getChildren().addAll(b4, b5, b6);
        
        // Add buttons to HBox 3
        pane.add(hb3, 0, 3);
        hb3.getChildren().addAll(b7, b8, b9);
        
        //Add buttons to HBox 4
        pane.add(hb4, 0, 4);
        hb4.getChildren().addAll(add, sub, b0, mul, div, dec);
        b0.setScaleY(1.5);
        b0.setScaleX(1.5);
        
        
        // Add buttons to HBox 5
        pane.add(hb5, 0, 5);
        hb5.getChildren().addAll(bClear, bCalc);
        
        //Adding color/style to buttons
        bClear.setStyle("-fx-background-color : red");
        bCalc.setStyle("-fx-background-color : #90ee90");
        
        // Creating the handlers (Using lambda)
        b0.setOnMouseClicked(e -> {
            tf.appendText("0");
        });
        
        b1.setOnMouseClicked(e -> {
            tf.appendText("1");
        });
        
        b2.setOnMouseClicked(e -> {
            tf.appendText("2");
        });
        
        b3.setOnMouseClicked(e -> {
            tf.appendText("3");
        });
        
        b4.setOnMouseClicked(e -> {
            tf.appendText("4");
        });
        
        b5.setOnMouseClicked(e -> {
            tf.appendText("5");
        });
        
        b6.setOnMouseClicked(e -> {
            tf.appendText("6");
        });
        
        b7.setOnMouseClicked(e -> {
            tf.appendText("7");
        });
        
        b8.setOnMouseClicked(e -> {
            tf.appendText("8");
        });
        
        b9.setOnMouseClicked(e -> {
            tf.appendText("9");
        });
        
        dec.setOnMouseClicked(e -> {
            tf.appendText(".");
        });
        //Operators (Reads in the first number and assigns the op to the variable)
        add.setOnMouseClicked(e -> {
            op = '+';
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        });
        
        sub.setOnMouseClicked(e -> {
             op = '-';
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        });
        
        mul.setOnMouseClicked(e -> {
            op = '*';
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        });
        
        div.setOnMouseClicked(e -> {
            op = '/';
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        });
        
        //Calculate
         bCalc.setOnMouseClicked(e -> {
         num2 = Double.parseDouble(tf.getText());
         tf.setText(calculate(num1, num2, op)+ "");
        });
        
        bClear.setOnMouseClicked(e -> {
            tf.setText(" ");
        });
        
        // Set the scene and stage
        Scene scene = new Scene(pane);
        primaryStage.setMaxWidth(500);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //Calculate method
    public double calculate(double n1, double n2, char op){
        switch(op)
        {
            case '+': return n1 + n2;
            case '-': return n1 - n2;
            case '*': return n1 * n2;
            default: return n1 / n2;
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
