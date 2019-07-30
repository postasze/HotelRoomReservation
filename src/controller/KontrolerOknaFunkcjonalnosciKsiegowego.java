package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class KontrolerOknaFunkcjonalnosciKsiegowego implements Initializable {

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	@FXML
	private void goBack(Event event) {
		try {
			ManadzerWidokow.getInstance().displayPreviousView();
		} catch (IOException e) {
		}
	}
}
