package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	
	private Label num;
	private Slider slider;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	
	
	private void initializeControls() {
		slider = new Slider(1, 10, 5);
		slider.valueProperty().addListener((observe, oldValue, newValue) -> num.setText(String.valueOf(slider.getValue())));
		num = new Label(String.valueOf(slider.getValue()));
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
	}
	
}
