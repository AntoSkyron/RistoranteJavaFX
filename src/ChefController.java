
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class ChefController {

	@FXML
    private Text ordine_uno;

    @FXML
    private Text ordine_due;

    @FXML
    private Text ordine_tre;

    @FXML
    private Text ordine_quattro;

    @FXML
    private Text ordine_cinque;

	public void initialize(URL url,ResourceBundle rb){

	}




	public void Testo(String primo,String secondo, String terzo,String quarto,String quinto)
	{
		ordine_uno.setText(primo);
		ordine_due.setText(secondo);
		ordine_tre.setText(terzo);
		ordine_quattro.setText(quarto);
		ordine_cinque.setText(quinto);
	}




	  public void Open_Antipasti(){

		  	String elenco_antipasti="";

	    	FXMLLoader Loader = new FXMLLoader();
	    	Loader.setLocation(getClass().getResource("LineaChef.fxml"));

	    	try{
	    		Loader.load();
	    	} catch (IOException ex){
	    		Logger.getLogger(LineaChefController.class.getName()).log(Level.SEVERE,null,ex);
	    	}

	    	LineaChefController display = Loader.getController();

			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(
						"antipasti.txt"));
				String line = reader.readLine();
				while (line != null) {
					System.out.println(line);
					elenco_antipasti = elenco_antipasti + line;
					// read next line
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	    	display.SettaggioTesti("Chef Antonio","Linea Antipasti",elenco_antipasti);

	    	Parent p = Loader.getRoot();
	    	Stage stage = new Stage();
	    	stage.setScene(new Scene(p));
	    	stage.setResizable(false);
	    	stage.showAndWait();
	    }


	    public void Open_Primi(){

		  	String elenco_primi="";

	    	FXMLLoader Loader = new FXMLLoader();
	    	Loader.setLocation(getClass().getResource("LineaChef.fxml"));

	    	try{
	    		Loader.load();
	    	} catch (IOException ex){
	    		Logger.getLogger(LineaChefController.class.getName()).log(Level.SEVERE,null,ex);
	    	}

	    	LineaChefController display = Loader.getController();

			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(
						"primi.txt"));
				String line = reader.readLine();
				while (line != null) {
					System.out.println(line);
					elenco_primi = elenco_primi + line;
					// read next line
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	    	display.SettaggioTesti("Chef De Lucia","Linea Primi",elenco_primi);

	    	Parent p = Loader.getRoot();
	    	Stage stage = new Stage();
	    	stage.setScene(new Scene(p));
	    	stage.setResizable(false);
	    	stage.showAndWait();
	    }


	    public void Open_Secondi(){

		  	String elenco_secondi="";

	    	FXMLLoader Loader = new FXMLLoader();
	    	Loader.setLocation(getClass().getResource("LineaChef.fxml"));

	    	try{
	    		Loader.load();
	    	} catch (IOException ex){
	    		Logger.getLogger(LineaChefController.class.getName()).log(Level.SEVERE,null,ex);
	    	}

	    	LineaChefController display = Loader.getController();

			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(
						"secondi.txt"));
				String line = reader.readLine();
				while (line != null) {
					System.out.println(line);
					elenco_secondi = elenco_secondi + line;
					// read next line
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	    	display.SettaggioTesti("Chef Lukaku","Linea Secondi",elenco_secondi);

	    	Parent p = Loader.getRoot();
	    	Stage stage = new Stage();
	    	stage.setScene(new Scene(p));
	    	stage.setResizable(false);
	    	stage.showAndWait();

	    }


	    public void Open_Dessert(){

		  	String elenco_dessert="";

	    	FXMLLoader Loader = new FXMLLoader();
	    	Loader.setLocation(getClass().getResource("LineaChef.fxml"));

	    	try{
	    		Loader.load();
	    	} catch (IOException ex){
	    		Logger.getLogger(LineaChefController.class.getName()).log(Level.SEVERE,null,ex);
	    	}

	    	LineaChefController display = Loader.getController();

			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(
						"dessert.txt"));
				String line = reader.readLine();
				while (line != null) {
					System.out.println(line);
					elenco_dessert = elenco_dessert + line;
					// read next line
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	    	display.SettaggioTesti("Chef Mosca","Linea Dessert",elenco_dessert);

	    	Parent p = Loader.getRoot();
	    	Stage stage = new Stage();
	    	stage.setScene(new Scene(p));
	    	stage.setResizable(false);
	    	stage.showAndWait();

	    }
}