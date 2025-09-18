package main;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationKipas extends Application{
	//kipas 1
	FanePane kipas1 = new FanePane();
	Timeline animation1;
	HBox buttonkipas1 = new HBox(5);
	Button pause1 = new Button("Pause");
	Button Resume1 = new Button("Resume");
	Button reverse1 = new Button("Reverse");
	VBox box1 = new VBox();
	Slider slider1 = new Slider();
	
	
	//kipas 2
	FanePane kipas2 = new FanePane();
	Timeline animation2;
	HBox buttonkipas2 = new HBox(5);
	Button pause2 = new Button("Pause");
	Button Resume2 = new Button("Resume");
	Button reverse2 = new Button("Reverse");
	VBox box2 = new VBox();
	Slider slider2 = new Slider();
	
	//kipas 3
	FanePane kipas3 = new FanePane();
	Timeline animation3;
	HBox buttonkipas3 = new HBox(5);
	Button pause3 = new Button("Pause");
	Button Resume3 = new Button("Resume");
	Button reverse3 = new Button("Reverse");
	VBox box3 = new VBox();
	Slider slider3 = new Slider();
	
	//button all
	HBox btnAll = new HBox(5);
	Button btStartAll = new Button("Start All");
	Button btStopAll = new Button("Stop All");
	
	BorderPane bp = new BorderPane();
	GridPane gp = new GridPane();
	
	Scene scene = new Scene(bp,580,280);
	
	
	public void kipas1() {
		buttonkipas1.setAlignment(Pos.CENTER);
		buttonkipas1.getChildren().addAll(pause1,Resume1,reverse1);
		
		 slider1.setMin(10); 
		 slider1.setMax(200); 
		 slider1.setValue(100); 
		    
		box1.getChildren().addAll(buttonkipas1,kipas1,slider1);
		box1.setStyle("-fx-border-color: black; -fx-border-width: 0.5;");
		box1.setAlignment(Pos.CENTER);
		
		animation1 = new Timeline(
				new KeyFrame(Duration.millis(100), e-> kipas1.move()));
		animation1.setCycleCount(Timeline.INDEFINITE);
		animation1.play();
		
		pause1.setOnAction(e-> animation1.pause());
		Resume1.setOnAction(e_-> animation1.play());
		reverse1.setOnAction(e-> kipas1.reverse());
		
		slider1.valueProperty().addListener((obs, oldVal, newVal) -> {
	        double durasi = slider1.getMax() - newVal.doubleValue() + slider1.getMin();
	        animation1.stop();
	        animation1.getKeyFrames().clear();
	        animation1.getKeyFrames().add(
	            new KeyFrame(Duration.millis(durasi), e -> kipas1.move()));
	        animation1.play();
	    });
		
		
	}
	
	public void kipas2() {
		buttonkipas2.setAlignment(Pos.CENTER);
		buttonkipas2.getChildren().addAll(pause2,Resume2,reverse2);
		
		 slider2.setMin(10); 
		 slider2.setMax(200); 
		 slider2.setValue(100); 
		
		box2.getChildren().addAll(buttonkipas2,kipas2,slider2);
		box2.setStyle("-fx-border-color: black; -fx-border-width: 0.5;");
		box2.setAlignment(Pos.CENTER);
		
		animation2 = new Timeline(
				new KeyFrame(Duration.millis(100), e-> kipas2.move()));
		animation2.setCycleCount(Timeline.INDEFINITE);
		animation2.play();
		
		pause2.setOnAction(e-> animation2.pause());
		Resume2.setOnAction(e_-> animation2.play());
		reverse2.setOnAction(e-> kipas2.reverse());
		
		slider2.valueProperty().addListener((obs, oldVal, newVal) -> {
	        double durasi = slider2.getMax() - newVal.doubleValue() + slider2.getMin();
	        animation2.stop();
	        animation2.getKeyFrames().clear();
	        animation2.getKeyFrames().add(
	            new KeyFrame(Duration.millis(durasi), e -> kipas2.move()));
	        animation2.play();
	    });
		
		
	}
	
	public void kipas3() {
		buttonkipas3.setAlignment(Pos.CENTER);
		buttonkipas3.getChildren().addAll(pause3,Resume3,reverse3);
		
		 slider3.setMin(10); 
		 slider3.setMax(200); 
		 slider3.setValue(100); 
		
		box3.getChildren().addAll(buttonkipas3,kipas3,slider3);
		box3.setStyle("-fx-border-color: black; -fx-border-width: 0.5;");
		box3.setAlignment(Pos.CENTER);
		
		animation3 = new Timeline(
				new KeyFrame(Duration.millis(100), e-> kipas3.move()));
		animation3.setCycleCount(Timeline.INDEFINITE);
		animation3.play();
		
		pause3.setOnAction(e-> animation3.pause());
		Resume3.setOnAction(e_-> animation3.play());
		reverse3.setOnAction(e-> kipas3.reverse());
		
		slider3.valueProperty().addListener((obs, oldVal, newVal) -> {
	        double durasi = slider3.getMax() - newVal.doubleValue() + slider3.getMin();
	        animation3.stop();
	        animation3.getKeyFrames().clear();
	        animation3.getKeyFrames().add(
	            new KeyFrame(Duration.millis(durasi), e -> kipas3.move()));
	        animation3.play();
	    });
		
		
	}
	
	public void addComponent() {
		btnAll.setAlignment(Pos.CENTER);
		btnAll.getChildren().addAll(btStartAll,btStopAll);
		
		gp.add(box1, 0, 0);
		gp.add(box2, 1, 0);
		gp.add(box3, 2, 0);
		
		bp.setCenter(gp);
		bp.setBottom(btnAll);
		
		btStopAll.setOnAction(e-> {animation1.pause();animation2.pause();animation3.pause();});
		btStartAll.setOnAction(e-> {animation1.play();animation2.play();animation3.play();});
		
		
				
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		addComponent();
		kipas1();
		kipas2();
		kipas3();
		primaryStage.setTitle("Fan Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}

	class FanePane extends Pane{
	private double w =200;
	private double h = 200;
	private double radius = Math.min(w, h)*0.45;
	
	private Arc arc[] = new Arc[4];
	private double startAngle = 30;
	private Circle circle = new Circle(w/2, h/2, radius);
	
	public FanePane() {
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		getChildren().add(circle);
		
		for (int i = 0; i < 4; i++) {
			arc[i] = new Arc(w/2, h/2, radius * 0.9, radius *0.9, startAngle+i*90, 35);
			arc[i].setFill(Color.BLANCHEDALMOND);
			arc[i].setType(ArcType.ROUND);
			getChildren().addAll(arc[i]);
		}
	}
	public void setValues() {
		// TODO Auto-generated method stub
		radius = Math.min(w, h) *0.45;
		circle.setRadius(radius);
		circle.setCenterX(w/2);
		circle.setCenterY(h/2);
		
		for (int i = 0; i < 4; i++) {
			arc[i].setRadiusX(radius*0.9);
			arc[i].setRadiusY(radius*0.9);
			arc[i].setCenterX(w/2);
			arc[i].setCenterY(h/2);
			arc[i].setStartAngle(startAngle + i*90);
		}
	}
	
	private double increment= 5;
	
	public void move() {
		setStartAngle(startAngle +increment);
		
	}
	
	public void setStartAngle(double angle) {
		this.startAngle = angle;
		setValues();
	}
	
	public void reverse() {
		increment = -increment;
	}
	
	public void SetW (double w) {
		this.w = w;
		setValues();
	}
	
	public void SetH (double h) {
		this.h = h;
		setValues();
	}

	
	
	
	
	
}
