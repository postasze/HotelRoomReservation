package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import model.Constants;
import model.Pokoj;
import model.Model;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class KontrolerOknaDodawaniaPokojow implements Initializable, Constants {

	@FXML
    private ComboBox<String> roomTypeComboBox;
	@FXML
    private ComboBox<String> roomCapacityComboBox;
	@FXML
    private ComboBox<String> roomStandardComboBox;
	@FXML
    private ComboBox<String> roomStatusComboBox;
	
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
	private void addRoom(Event event) {
		
		Pokoj pokoj = new Pokoj();
		int index;
		
		pokoj.setIdentyfikatorPokoju(Model.getInstance().roomArrayList.size() + 1);
		
		for(index = 0; index < TypyPokojow.length; index++)
		{
			if(TypyPokojow[index].equals(roomTypeComboBox.getValue()))
				break;
		}
		pokoj.setTypPokoju((TypPokoju.values())[index]);

		for(index = 0; index < LiczbyMiejsc.length; index++)
		{
			if(LiczbyMiejsc[index].equals(roomCapacityComboBox.getValue()))
				break;
		}
		pokoj.setLiczbaMiejsc((LiczbaMiejsc.values())[index]);
		
		for(index = 0; index < StandardyPokojow.length; index++)
		{
			if(StandardyPokojow[index].equals(roomStandardComboBox.getValue()))
				break;
		}
		pokoj.setStandardPokoju((StandardPokoju.values())[index]);
		
		for(index = 0; index < StatusyPokojow.length; index++)
		{
			if(StatusyPokojow[index].equals(roomStatusComboBox.getValue()))
				break;
		}
		pokoj.setStatusPokoju((StatusPokoju.values())[index]);
		
		Model.getInstance().roomArrayList.add(pokoj);
		
		goBack(event);
	}
}
