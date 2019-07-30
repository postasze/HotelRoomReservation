package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import model.Constants;
import model.Model;
import model.Platnosc;
import model.Pobyt;
import model.Pokoj;
import model.Constants.LiczbaMiejsc;
import model.Constants.StandardPokoju;
import model.Constants.StatusPokoju;
import model.Constants.TypPokoju;
import model.Rezerwacja;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class KontrolerOknaDodawaniaRezerwacji implements Initializable, Constants {

	@FXML
    private DatePicker startDate;
	
	@FXML
    private DatePicker endDate;
	
	@FXML
    private ComboBox<String> reservationType;
	
	@FXML
    private ComboBox<String> paymentType;
	
	@FXML
    private ComboBox<String> roomComboBox;
	
	@FXML
    private ComboBox<String> guestComboBox;
	
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
	private void addReservation(Event event) {
		
		Rezerwacja rezerwacja = new Rezerwacja();
		Pobyt pobyt = new Pobyt();
		Platnosc platnosc = new Platnosc();
		int index;
		
		rezerwacja.setIdentyfikatorRezerwacji(Model.getInstance().reservationArrayList.size() + 1);
		pobyt.setIdentyfikatorPobytu(Model.getInstance().stayArrayList.size() + 1);
		platnosc.setIdentyfikatorPlatnosci(Model.getInstance().paymentArrayList.size() + 1);
		
		pobyt.setDataPoczatkuPobytu(startDate.getValue());
		pobyt.setDataKoncaPobytu(endDate.getValue());
		
		for(index = 0; index < TypyRezerwacji.length; index++)
		{
			if(TypyRezerwacji[index].equals(reservationType.getValue()))
				break;
		}
		rezerwacja.setTypRezerwacji((TypRezerwacji.values())[index]);

		for(index = 0; index < TypyPlatnosci.length; index++)
		{
			if(TypyPlatnosci[index].equals(paymentType.getValue()))
				break;
		}
		platnosc.setTypPlatnosci((TypPlatnosci.values())[index]);
		
		int guestId = Integer.valueOf(guestComboBox.getValue().substring(4, 5));
		int roomId = Integer.valueOf(roomComboBox.getValue().substring(4, 5));
		
		rezerwacja.setGoscRezerwujacy(Model.getInstance().guestArrayList.get(guestId-1));
		rezerwacja.setZarezerwowanyPokoj(Model.getInstance().roomArrayList.get(roomId-1));
		
		rezerwacja.setPlatnoscZaRezerwacje(platnosc);
		rezerwacja.setZarezerwowanyPobyt(pobyt);
		
		platnosc.setGoscWykonujacyPlatnosc(Model.getInstance().guestArrayList.get(guestId-1));

		pobyt.setGoscPrzebywajacy(Model.getInstance().guestArrayList.get(guestId-1));
		pobyt.setPobytWPokoju(Model.getInstance().roomArrayList.get(roomId-1));
		
		Model.getInstance().reservationArrayList.add(rezerwacja);
		Model.getInstance().stayArrayList.add(pobyt);
		Model.getInstance().paymentArrayList.add(platnosc);
		
		goBack(event);
	}
}
