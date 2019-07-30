package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import model.Constants.TypPracownika;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class KontrolerOknaLogowania implements Initializable {

	@FXML
    private Label employeeLabel;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	@FXML
	private void login(Event event) {
		try {
			if(employeeLabel.getText().equals(TypPracownika.Recepcjonista.toString())) {
				ManadzerWidokow.getInstance().displayReceptionistView();
			}
			else if(employeeLabel.getText().equals(TypPracownika.Administrator.toString())) {
				ManadzerWidokow.getInstance().displayAdministratorView();
			}
			else if(employeeLabel.getText().equals(TypPracownika.Ksiegowy.toString())) {
				ManadzerWidokow.getInstance().displayAccountantView();
			}
		} catch (IOException e) {
		}
	}
	
	@FXML
	private void goBack(Event event) {
		try {
			ManadzerWidokow.getInstance().displayPreviousView();
		} catch (IOException e) {
		}
	}
}
