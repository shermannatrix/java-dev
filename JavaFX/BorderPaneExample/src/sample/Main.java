package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    
        BorderPane borderPane = new BorderPane();
        Label colorLabel = new Label ("Color: Lightblue");
        colorLabel.setFont(new Font ("Verdana", 18));
        borderPane.setTop(colorLabel);
    
        Rectangle rectangle = new Rectangle ( 100, 50, Color.LIGHTBLUE);
        borderPane.setCenter (rectangle);
        BorderPane.setAlignment ( colorLabel, Pos.CENTER );
        BorderPane.setMargin(colorLabel, new Insets(20, 10, 5, 10) );
        
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(borderPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
