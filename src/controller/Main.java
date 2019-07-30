package controller;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	  @Override
	  public void start(Stage stage) {
		
	    try {
	    	ManadzerWidokow.getInstance().setStage(stage);
            ManadzerWidokow.getInstance().displayMainView();
	    } catch(Exception e) {
	      e.printStackTrace();
	    }   
	  }
	  
	  public static void main(String[] args) {
	    launch(args);
	  }
	}



