package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import model.Model;

import model.Constants;
import model.Constants.TypGoscia;
import model.Gosc;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class KontrolerOknaDodawaniaGosci implements Initializable, Constants {

	@FXML
    private TextField guestFirstNameTextField;
	@FXML
    private TextField guestLastNameTextField;
	@FXML
    private TextField guestEmailTextField;
	@FXML
    private TextField guestTelephoneNumberTextField;
	@FXML
    private ComboBox<String> guestTypeComboBox;
	
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
	
	@FXML
	private void addGuest(Event event) {
		
		Gosc gosc = new Gosc();
		
		gosc.setIdentyfikatorGoscia(Model.getInstance().guestArrayList.size() + 1);
		gosc.setImie(guestFirstNameTextField.getText());
		gosc.setNazwisko(guestLastNameTextField.getText());
		gosc.setEmail(guestEmailTextField.getText());
		gosc.setNumerTelefonu(Integer.valueOf(guestTelephoneNumberTextField.getText()));
		
		Model.getInstance().guestArrayList.add(gosc);
		
		goBack(event);
	}
}
