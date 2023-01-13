package Week_12_GUI_Functionality;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.*;

public class My_First_GUI_Inner extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));

        pane.setHgap(15); //knopkalarni orasida joy qolib ajiratish eniga
        pane.setVgap(15); //knopkalarni orasida joy qolib ajiratish bo'yiga

        //Create nodes
        // Text Field
        TextField tf = new TextField();
        tf.setPrefWidth(150);// Uzunligi text yozadigani
        // tf.setEditable(false);

        //Button
        Button b = new Button("BUTTON");

        //Start new class
        class ExampleButtonHandlerClass implements EventHandler<ActionEvent> {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("OK button clicked.");
            }
        }

        // Finally, add the handler to the button itself
        b.setOnAction(new ExampleButtonHandlerClass());

        // Text
        Text t = new Text("Example Check Box:");

        // Checkbox
        CheckBox cb = new CheckBox();
        CheckBoxHandler cbh = new CheckBoxHandler();
        cb.setOnAction(cbh);

        //Load nodes into the pane
        pane.add(tf, 0, 0); // Text yozishga karobka
        pane.add(b, 1, 0); // Knopka 
        pane.add(t, 0, 1); // Textni qo'shish
        pane.add(cb, 1, 1);//Check knopkani yaratish

        // Creat a scene and palce it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setWidth(300);
        primaryStage.setHeight(150);
        primaryStage.setTitle("My First GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
// End class

// Checkbox
class CheckBoxHandler implements EventHandler<ActionEvent> {

    static int count = 2;

    @Override
    public void handle(ActionEvent event) {
        if (count % 2 == 0) {
            System.out.println("Box has been checked!");
        } else {
            System.out.println("Check Box has been unchecked . . ");
        }
        count++;
    }

}
