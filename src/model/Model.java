package model;

import java.util.ArrayList;

public class Model {

	private static Model instance;
	
	public ArrayList<Gosc> guestArrayList;
	public ArrayList<Platnosc> paymentArrayList;
	public ArrayList<Pobyt> stayArrayList;
	public ArrayList<Pokoj> roomArrayList;
	public ArrayList<Pracownik> employeeArrayList;
	public ArrayList<Rezerwacja> reservationArrayList;
	
	public Model() {
		guestArrayList = new ArrayList<Gosc>(); 
		paymentArrayList = new ArrayList<Platnosc>(); 
		stayArrayList = new ArrayList<Pobyt>(); 
		roomArrayList = new ArrayList<Pokoj>(); 
		employeeArrayList = new ArrayList<Pracownik>(); 
		reservationArrayList = new ArrayList<Rezerwacja>(); 
	}
	
	public static Model getInstance() {
        if(instance == null)
                instance = new Model();
        return instance;
	}
}
