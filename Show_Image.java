package Week_12_GUI_Design;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Show_Image extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage){
        // Create a pane to hold the image views
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        //Image image = new Image("image/wa.jfif");
        
        //it is for copy images from web sits
        Image image = new Image("https://images.unsplash.com/photo-1620307262982-6a53092802f3?ixid=MnwxMjA3fDB8MHx0b3BpYy1mZWVkfDc2fDZzTVZqVExTa2VRfHxlbnwwfHx8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        pane.getChildren().add(new ImageView(image));
        
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);
        
        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show Image"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line. 
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
