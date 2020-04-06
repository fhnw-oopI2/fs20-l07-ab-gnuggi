package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ApplicationUI extends FlowPane {
	
	private Button addLabel;
	private Label label;
	private int labelNr = 1;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	
	
	private void initializeControls() {
		
		addLabel = new Button("Add Label");
		label = new Label();
		addLabel.setOnAction(event -> {
			label = new Label("Label " + labelNr);
			setMargin(label, new Insets(10));
			this.getChildren().add(label);
			labelNr++;
		});
	}
	
	private void layoutControls() {
		this.getChildren().add(addLabel);
		setMargin(addLabel, new Insets(10));
	}
}
