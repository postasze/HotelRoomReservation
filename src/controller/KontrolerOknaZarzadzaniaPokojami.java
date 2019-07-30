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

public class KontrolerOknaZarzadzaniaPokojami implements Initializable {

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	@FXML
	public void Click(ActionEvent event) throws IOException {
		
		if(((Button)event.getSource()).getId().equals("1")) {
			ManadzerWidokow.getInstance().displayRoomListView();
		}
		else if(((Button)event.getSource()).getId().equals("2")) {
			ManadzerWidokow.getInstance().displayRoomAdditionView();
		}
		else if(((Button)event.getSource()).getId().equals("3")) {
			ManadzerWidokow.getInstance().displayRoomEditionView();
	    }
		else if(((Button)event.getSource()).getId().equals("4")) {
			ManadzerWidokow.getInstance().displayRoomRemovalView();
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
