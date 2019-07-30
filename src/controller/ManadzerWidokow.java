package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

import model.Constants;
import model.Model;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ManadzerWidokow implements Constants {

	private static ManadzerWidokow instance;
	private Stage stage;
	private Stack<Scene> scenes;
	private Stack<String> titles;
	private Stack<Integer> widths;
	private Stack<Integer> heights;
	
	private Parent root;
	private Scene scene;
	private Node node;

	public ManadzerWidokow() {
		scenes = new Stack<Scene>();
		titles = new Stack<String>();
		widths = new Stack<Integer>();
		heights = new Stack<Integer>();
	}

	public static ManadzerWidokow getInstance() {
		if (instance == null)
			instance = new ManadzerWidokow();
		return instance;
	}

	public void setStage(Stage stage) {
		// begin-user-code
		this.stage = stage;
		// end-user-code
	}

	public void displayPreviousView() throws IOException {
		
		scenes.pop();
		stage.setScene(scenes.peek());
		
		titles.pop();
		stage.setTitle(titles.peek());
		
		widths.pop();
		stage.setMinWidth(widths.peek());
		stage.setMaxWidth(widths.peek());
		
		heights.pop();
		stage.setMinHeight(heights.peek());
		stage.setMaxHeight(heights.peek());
		
		stage.show();
	}

	public void displayMainView() throws IOException {

		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoAplikacji.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Hotel");
		stage.setMinHeight(300);
		stage.setMaxHeight(300);
		stage.setMinWidth(500);
		stage.setMaxWidth(500);
		stage.show();

		scenes.clear();
		titles.clear();
		widths.clear();
		heights.clear();
		scenes.push(scene);		
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
	}
	
	public void displayLoginView(TypPracownika typPracownika) throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoLogowania.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Logowanie");
		stage.setMinHeight(300);
		stage.setMaxHeight(300);
		stage.setMinWidth(500);
		stage.setMaxWidth(500);
		stage.show();

		scenes.push(scene);
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
		
		ObservableList<Node> itemList = root.getChildrenUnmodifiable();
		Iterator<Node> iterator = itemList.iterator();

		while (iterator.hasNext()) {
			node = iterator.next();

			if (node.getId() != null) {
				if (node.getId().equals("1")) {
					((Label)node).setText(typPracownika.toString());
				} 
			}
		}
	}
	
	public void displayReceptionistView() throws IOException {

		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoFunkcjonalnosciRecepcjonisty.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno funkcjonalnosci recepcjonisty");
		stage.setMinHeight(350);
		stage.setMaxHeight(350);
		stage.setMinWidth(500);
		stage.setMaxWidth(500);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
	}
	
	
	public void displayAdministratorView() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoFunkcjonalnosciAdministratora.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno funkcjonalnosci administratora");
		stage.setMinHeight(300);
		stage.setMaxHeight(300);
		stage.setMinWidth(500);
		stage.setMaxWidth(500);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
	}
	
	public void displayAccountantView() {
		// TODO Auto-generated method stub
		
	}

	public void displayReservationManagement() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoZarzadzaniaRezerwacjami.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno zarzadzania rezerwacjami");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(600);
		stage.setMaxWidth(600);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
	}
	
	public void displayRoomManagement() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoZarzadzaniaPokojami.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno zarzadzania pokojami");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(600);
		stage.setMaxWidth(600);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());	
	}

	public void displayPaymentManagement() {
		// TODO Auto-generated method stub
		
	}

	public void displayGuestManagement() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoZarzadzaniaGoscmi.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno zarzadzania goscmi");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(600);
		stage.setMaxWidth(600);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
	}
	
	public void displayReservationAdditionView() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoDodawaniaRezerwacji.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno dodawania rezerwacji");
		stage.setMinHeight(450);
		stage.setMaxHeight(450);
		stage.setMinWidth(900);
		stage.setMaxWidth(900);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
		
		ObservableList<Node> itemList = root.getChildrenUnmodifiable();
		Iterator<Node> iterator = itemList.iterator();

		while (iterator.hasNext()) {
			node = iterator.next();

			if (node.getId() != null) {
				if (node.getId().equals("1")) {
					((ComboBox<String>)node).getItems().addAll(TypyRezerwacji);
					((ComboBox<String>)node).setValue("Rezerwacja Last Minute");
				}
				else if (node.getId().equals("2")) {
					((ComboBox<String>)node).getItems().addAll(TypyPlatnosci);
					((ComboBox<String>)node).setValue("Platnosc gotowka");
				}
				else if (node.getId().equals("3")) {
					for(int i = 0; i < Model.getInstance().guestArrayList.size(); i++) {
						((ComboBox<String>)node).getItems().add(Model.getInstance().guestArrayList.get(i).toString());
					}
					if(!Model.getInstance().guestArrayList.isEmpty())
						((ComboBox<String>)node).setValue(Model.getInstance().guestArrayList.get(0).toString());
				}
				else if (node.getId().equals("4")) {
					for(int i = 0; i < Model.getInstance().roomArrayList.size(); i++) {
						((ComboBox<String>)node).getItems().add(Model.getInstance().roomArrayList.get(i).toString());
					}
					if(!Model.getInstance().roomArrayList.isEmpty())
						((ComboBox<String>)node).setValue(Model.getInstance().roomArrayList.get(0).toString());
				}
			}
		}
	}

	public void displayReservationRemovalView() {
		// TODO Auto-generated method stub
		
	}

	public void displayReservationListView() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoWyswietlaniaListyRezerwacji.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno wyswietlania listy rezerwacji");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(750);
		stage.setMaxWidth(750);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
		
		ObservableList<Node> itemList = root.getChildrenUnmodifiable();
		Iterator<Node> iterator = itemList.iterator();

		while (iterator.hasNext()) {
			node = iterator.next();

			if (node.getId() != null) {
				if (node.getId().equals("1")) {
					for(int i = 0; i < Model.getInstance().reservationArrayList.size(); i++)
						((ComboBox<String>)node).getItems().add(Model.getInstance().reservationArrayList.get(i).toString());
					if(!Model.getInstance().reservationArrayList.isEmpty())
						((ComboBox<String>)node).setValue(Model.getInstance().reservationArrayList.get(0).toString());
				}
			}
		}			
	}

	public void displayReservationEditionView() {
		// TODO Auto-generated method stub
		
	}

	public void displayGuestListView() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoWyswietlaniaListyGosci.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno wyswietlania listy gosci");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(750);
		stage.setMaxWidth(750);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
		
		ObservableList<Node> itemList = root.getChildrenUnmodifiable();
		Iterator<Node> iterator = itemList.iterator();

		while (iterator.hasNext()) {
			node = iterator.next();

			if (node.getId() != null) {
				if (node.getId().equals("1")) {
					for(int i = 0; i < Model.getInstance().guestArrayList.size(); i++)
						((ComboBox<String>)node).getItems().add(Model.getInstance().guestArrayList.get(i).toString());
					if(!Model.getInstance().guestArrayList.isEmpty())
						((ComboBox<String>)node).setValue(Model.getInstance().guestArrayList.get(0).toString());
				}
			}
		}
	}

	public void displayGuestAdditionView() throws IOException {

		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoDodawaniaGosci.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno dodawania gosci");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(900);
		stage.setMaxWidth(900);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
		
		ObservableList<Node> itemList = root.getChildrenUnmodifiable();
		Iterator<Node> iterator = itemList.iterator();

		while (iterator.hasNext()) {
			node = iterator.next();

			if (node.getId() != null) {
				if (node.getId().equals("1")) {
					((ComboBox<String>)node).getItems().addAll(TypyGosci);
					((ComboBox<String>)node).setValue("Osoba pelnoletnia");
				}
			}
		}
	}

	public void displayGuestEditionView() {
		// TODO Auto-generated method stub
		
	}

	public void displayGuestRemovalView() {
		// TODO Auto-generated method stub
		
	}

	public void displayRoomListView() throws IOException {
		
		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoWyswietlaniaListyPokojow.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno wyswietlania listy pokojow");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(750);
		stage.setMaxWidth(750);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
		
		ObservableList<Node> itemList = root.getChildrenUnmodifiable();
		Iterator<Node> iterator = itemList.iterator();

		while (iterator.hasNext()) {
			node = iterator.next();

			if (node.getId() != null) {
				if (node.getId().equals("1")) {
					for(int i = 0; i < Model.getInstance().roomArrayList.size(); i++)
						((ComboBox<String>)node).getItems().add(Model.getInstance().roomArrayList.get(i).toString());
					if(!Model.getInstance().roomArrayList.isEmpty())
						((ComboBox<String>)node).setValue(Model.getInstance().roomArrayList.get(0).toString());
				}
			}
		}		
	}

	public void displayRoomAdditionView() throws IOException {

		root = FXMLLoader.load(getClass().getClassLoader().getResource("view/OknoDodawaniaPokojow.fxml"));
		scene = new Scene(root, 500, 300);
		scene.getStylesheets().add(getClass().getClassLoader().getResource("view/Style.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Okno dodawania pokojow");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(900);
		stage.setMaxWidth(900);
		stage.show();
		
		scenes.push(scene);	
		titles.push(stage.getTitle());
		widths.push((int) stage.getMaxWidth());
		heights.push((int) stage.getMaxHeight());
		
		ObservableList<Node> itemList = root.getChildrenUnmodifiable();
		Iterator<Node> iterator = itemList.iterator();

		while (iterator.hasNext()) {
			node = iterator.next();

			if (node.getId() != null) {
				if (node.getId().equals("1")) {
					((ComboBox<String>)node).getItems().addAll(TypyPokojow);
					((ComboBox<String>)node).setValue("Z balkonem");
				}
				else if (node.getId().equals("2")) {
					((ComboBox<String>)node).getItems().addAll(LiczbyMiejsc);
					((ComboBox<String>)node).setValue("Jednoosobowy");
				}
				else if (node.getId().equals("3")) {
					((ComboBox<String>)node).getItems().addAll(StandardyPokojow);
					((ComboBox<String>)node).setValue("Wysoki standard");
				}
				else if (node.getId().equals("4")) {
					((ComboBox<String>)node).getItems().addAll(StatusyPokojow);
					((ComboBox<String>)node).setValue("Wolny");
				}
			}
		}
	}

	public void displayRoomEditionView() {
		// TODO Auto-generated method stub
		
	}

	public void displayRoomRemovalView() {
		// TODO Auto-generated method stub
		
	}
}
