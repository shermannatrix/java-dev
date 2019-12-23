package sample;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.beans.binding.When;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	@Override
	public void start ( Stage primaryStage ) throws Exception {
		//Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		
		// Create an Ellipse and set fill color
		Ellipse ellipse = new Ellipse ( 110, 70 );
		//ellipse.setFill(Color.LIGHTBLUE);
		//ellipse.setFill(Color.web("#ADD8E6"));      // Light blue, fully opaque
		//ellipse.setFill(Color.web("#ADD8E680"));
		//ellipse.setFill(Color.web("0xADD8E6"));     // Using Hexadecimal values
		//ellipse.setFill ( Color.web ( "0xADD8E680" ) );
		//ellipse.setFill(Color.rgb(173, 216, 230));              // Using RGB values
		//ellipse.setFill(Color.rgb(173, 216, 230, 0.5));      // Using RGBA values
		
		Stop[] stops = new Stop[] {
				new Stop(0, Color.DODGERBLUE),
				new Stop(0.5, Color.LIGHTBLUE),
				new Stop(1.0, Color.LIGHTGREEN)
		};
		
		LinearGradient gradient = new LinearGradient ( 0, 0, 0, 1, true,
				CycleMethod.NO_CYCLE, stops );
		
		ellipse.setFill ( gradient );
		
		ellipse.setEffect(new DropShadow (30, 10, 10, Color.GRAY));
		
		// Create a Text shape with font and size.
		Text text = new Text ( "My Shapes" );
		text.setFont ( new Font ( "Arial Bold", 24 ) );
		
		VBox verticalBox = new VBox();
		StackPane stackPane = new StackPane ();
		
		Reflection r = new Reflection ();
		r.setFraction(.8);
		r.setTopOffset ( 1.0 );
		text.setEffect(r);
		
		// Define RotateTransition
		RotateTransition rotate = new RotateTransition ( Duration.millis(2500), stackPane );
		rotate.setToAngle ( 360 );
		rotate.setFromAngle ( 0 );
		rotate.setInterpolator ( Interpolator.LINEAR );
		
		stackPane.setOnMouseClicked ( mouseEvent ->  {
			System.out.println(rotate.getStatus ().name ());
			
			if (rotate.getStatus ().equals( Animation.Status.RUNNING)) {
				rotate.pause();
			} else {
				rotate.play();
			}
		} );
		
		Text text2 = new Text ( );
		text2.setFont ( new Font ( "Arial Bold", 24 ) );
		text2.setTextAlignment ( TextAlignment.CENTER );
		
		rotate.statusProperty ().addListener ( observable ->  {
			text2.setText("Animation status: " +
					rotate.getStatus ());
		});
		text2.textProperty ().bind(stackPane.rotateProperty ().asString("%.1f"));
		text2.strokeProperty ().bind(new When (rotate.statusProperty ()
				.isEqualTo ( Animation.Status.RUNNING ))
				.then(Color.GREEN)
				.otherwise(Color.RED));
		
		Group group = new Group ( ellipse, text );
		ellipse.setCenterX ( 320 );
		ellipse.setCenterY ( 320 );
		text.setX ( 320 - ( text.getLayoutBounds ().getWidth () / 2 ) );
		text.setY ( 320 + ( text.getLayoutBounds ().getHeight () / 2 ) );
		
		stackPane.getChildren ().addAll ( ellipse, text );
		
		verticalBox.getChildren ().addAll ( stackPane, text2 );
		
		/*rotate.statusProperty ().addListener ( new InvalidationListener () {
			@Override
			public void invalidated ( Observable observable ) {
				text2.setText("Animation status: " +
						(( ObservableObjectValue<Animation.Status> ) observable).getValue ());
			}
		} );*/
		
		
		primaryStage.setTitle ( "MyShapes with JavaFX" );
		primaryStage.setScene ( new Scene ( verticalBox, 640, 640, Color.LIGHTYELLOW ) );
		primaryStage.show ();
		
		/*text.setOnMouseClicked ( mouseEvent ->  {
			System.out.println(mouseEvent.getSource().getClass () + " clicked.");
		} );*/
	}
	
	
	public static void main ( String[] args ) {
		launch ( args );
	}
}
