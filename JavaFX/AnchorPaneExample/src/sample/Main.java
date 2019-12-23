package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        
        AnchorPane anchorPane = new AnchorPane ( );
        Label label = new Label ("My Label");
        
        anchorPane.getChildren ().add(label);
        AnchorPane.setLeftAnchor ( label, 10.0 );
        AnchorPane.setBottomAnchor ( label, 10.0 );
        
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(anchorPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
