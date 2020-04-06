package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	
	private TextField num;
	private Slider slider;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	
	
	private void initializeControls() {
		slider = new Slider(1, 10, 5);
		num = new TextField();
		num.textProperty().bindBidirectional(slider.valueProperty(), new javafx.util.converter.NumberStringConverter());
	}
	
	private void layoutControls() {
		setAlignment(Pos.CENTER);
		
		this.getChildren().add(num);
		this.getChildren().add(slider);
		
		slider.setMajorTickUnit(1);
		slider.setMinorTickCount(1);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setSnapToTicks(true);
		
		setMargin(slider, new Insets(20));
		setMargin(num, new Insets(20));
	}
	
}
