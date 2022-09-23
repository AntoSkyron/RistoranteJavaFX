import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class GraficaController implements Initializable {

    @FXML
    private Button bottone_numero_uno;

    @FXML
    private Button bottone_numero_due;

    @FXML
    private Button bottone_numero_tre;

    @FXML
    private Button bottone_numero_quattro;

    @FXML
    private Button bottone_numero_cinque;

    @FXML
    private CheckBox spunta_musetto;

    @FXML
    private CheckBox spunta_cervo;

    @FXML
    private CheckBox spunta_carpaccio;

    @FXML
    private CheckBox spunta_capesante;

    @FXML
    private CheckBox spunta_uovo_soffice;

    @FXML
    private TextField qta_musetto_maiale;

    @FXML
    private TextField qta_cervo_scottato;

    @FXML
    private TextField qta_carpaccio;

    @FXML
    private TextField qta_capesante;

    @FXML
    private TextField qta_uovo_soffice;

    @FXML
    private CheckBox spunta_zafferano;

    @FXML
    private CheckBox spunta_topinambur;

    @FXML
    private CheckBox spunta_spaghettone;

    @FXML
    private CheckBox spunta_ravioli;

    @FXML
    private TextField qta_riso_zafferano;

    @FXML
    private TextField qta_topinambur;

    @FXML
    private TextField qta_spaghettone;

    @FXML
    private TextField qta_ravioli;

    @FXML
    private CheckBox spunta_zuppa;

    @FXML
    private CheckBox spunta_astice;

    @FXML
    private CheckBox spunta_trancio;

    @FXML
    private CheckBox spunta_rombo;

    @FXML
    private CheckBox spunta_vitello;

    @FXML
    private CheckBox spunta_animella;

    @FXML
    private CheckBox spunta_salciccia;

    @FXML
    private TextField qta_vitello;

    @FXML
    private TextField qta_animella;

    @FXML
    private TextField qta_salsiccia;

    @FXML
    private TextField qta_zuppa;

    @FXML
    private TextField qta_astice_blu;

    @FXML
    private TextField qta_trancio;

    @FXML
    private TextField qta_rombo;

    @FXML
    private CheckBox spunta_dessert;

    @FXML
    private CheckBox spunta_albicocca;

    @FXML
    private CheckBox spunta_frutta;

    @FXML
    private CheckBox spunta_crocchetta;

    @FXML
    private CheckBox spunta_crema;

    @FXML
    private TextField qta_dessert_cioccolato;

    @FXML
    private TextField qta_albicocca_vaniglia;

    @FXML
    private TextField qta_frutta_ghiacciata;

    @FXML
    private TextField qta_crocchetta;

    @FXML
    private TextField qta_crema_bruciata;

    @FXML
    private CheckBox spunta_ferrarelle;

    @FXML
    private CheckBox spunta_peroni;

    @FXML
    private CheckBox spunta_montalcino;

    @FXML
    private TextField qta_ferrarelle;

    @FXML
    private TextField qta_peroni;

    @FXML
    private TextField qta_montalcino;

    @FXML
    private ImageView cameriere;

    @FXML
    private Text testoNotizia;

    @FXML
    private Text NumeroTavolo;

    String tavolo;

    Buffer CodaOrdini;
    Thread t1;
    @Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		CodaOrdini = new Buffer(5);
		t1 = new Thread(new Consumatore(CodaOrdini,cameriere,NumeroTavolo,testoNotizia));
		t1.start();
	}



    public void Azzera(){
    	spunta_cervo.setSelected(false);
    	spunta_musetto.setSelected(false);
    	spunta_carpaccio.setSelected(false);
    	spunta_capesante.setSelected(false);
    	spunta_uovo_soffice.setSelected(false);
    	spunta_zafferano.setSelected(false);
    	spunta_topinambur.setSelected(false);
    	spunta_spaghettone.setSelected(false);
    	spunta_ravioli.setSelected(false);
    	spunta_zuppa.setSelected(false);
    	spunta_astice.setSelected(false);
    	spunta_trancio.setSelected(false);
    	spunta_rombo.setSelected(false);
    	spunta_vitello.setSelected(false);
    	spunta_animella.setSelected(false);
    	spunta_salciccia.setSelected(false);
    	spunta_dessert.setSelected(false);
    	spunta_albicocca.setSelected(false);
    	spunta_frutta.setSelected(false);
    	spunta_crocchetta.setSelected(false);
    	spunta_crema.setSelected(false);
    	spunta_ferrarelle.setSelected(false);
    	spunta_peroni.setSelected(false);
    	spunta_montalcino.setSelected(false);

    	qta_cervo_scottato.setText("");
    	qta_musetto_maiale.setText("");
    	qta_carpaccio.setText("");
    	qta_capesante.setText("");
    	qta_uovo_soffice.setText("");
    	qta_riso_zafferano.setText("");
    	qta_topinambur.setText("");
    	qta_spaghettone.setText("");
    	qta_ravioli.setText("");
    	qta_vitello.setText("");
    	qta_animella.setText("");
    	qta_salsiccia.setText("");
    	qta_zuppa.setText("");
    	qta_astice_blu.setText("");
    	qta_trancio.setText("");
    	qta_rombo.setText("");
    	qta_dessert_cioccolato.setText("");
    	qta_albicocca_vaniglia.setText("");
    	qta_frutta_ghiacciata.setText("");
    	qta_crocchetta.setText("");
    	qta_crema_bruciata.setText("");
    	qta_ferrarelle.setText("");
    	qta_peroni.setText("");
    	qta_montalcino.setText("");
    }


    public void SetTavolo1()
    {
    	tavolo = "n.1";
    	NotifyTavolo(tavolo);
    }

    public void SetTavolo2(){
    	tavolo = "n.2";
    	NotifyTavolo(tavolo);
    }


    public void SetTavolo3(){
    	tavolo = "n.3";
    	NotifyTavolo(tavolo);
    }


    public void SetTavolo4(){
    	tavolo = "n.4";
    	NotifyTavolo(tavolo);
    }


    public void SetTavolo5(){
    	tavolo = "n.5";
    	NotifyTavolo(tavolo);

    }



    public void ErrorQta(){
		Alert alert = new Alert(AlertType.INFORMATION, "Errore. Hai immesso una quantità errata!!", ButtonType.OK);
		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
		alert.setTitle("Skracco's Restaurant");
		alert.show();
		return;
    }

    public void NotifyTavolo(String tavolo){
		Alert alert = new Alert(AlertType.INFORMATION, "Tavolo scelto :" + tavolo, ButtonType.OK);
		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
		alert.setTitle("Skracco's Restaurant");
		alert.show();
    }

    public void MissingQta(String nome)
    {
		Alert alert = new Alert(AlertType.INFORMATION, "Errore. Ti sei dimenticato di immettere la quantità di:" + nome, ButtonType.OK);
		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
		alert.setTitle("Skracco's Restaurant");
		alert.show();
    }

    public void CucinaPOV() throws FileNotFoundException, IOException{

    	FXMLLoader Loader = new FXMLLoader();
    	Loader.setLocation(getClass().getResource("PovChef.fxml"));

    	try{
    		Loader.load();
    	} catch (IOException ex){
    		Logger.getLogger(ChefController.class.getName()).log(Level.SEVERE,null,ex);
    	}

    	ChefController display = Loader.getController();

    	String primo=null;
    	String secondo=null;
    	String terzo=null;
    	String quarto=null;
    	String quinto=null;

     	File f = new File("Ordinazione_Fila.txt");

    	if(f.exists())
    	{


        try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("Ordinazione_Fila.txt"))) {
            String line = lineNumberReader.readLine();
            for(int i = 1; i <= 5; i++){
               //System.out.println(line);

               if(primo==null){
            	   primo=line;
               }else if(secondo==null){
            	   secondo=line;
               }else if (terzo==null){
            	   terzo=line;
               }else if (quarto==null)
               {
            	   quarto=line;
               }else if (quinto==null){
            	   quinto=line;
               }
               line = lineNumberReader.readLine();
               if(line == null){
                  break;
               }
            }
         }

        //System.out.println(primo);


        if(primo!=null)
        {
        if(!primo.equals("n.1") && !primo.equals("n.2") && !primo.equals("n.3") && !primo.equals("n.4") && !primo.equals("n.5")){
        	primo="Nessuna ordinazione";
        }
        else{
        	primo="Tavolo " + primo;
        }
        }
        else{
        	primo = "Nessuna ordinazione";
        }

        if(secondo!=null)
        {
        if(!secondo.equals("n.1") && !secondo.equals("n.2") && !secondo.equals("n.3") && !secondo.equals("n.4") && !secondo.equals("n.5")){
        	secondo="Nessuna ordinazione";
        }
        else{
        	secondo="Tavolo " + secondo;
        }
        }
        else
        {
        	secondo="Nessuna ordinazione";
        }

        if(terzo!=null)
        {
        if(!terzo.equals("n.1") && !terzo.equals("n.2") && !terzo.equals("n.3") && !terzo.equals("n.4") && !terzo.equals("n.5")){
        	terzo="Nessuna ordinazione";
        }
        else{
        	terzo = "Tavolo " + terzo;
        }
        }else{
        	terzo="Nessuna ordinazione";
        }


        if(quarto!=null)
        {
        if(!quarto.equals("n.1") && !quarto.equals("n.2") && !quarto.equals("n.3") && !quarto.equals("n.4") && !quarto.equals("n.5")){
        	quarto="Nessuna ordinazione";
        }else{
        	quarto= "Tavolo " + quarto;
        }
        }
        else{
        	quarto ="Nessuna ordinazione";
        }


        if(quinto!=null)
        {
        if(!quinto.equals("n.1") && !quinto.equals("n.2") && !quinto.equals("n.3") && !quinto.equals("n.4") && !quinto.equals("n.5")){
        	quinto="Nessuna ordinazione";
        }else{
        	quinto = "Tavolo " + quinto;
        }
        }else
        {
        	quinto="Nessuna ordinazione";
        }



    	display.Testo(primo,secondo,terzo,quarto,quinto);

    }

    	Parent p = Loader.getRoot();
    	Stage stage = new Stage();
    	//stage.initStyle(StageStyle.UNDECORATED);
    	stage.setScene(new Scene(p));
    	stage.setResizable(false);
    	stage.showAndWait();
    }


    public void Invio() throws IOException{
    	String ordine = null;

    	String primi = "";
    	String antipasti = "";
    	String secondi = "";
    	String dessert = "";


    	String scontrino = null;
    	String nomefile_scontrino;
    	if(tavolo == null){
    		Alert alert = new Alert(AlertType.INFORMATION, "Errore. Ti sei dimenticato di immettere il numero del tavolo!", ButtonType.OK);
    		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
    		alert.setTitle("Skracco's Restaurant");
    		alert.show();
    		return;
    	}else if(spunta_musetto.isSelected() == false && spunta_cervo.isSelected() == false &&
    	spunta_carpaccio.isSelected() == false && spunta_capesante.isSelected() == false &&
    	spunta_uovo_soffice.isSelected() == false && spunta_zafferano.isSelected() == false &&
    	spunta_topinambur.isSelected() == false && spunta_spaghettone.isSelected() == false &&
    	spunta_ravioli.isSelected() == false && spunta_zuppa.isSelected() == false &&
    	spunta_astice.isSelected() == false && spunta_trancio.isSelected() == false &&
    	spunta_rombo.isSelected() == false && spunta_vitello.isSelected() == false &&
    	spunta_animella.isSelected() == false && spunta_salciccia.isSelected() == false &&
    	spunta_dessert.isSelected() == false && spunta_albicocca.isSelected() == false &&
    	spunta_frutta.isSelected() == false && spunta_crocchetta.isSelected() == false &&
    	spunta_crema.isSelected() == false && spunta_ferrarelle.isSelected() == false &&
    	spunta_peroni.isSelected() == false && spunta_montalcino.isSelected() == false){
    		Alert alert = new Alert(AlertType.INFORMATION, "Errore. Nessuna spunta abilitata!", ButtonType.OK);
    		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
    		alert.setTitle("Skracco's Restaurant");
    		alert.show();
    		return;
    	}


    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    	LocalDateTime now = LocalDateTime.now();

    	ordine = "\n" + "================================" + "\n";
    	ordine = ordine + "Tavolo:" + "\t" + tavolo + "\t" + "Ora:" +  "\t" +  dtf.format(now) ;



    	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH-mm");
    	LocalDateTime now2 = LocalDateTime.now();

    	nomefile_scontrino  =  "Ordinazione Tavolo " + tavolo + " " + dtf2.format(now2) + ".txt";
    	scontrino = "====================================" + "\n"+  "\tRISTORANTE SKRACCO" + "\n" + "====================================" + "\n";

    	int tot = 0;


    	if(spunta_musetto.isSelected() == true)
    	{
    		if(qta_musetto_maiale.getText().equals("")){
    			MissingQta("Musetto di maiale");
    			return;
    		}else if(qta_musetto_maiale.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Musetto di maiale" + "\t" + qta_musetto_maiale.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_musetto_maiale.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 43;
    			tot = tot + tot_temp;
    			antipasti = antipasti + "\nMusetto di maiale   " + "\t" + qta_musetto_maiale.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Musetto di maiale" + "\t" + qta_musetto_maiale.getText() + "x" + "\t" + tot_temp +"euro";
    		}
    	}
    	if(spunta_cervo.isSelected() == true)
    	{
    		if(qta_cervo_scottato.getText().equals(""))
    		{
    			MissingQta("Cervo scottato");
    			return;
    		}else if(qta_cervo_scottato.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Cervo scottato" + "\t" + qta_cervo_scottato.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_cervo_scottato.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 46;
    			tot = tot + tot_temp;
    			antipasti = antipasti + "\nCervo scottato   " + "\t" + qta_cervo_scottato.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Cervo scottato" + "\t" + qta_cervo_scottato.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_carpaccio.isSelected() == true )
    	{
    		if(qta_carpaccio.getText().equals("")){
    			MissingQta("Carpaccio");
    			return;
    		}else if(qta_carpaccio.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Carpaccio" + "\t" + qta_carpaccio.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_carpaccio.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 70;
    			tot = tot + tot_temp;
    			antipasti = antipasti + "\nCarpaccio  " + "\t" + qta_carpaccio.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Carpaccio" + "\t" + qta_carpaccio.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_capesante.isSelected() == true)
    	{
    		if(qta_capesante.getText().equals("")){
    			MissingQta("Capesante");
    			return;
    		}else if(qta_capesante.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Capesante" + "\t" + qta_capesante.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_capesante.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 48;
    			tot = tot + tot_temp;
    			antipasti = antipasti + "\nCapesante  " + "\t" + qta_capesante.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Capesante" + "\t" + qta_capesante.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_uovo_soffice.isSelected() == true)
    	{
    		if(qta_uovo_soffice.getText().equals("")){
    			MissingQta("Uovo soffice");
    			return;
    		}else if(qta_uovo_soffice.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Uovo soffice" + "\t" + qta_uovo_soffice.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_uovo_soffice.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 36;
    			tot = tot + tot_temp;
    			antipasti = antipasti + "\nUovo soffice" + "\t" + qta_uovo_soffice.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Uovo soffice" + "\t" + qta_uovo_soffice.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_zafferano.isSelected() == true)
    	{
    		if(qta_riso_zafferano.getText().equals("")){
    			MissingQta("Riso allo Zafferano");
    			return;
    		}else if(qta_riso_zafferano.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Riso allo zafferano" + "\t" + qta_riso_zafferano.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_riso_zafferano.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 42;
    			tot = tot + tot_temp;
    			primi = primi + "\nRiso allo zafferano" + "\t" + qta_riso_zafferano.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Riso allo zafferano" + "\t" + qta_riso_zafferano.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_topinambur.isSelected() == true)
    	{
    		if(qta_topinambur.getText().equals("")){
    			MissingQta("Riso al Topinambur");
    			return;
    		}else if(qta_topinambur.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Riso al Topinambur" + "\t" + qta_topinambur.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_topinambur.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 48;
    			tot = tot + tot_temp;
    			primi = primi + "\nTopinambur" + "\t" + qta_topinambur.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Topinambur" + "\t" + qta_topinambur.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_spaghettone.isSelected() == true)
    	{
    		if(qta_spaghettone.getText().equals("")){
    			MissingQta("Spaghettone");
    			return;
    		}else if(qta_spaghettone.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Spaghettone" + "\t" + qta_spaghettone.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_spaghettone.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 45;
    			tot = tot + tot_temp;
    			primi = primi + "\nSpaghettone" + "\t" + qta_spaghettone.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Spaghettone" + "\t" + qta_spaghettone.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_ravioli.isSelected() == true)
    	{
    		if(qta_ravioli.getText().equals("")){
    			MissingQta("Ravioli");
    			return;
    		}else if(qta_ravioli.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Ravioli" + "\t" + qta_ravioli.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_ravioli.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 47;
    			tot = tot + tot_temp;
    			primi = primi + "\nRavioli" + "\t" + qta_ravioli.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Ravioli" + "\t" + qta_ravioli.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_zuppa.isSelected() == true)
    	{
    		if(qta_zuppa.getText().equals("")){
    			MissingQta("Zuppa");
    			return;
    		}else if(qta_zuppa.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Zuppa" + "\t" + qta_zuppa.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_zuppa.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 56;
    			tot = tot + tot_temp;
    			secondi = secondi + "\nZuppa" + "\t" + qta_zuppa.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Zuppa" + "\t" + qta_zuppa.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_astice.isSelected() == true)
    	{
    		if(qta_astice_blu.getText().equals("")){
    			MissingQta("Astice blu");
    			return;
    		}else if(qta_astice_blu.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Astice blu" + "\t" + qta_astice_blu.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_astice_blu.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 58;
    			tot = tot + tot_temp;
    			secondi = secondi + "\nAstice blu" + "\t" + qta_astice_blu.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Astice blu" + "\t" + qta_astice_blu.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_trancio.isSelected() == true)
    	{
    		if(qta_trancio.getText().equals("")){
    			MissingQta("Trancio");
    			return;
    		}else if(qta_trancio.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Trancio" + "\t" + qta_trancio.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_trancio.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 60;
    			tot = tot + tot_temp;
    			secondi = secondi + "\nTrancio" + "\t" + qta_trancio.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Trancio" + "\t" + qta_trancio.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
    	if(spunta_rombo.isSelected() == true)
    	{
    		if(qta_rombo.getText().equals("")){
    			MissingQta("Rombo");
    			return;
    		}else if(qta_rombo.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Rombo" + "\t" + qta_rombo.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_rombo.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 110;
    			tot = tot + tot_temp;
    			secondi = secondi + "\nRombo" + "\t" + qta_rombo.getText() + "x" + "\t" + tavolo;
    			scontrino = scontrino + "\n" + "Rombo" + "\t" + qta_rombo.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
     	if(spunta_vitello.isSelected() == true)
    	{
    		if(qta_vitello.getText().equals("")){
    			MissingQta("Vitello");
    			return;
    		}else if(qta_vitello.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Vitello" + "\t" + qta_vitello.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_vitello.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 48;
    			tot = tot + tot_temp;
    			secondi = secondi + "\nVitello" + "\t" + qta_vitello.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Vitello" + "\t" + qta_vitello.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_animella.isSelected() == true)
    	{
    		if(qta_animella.getText().equals("")){
    			MissingQta("Animella");
    			return;
    		}else if(qta_animella.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Animella" + "\t" + qta_animella.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_animella.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 46;
    			tot = tot + tot_temp;

    			secondi = secondi + "\nAnimella" + "\t" + qta_animella.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Animella" + "\t" + qta_animella.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_salciccia.isSelected() == true)
    	{
    		if(qta_salsiccia.getText().equals("")){
    			MissingQta("Salciccia");
    			return;
    		}else if(qta_salsiccia.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Salciccia" + "\t" + qta_salsiccia.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_salsiccia.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 41;
    			tot = tot + tot_temp;

    			secondi = secondi + "\nSalciccia" + "\t" + qta_salsiccia.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Salciccia" + "\t" + qta_salsiccia.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_dessert.isSelected() == true)
    	{
    		if(qta_dessert_cioccolato.getText().equals("")){
    			MissingQta("dessert");
    			return;
    		}else if(qta_dessert_cioccolato.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Dessert al Cioccolato" + "\t" + qta_dessert_cioccolato.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_dessert_cioccolato.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 34;
    			tot = tot + tot_temp;

    			dessert = dessert + "\nDessert al Cioccolato" + "\t" + qta_dessert_cioccolato.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Dessert al Cioccolato" + "\t" + qta_dessert_cioccolato.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_albicocca.isSelected() == true)
    	{
    		if(qta_albicocca_vaniglia.getText().equals("")){
    			MissingQta("Albicocca");
    			return;
    		}else if(qta_albicocca_vaniglia.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Albicocca alla vaniglia" + "\t" + qta_albicocca_vaniglia.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_albicocca_vaniglia.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 36;
    			tot = tot + tot_temp;

    			dessert = dessert + "\nAlbicocca alla vaniglia" + "\t" + qta_albicocca_vaniglia.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Albicocca alla vaniglia" + "\t" + qta_albicocca_vaniglia.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_frutta.isSelected() == true)
    	{
    		if(qta_frutta_ghiacciata.getText().equals("")){
    			MissingQta("Frutta ghiacciata");
    			return;
    		}else if(qta_frutta_ghiacciata.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Frutta ghiacciata" + "\t" + qta_frutta_ghiacciata.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_frutta_ghiacciata.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 35;
    			tot = tot + tot_temp;
    			dessert = dessert + "\nFrutta ghiacciata" + "\t" + qta_frutta_ghiacciata.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Frutta ghiacciata" + "\t" + qta_frutta_ghiacciata.getText() + "x" + "\t" +  tot_temp +"euro";
    		}
    	}
     	if(spunta_crocchetta.isSelected() == true)
    	{
    		if(qta_crocchetta.getText().equals("")){
    			MissingQta("Crocchetta");
    			return;
    		}else if(qta_crocchetta.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Crocchetta" + "\t" + qta_crocchetta.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_crocchetta.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 50;
    			tot = tot + tot_temp;
    			dessert = dessert + "\nCrocchetta" + "\t" + qta_crocchetta.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Crocchetta" + "\t" + qta_crocchetta.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_crema.isSelected() == true)
    	{
    		if(qta_crema_bruciata.getText().equals("")){
    			MissingQta("Crema bruciata");
    			return;
    		}else if(qta_crema_bruciata.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Crema bruciata" + "\t" + qta_crema_bruciata.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_crema_bruciata.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 36;
    			tot = tot + tot_temp;
    			dessert = dessert + "\nCrema bruciata" + "\t" + qta_crema_bruciata.getText() + "x" + "\t" + tavolo;

    			scontrino = scontrino + "\n" + "Crema bruciata" + "\t" + qta_crema_bruciata.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_ferrarelle.isSelected() == true)
    	{
    		if(qta_ferrarelle.getText().equals("")){
    			MissingQta("Acqua effervescente naturale ferrarelle");
    			return;
    		}else if(qta_ferrarelle.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Acqua Ferrarelle" + "\t" + qta_ferrarelle.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_ferrarelle.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 3;
    			tot = tot + tot_temp;
    			scontrino = scontrino + "\n" + "Acqua ferrarelle" + "\t" + qta_ferrarelle.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_peroni.isSelected() == true)
    	{
    		if(qta_peroni.getText().equals("")){
    			MissingQta("Birra peroni");
    			return;
    		}else if(qta_peroni.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Birra Peroni" + "\t" + qta_peroni.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_peroni.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 8;
    			tot = tot + tot_temp;
    			scontrino = scontrino + "\n" + "Birra Peroni" + "\t" + qta_peroni.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}
     	if(spunta_montalcino.isSelected() == true)
    	{
    		if(qta_montalcino.getText().equals("")){
    			MissingQta("Vino Montalcino");
    			return;
    		}
    		else if(qta_montalcino.getText().contains("-")){
    			ErrorQta();
    			return;
    		}else{
    			ordine = ordine + "\n" + "Vino montalcino" + "\t" + qta_montalcino.getText() + "x";
    			int temp = 0;
    			temp = Integer.parseInt(qta_montalcino.getText());
    			int tot_temp = 0;
    			tot_temp = temp * 34;
    			tot = tot + tot_temp;
    			scontrino = scontrino + "\n" + "Vino Montalcino" + "\t" + qta_montalcino.getText() + "x" + "\t" +  tot_temp +"euro";

    		}
    	}

     	scontrino = scontrino + "\n" + "====================================\n" + "TOTALE :\t" + tot + " euro";
     	scontrino = scontrino + "\n\tGRAZIE E ARRIVEDERCI\n====================================";

     	//System.out.print(ordine);


     	File f6 = new File("antipasti.txt");

        if(!f6.exists()) {
            f6.createNewFile();
         }


     	FileWriter fileWriter6 = new FileWriter(f6.getName(),true);
     	BufferedWriter bw6 = new BufferedWriter(fileWriter6);
     	bw6.append(antipasti);
     	bw6.close();



     	File f7 = new File("primi.txt");

        if(!f7.exists()) {
            f7.createNewFile();
         }


     	FileWriter fileWriter7 = new FileWriter(f7.getName(),true);
     	BufferedWriter bw7 = new BufferedWriter(fileWriter7);
     	//System.out.println(primi);
     	bw7.append(primi);
     	bw7.close();



      	File f8 = new File("secondi.txt");

        if(!f8.exists()) {
            f8.createNewFile();
         }


     	FileWriter fileWriter8 = new FileWriter(f8.getName(),true);
     	BufferedWriter bw8 = new BufferedWriter(fileWriter8);
     	bw8.append(secondi);
     	bw8.close();


      	File f9 = new File("dessert.txt");

        if(!f9.exists()) {
            f9.createNewFile();
         }


     	FileWriter fileWriter9 = new FileWriter(f9.getName(),true);
     	BufferedWriter bw9 = new BufferedWriter(fileWriter9);
     	bw9.append(dessert);
     	bw9.close();



     	File f1 = new File("Cronologia Ordinazioni.txt");

        if(!f1.exists()) {
            f1.createNewFile();
         }


     	FileWriter fileWriter = new FileWriter(f1.getName(),true);
     	BufferedWriter bw = new BufferedWriter(fileWriter);
     	bw.append(ordine);
     	bw.close();

     	//System.out.println(nomefile_scontrino);
     	File f2 = new File(nomefile_scontrino);

        if(!f2.exists()) {
            f2.createNewFile();
         }

     	FileWriter fileWriter2 = new FileWriter(f2.getName(),true);
     	BufferedWriter bw2 = new BufferedWriter(fileWriter2);
     	bw2.append(scontrino);
     	bw2.close();

     	File f3 = new File("Ordinazione_Fila.txt");
     	if(!f3.exists()) {
           f3.createNewFile();
        }
     	FileWriter fileWriter3 = new FileWriter(f3.getName(),true);
     	BufferedWriter bw3 = new BufferedWriter(fileWriter3);
     	bw3.append(tavolo+"\n");
     	bw3.close();

     	CodaOrdini.aggiungi(new Ordinazione(tavolo,ordine,scontrino));
     	tavolo = null;
     	Azzera();
    }
}


class Consumatore implements Runnable
{
	Buffer coda;
	Random random;
	String ordine_arrivo;

	String scontrino;
	ImageView Cameriere;
	Text nTavolo;
	Text testoNotizia;

	public Consumatore(Buffer coda,ImageView Cameriere,Text nTavolo,Text testoNotizia)
	{
		this.coda=coda;
		scontrino="";
		this.Cameriere=Cameriere;
		this.nTavolo=nTavolo;
		this.testoNotizia=testoNotizia;
		random = new Random();

	}

	@Override
	public void run() {
		while(true){
			Ordinazione a = coda.PreparaArriva();
			try
			{
				scontrino = a.getScontrino();
				testoNotizia.setText("IN ARRIVO");
				Cameriere.setVisible(true);
				if(a.getNt()=="n.1"){
					testoNotizia.setText("IN PREPARAZIONE");
					nTavolo.setText("n.1");

					Thread.sleep(10000);

					File inputFile = new File("Ordinazione_Fila.txt");
					File tempFile = new File("fileTemp.txt");

					BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

					String lineToRemove = "n.1";
					String currentLine;

					while((currentLine = reader.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine = currentLine.trim();
					    if(trimmedLine.equals(lineToRemove)) continue;
					    writer.write(currentLine + System.getProperty("line.separator"));
					}
					writer.close();
					reader.close();
					inputFile.delete();
					tempFile.renameTo(inputFile);



					File inputFile2 = new File("antipasti.txt");
					File tempFile2 = new File("fileTemp2.txt");

					BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
					BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));

					String lineToRemove2 = "n.1";
					String currentLine2;

					while((currentLine2 = reader2.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine2 = currentLine2.trim();
					    if(trimmedLine2.endsWith(lineToRemove2)) continue;
					    writer2.write(currentLine2 + System.getProperty("line.separator"));
					}
					writer2.close();
					reader2.close();
					inputFile2.delete();
					tempFile2.renameTo(inputFile2);




					File inputFile3 = new File("primi.txt");
					File tempFile3 = new File("fileTemp3.txt");

					BufferedReader reader3 = new BufferedReader(new FileReader(inputFile3));
					BufferedWriter writer3 = new BufferedWriter(new FileWriter(tempFile3));

					String lineToRemove3 = "n.1";
					String currentLine3;

					while((currentLine3 = reader3.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine3 = currentLine3.trim();
					    if(trimmedLine3.endsWith(lineToRemove3)) continue;
					    writer3.write(currentLine3 + System.getProperty("line.separator"));
					}
					writer3.close();
					reader3.close();
					inputFile3.delete();
					tempFile3.renameTo(inputFile3);




					File inputFile4 = new File("secondi.txt");
					File tempFile4 = new File("fileTemp4.txt");

					BufferedReader reader4 = new BufferedReader(new FileReader(inputFile4));
					BufferedWriter writer4 = new BufferedWriter(new FileWriter(tempFile4));

					String lineToRemove4 = "n.1";
					String currentLine4;

					while((currentLine4 = reader4.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine4 = currentLine4.trim();
					    if(trimmedLine4.endsWith(lineToRemove4)) continue;
					    writer4.write(currentLine4 + System.getProperty("line.separator"));
					}
					writer4.close();
					reader4.close();
					inputFile4.delete();
					tempFile4.renameTo(inputFile4);



					File inputFile5 = new File("dessert.txt");
					File tempFile5 = new File("fileTemp5.txt");

					BufferedReader reader5 = new BufferedReader(new FileReader(inputFile5));
					BufferedWriter writer5 = new BufferedWriter(new FileWriter(tempFile5));

					String lineToRemove5 = "n.1";
					String currentLine5;

					while((currentLine5 = reader5.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine5 = currentLine5.trim();
					    if(trimmedLine5.endsWith(lineToRemove5)) continue;
					    writer5.write(currentLine5 + System.getProperty("line.separator"));
					}
					writer5.close();
					reader5.close();
					inputFile5.delete();
					tempFile5.renameTo(inputFile5);



					testoNotizia.setText("PIATTI IN ARRIVO");

					ordine_arrivo = a.getOrdine();

					Cameriere.setLayoutX(297);
					Cameriere.setLayoutY(647);
					Thread.sleep(150);
					Cameriere.setLayoutX(310);
					Cameriere.setLayoutY(622);
					Thread.sleep(150);
					Cameriere.setLayoutX(322);
					Cameriere.setLayoutY(595);
					Thread.sleep(150);
					Cameriere.setLayoutX(330);
					Cameriere.setLayoutY(564);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(538);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(509);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(479);
					Thread.sleep(150);
					Cameriere.setLayoutX(362);
					Cameriere.setLayoutY(457);
					Thread.sleep(150);
					Cameriere.setLayoutX(371);
					Cameriere.setLayoutY(423);
					Thread.sleep(150);
					Cameriere.setLayoutX(383);
					Cameriere.setLayoutY(378);
					Thread.sleep(150);
					Cameriere.setLayoutX(417);
					Cameriere.setLayoutY(347);
					Thread.sleep(150);
					Cameriere.setLayoutX(458);
					Cameriere.setLayoutY(345);
					Thread.sleep(150);
					Cameriere.setLayoutX(491);
					Cameriere.setLayoutY(333);
					Thread.sleep(150);
					Cameriere.setLayoutX(512);
					Cameriere.setLayoutY(306);
					Thread.sleep(150);
					Cameriere.setLayoutX(532);
					Cameriere.setLayoutY(283);
					Thread.sleep(150);
					Cameriere.setLayoutX(537);
					Cameriere.setLayoutY(254);
					Thread.sleep(150);
					Cameriere.setLayoutX(532);
					Cameriere.setLayoutY(229);
					Thread.sleep(150);
					Cameriere.setLayoutX(532);
					Cameriere.setLayoutY(206);// ARRIVATO , ORA TORNA ALLA CUCINA
					Thread.sleep(150);
					Cameriere.setLayoutX(532);
					Cameriere.setLayoutY(229);
					Thread.sleep(150);
					Cameriere.setLayoutX(537);
					Cameriere.setLayoutY(254);
					Thread.sleep(150);
					Cameriere.setLayoutX(532);
					Cameriere.setLayoutY(283);
					Thread.sleep(150);
					Cameriere.setLayoutX(512);
					Cameriere.setLayoutY(306);
					Thread.sleep(150);
					Cameriere.setLayoutX(491);
					Cameriere.setLayoutY(333);
					Thread.sleep(150);
					Cameriere.setLayoutX(458);
					Cameriere.setLayoutY(345);
					Thread.sleep(150);
					Cameriere.setLayoutX(417);
					Cameriere.setLayoutY(347);
					Thread.sleep(150);
					Cameriere.setLayoutX(383);
					Cameriere.setLayoutY(378);
					Thread.sleep(150);
					Cameriere.setLayoutX(371);
					Cameriere.setLayoutY(423);
					Thread.sleep(150);
					Cameriere.setLayoutX(362);
					Cameriere.setLayoutY(457);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(479);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(509);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(538);
					Thread.sleep(150);
					Cameriere.setLayoutX(330);
					Cameriere.setLayoutY(564);
					Thread.sleep(150);
					Cameriere.setLayoutX(322);
					Cameriere.setLayoutY(595);
					Thread.sleep(150);
					Cameriere.setLayoutX(310);
					Cameriere.setLayoutY(622);
					Thread.sleep(150);
					Cameriere.setLayoutX(297);
					Cameriere.setLayoutY(647);
				}else if(a.getNt()=="n.2"){
					testoNotizia.setText("IN PREPARAZIONE");
					nTavolo.setText("n.2");

					Thread.sleep(10000);

					File inputFile = new File("Ordinazione_Fila.txt");
					File tempFile = new File("fileTemp.txt");

					BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

					String lineToRemove = "n.2";
					String currentLine;

					while((currentLine = reader.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine = currentLine.trim();
					    if(trimmedLine.equals(lineToRemove)) continue;
					    writer.write(currentLine + System.getProperty("line.separator"));
					}
					writer.close();
					reader.close();
					inputFile.delete();
					tempFile.renameTo(inputFile);





					File inputFile2 = new File("antipasti.txt");
					File tempFile2 = new File("fileTemp2.txt");

					BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
					BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));

					String lineToRemove2 = "n.2";
					String currentLine2;

					while((currentLine2 = reader2.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine2 = currentLine2.trim();
					    if(trimmedLine2.endsWith(lineToRemove2)) continue;
					    writer2.write(currentLine2 + System.getProperty("line.separator"));
					}
					writer2.close();
					reader2.close();
					inputFile2.delete();
					tempFile2.renameTo(inputFile2);




					File inputFile3 = new File("primi.txt");
					File tempFile3 = new File("fileTemp3.txt");

					BufferedReader reader3 = new BufferedReader(new FileReader(inputFile3));
					BufferedWriter writer3 = new BufferedWriter(new FileWriter(tempFile3));

					String lineToRemove3 = "n.2";
					String currentLine3;

					while((currentLine3 = reader3.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine3 = currentLine3.trim();
					    if(trimmedLine3.endsWith(lineToRemove3)) continue;
					    writer3.write(currentLine3 + System.getProperty("line.separator"));
					}
					writer3.close();
					reader3.close();
					inputFile3.delete();
					tempFile3.renameTo(inputFile3);




					File inputFile4 = new File("secondi.txt");
					File tempFile4 = new File("fileTemp4.txt");

					BufferedReader reader4 = new BufferedReader(new FileReader(inputFile4));
					BufferedWriter writer4 = new BufferedWriter(new FileWriter(tempFile4));

					String lineToRemove4 = "n.2";
					String currentLine4;

					while((currentLine4 = reader4.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine4 = currentLine4.trim();
					    if(trimmedLine4.endsWith(lineToRemove4)) continue;
					    writer4.write(currentLine4 + System.getProperty("line.separator"));
					}
					writer4.close();
					reader4.close();
					inputFile4.delete();
					tempFile4.renameTo(inputFile4);



					File inputFile5 = new File("dessert.txt");
					File tempFile5 = new File("fileTemp5.txt");

					BufferedReader reader5 = new BufferedReader(new FileReader(inputFile5));
					BufferedWriter writer5 = new BufferedWriter(new FileWriter(tempFile5));

					String lineToRemove5 = "n.2";
					String currentLine5;

					while((currentLine5 = reader5.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine5 = currentLine5.trim();
					    if(trimmedLine5.endsWith(lineToRemove5)) continue;
					    writer5.write(currentLine5 + System.getProperty("line.separator"));
					}
					writer5.close();
					reader5.close();
					inputFile5.delete();
					tempFile5.renameTo(inputFile5);


					testoNotizia.setText("PIATTI IN ARRIVO");

					ordine_arrivo = a.getOrdine();

					Cameriere.setLayoutX(297);
					Cameriere.setLayoutY(639);
					Thread.sleep(150);
					Cameriere.setLayoutX(310);
					Cameriere.setLayoutY(611);
					Thread.sleep(150);
					Cameriere.setLayoutX(322);
					Cameriere.setLayoutY(584);
					Thread.sleep(150);
					Cameriere.setLayoutX(337);
					Cameriere.setLayoutY(557);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(525);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(497);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(464);
					Thread.sleep(150);
					Cameriere.setLayoutX(356);
					Cameriere.setLayoutY(427);
					Thread.sleep(150);
					Cameriere.setLayoutX(368);
					Cameriere.setLayoutY(388);
					Thread.sleep(150);
					Cameriere.setLayoutX(356);
					Cameriere.setLayoutY(355);
					Thread.sleep(150);
					Cameriere.setLayoutX(362);
					Cameriere.setLayoutY(312);          // ARRIVATOOOOOOOOOOOOO
					Thread.sleep(150);
					Cameriere.setLayoutX(356);
					Cameriere.setLayoutY(355);
					Thread.sleep(150);
					Cameriere.setLayoutX(368);
					Cameriere.setLayoutY(388);
					Thread.sleep(150);
					Cameriere.setLayoutX(356);
					Cameriere.setLayoutY(427);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(464);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(497);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(525);
					Thread.sleep(150);
					Cameriere.setLayoutX(337);
					Cameriere.setLayoutY(557);
					Thread.sleep(150);
					Cameriere.setLayoutX(322);
					Cameriere.setLayoutY(584);
					Thread.sleep(150);
					Cameriere.setLayoutX(310);
					Cameriere.setLayoutY(611);
					Thread.sleep(150);
					Cameriere.setLayoutX(297);
					Cameriere.setLayoutY(639);

				}else if(a.getNt()=="n.3"){

					testoNotizia.setText("IN PREPARAZIONE");
					nTavolo.setText("n.3");

					Thread.sleep(10000);

					File inputFile = new File("Ordinazione_Fila.txt");
					File tempFile = new File("fileTemp.txt");

					BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

					String lineToRemove = "n.3";
					String currentLine;

					while((currentLine = reader.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine = currentLine.trim();
					    if(trimmedLine.equals(lineToRemove)) continue;
					    writer.write(currentLine + System.getProperty("line.separator"));
					}
					writer.close();
					reader.close();
					inputFile.delete();
					tempFile.renameTo(inputFile);



					File inputFile2 = new File("antipasti.txt");
					File tempFile2 = new File("fileTemp2.txt");

					BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
					BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));

					String lineToRemove2 = "n.3";
					String currentLine2;

					while((currentLine2 = reader2.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine2 = currentLine2.trim();
					    if(trimmedLine2.endsWith(lineToRemove2)) continue;
					    writer2.write(currentLine2 + System.getProperty("line.separator"));
					}
					writer2.close();
					reader2.close();
					inputFile2.delete();
					tempFile2.renameTo(inputFile2);




					File inputFile3 = new File("primi.txt");
					File tempFile3 = new File("fileTemp3.txt");

					BufferedReader reader3 = new BufferedReader(new FileReader(inputFile3));
					BufferedWriter writer3 = new BufferedWriter(new FileWriter(tempFile3));

					String lineToRemove3 = "n.3";
					String currentLine3;

					while((currentLine3 = reader3.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine3 = currentLine3.trim();
					    if(trimmedLine3.endsWith(lineToRemove3)) continue;
					    writer3.write(currentLine3 + System.getProperty("line.separator"));
					}
					writer3.close();
					reader3.close();
					inputFile3.delete();
					tempFile3.renameTo(inputFile3);




					File inputFile4 = new File("secondi.txt");
					File tempFile4 = new File("fileTemp4.txt");

					BufferedReader reader4 = new BufferedReader(new FileReader(inputFile4));
					BufferedWriter writer4 = new BufferedWriter(new FileWriter(tempFile4));

					String lineToRemove4 = "n.3";
					String currentLine4;

					while((currentLine4 = reader4.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine4 = currentLine4.trim();
					    if(trimmedLine4.endsWith(lineToRemove4)) continue;
					    writer4.write(currentLine4 + System.getProperty("line.separator"));
					}
					writer4.close();
					reader4.close();
					inputFile4.delete();
					tempFile4.renameTo(inputFile4);



					File inputFile5 = new File("dessert.txt");
					File tempFile5 = new File("fileTemp5.txt");

					BufferedReader reader5 = new BufferedReader(new FileReader(inputFile5));
					BufferedWriter writer5 = new BufferedWriter(new FileWriter(tempFile5));

					String lineToRemove5 = "n.3";
					String currentLine5;

					while((currentLine5 = reader5.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine5 = currentLine5.trim();
					    if(trimmedLine5.endsWith(lineToRemove5)) continue;
					    writer5.write(currentLine5 + System.getProperty("line.separator"));
					}
					writer5.close();
					reader5.close();
					inputFile5.delete();
					tempFile5.renameTo(inputFile5);


					testoNotizia.setText("PIATTI IN ARRIVO");

					ordine_arrivo = a.getOrdine();


					Cameriere.setLayoutX(297);
					Cameriere.setLayoutY(644);
					Thread.sleep(150);
					Cameriere.setLayoutX(310);
					Cameriere.setLayoutY(617);
					Thread.sleep(150);
					Cameriere.setLayoutX(322);
					Cameriere.setLayoutY(595);
					Thread.sleep(150);
					Cameriere.setLayoutX(330);
					Cameriere.setLayoutY(571);
					Thread.sleep(150);
					Cameriere.setLayoutX(337);
					Cameriere.setLayoutY(543);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(520);
					Thread.sleep(150);
					Cameriere.setLayoutX(356);
					Cameriere.setLayoutY(494);
					Thread.sleep(150);
					Cameriere.setLayoutX(371);
					Cameriere.setLayoutY(464);
					Thread.sleep(150);
					Cameriere.setLayoutX(356);
					Cameriere.setLayoutY(494);
					Thread.sleep(150);
					Cameriere.setLayoutX(343);
					Cameriere.setLayoutY(520);
					Thread.sleep(150);
					Cameriere.setLayoutX(337);
					Cameriere.setLayoutY(543);
					Thread.sleep(150);
					Cameriere.setLayoutX(330);
					Cameriere.setLayoutY(571);
					Thread.sleep(150);
					Cameriere.setLayoutX(322);
					Cameriere.setLayoutY(595);
					Thread.sleep(150);
					Cameriere.setLayoutX(310);
					Cameriere.setLayoutY(617);
					Thread.sleep(150);
					Cameriere.setLayoutX(297);
					Cameriere.setLayoutY(644);

				}else if(a.getNt()=="n.4"){

					testoNotizia.setText("IN PREPARAZIONE");
					nTavolo.setText("n.4");

					Thread.sleep(10000);

					File inputFile = new File("Ordinazione_Fila.txt");
					File tempFile = new File("fileTemp.txt");

					BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

					String lineToRemove = "n.4";
					String currentLine;

					while((currentLine = reader.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine = currentLine.trim();
					    if(trimmedLine.equals(lineToRemove)) continue;
					    writer.write(currentLine + System.getProperty("line.separator"));
					}
					writer.close();
					reader.close();
					inputFile.delete();
					tempFile.renameTo(inputFile);



					File inputFile2 = new File("antipasti.txt");
					File tempFile2 = new File("fileTemp2.txt");

					BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
					BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));

					String lineToRemove2 = "n.4";
					String currentLine2;

					while((currentLine2 = reader2.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine2 = currentLine2.trim();
					    if(trimmedLine2.endsWith(lineToRemove2)) continue;
					    writer2.write(currentLine2 + System.getProperty("line.separator"));
					}
					writer2.close();
					reader2.close();
					inputFile2.delete();
					tempFile2.renameTo(inputFile2);




					File inputFile3 = new File("primi.txt");
					File tempFile3 = new File("fileTemp3.txt");

					BufferedReader reader3 = new BufferedReader(new FileReader(inputFile3));
					BufferedWriter writer3 = new BufferedWriter(new FileWriter(tempFile3));

					String lineToRemove3 = "n.4";
					String currentLine3;

					while((currentLine3 = reader3.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine3 = currentLine3.trim();
					    if(trimmedLine3.endsWith(lineToRemove3)) continue;
					    writer3.write(currentLine3 + System.getProperty("line.separator"));
					}
					writer3.close();
					reader3.close();
					inputFile3.delete();
					tempFile3.renameTo(inputFile3);




					File inputFile4 = new File("secondi.txt");
					File tempFile4 = new File("fileTemp4.txt");

					BufferedReader reader4 = new BufferedReader(new FileReader(inputFile4));
					BufferedWriter writer4 = new BufferedWriter(new FileWriter(tempFile4));

					String lineToRemove4 = "n.4";
					String currentLine4;

					while((currentLine4 = reader4.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine4 = currentLine4.trim();
					    if(trimmedLine4.endsWith(lineToRemove4)) continue;
					    writer4.write(currentLine4 + System.getProperty("line.separator"));
					}
					writer4.close();
					reader4.close();
					inputFile4.delete();
					tempFile4.renameTo(inputFile4);



					File inputFile5 = new File("dessert.txt");
					File tempFile5 = new File("fileTemp5.txt");

					BufferedReader reader5 = new BufferedReader(new FileReader(inputFile5));
					BufferedWriter writer5 = new BufferedWriter(new FileWriter(tempFile5));

					String lineToRemove5 = "n.4";
					String currentLine5;

					while((currentLine5 = reader5.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine5 = currentLine5.trim();
					    if(trimmedLine5.endsWith(lineToRemove5)) continue;
					    writer5.write(currentLine5 + System.getProperty("line.separator"));
					}
					writer5.close();
					reader5.close();
					inputFile5.delete();
					tempFile5.renameTo(inputFile5);

					testoNotizia.setText("PIATTI IN ARRIVO");

					ordine_arrivo = a.getOrdine();

					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(635);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(617);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(598);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(573);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(558);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(542);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(532);
					Thread.sleep(150);
					Cameriere.setLayoutX(264);
					Cameriere.setLayoutY(523);
					Thread.sleep(150);
					Cameriere.setLayoutX(238);
					Cameriere.setLayoutY(521);
					Thread.sleep(150);
					Cameriere.setLayoutX(218);
					Cameriere.setLayoutY(519);
					Thread.sleep(150);
					Cameriere.setLayoutX(198);
					Cameriere.setLayoutY(519);
					Thread.sleep(150);
					Cameriere.setLayoutX(172);
					Cameriere.setLayoutY(510);
					Thread.sleep(150);
					Cameriere.setLayoutX(161);
					Cameriere.setLayoutY(494);
					Thread.sleep(150);
					Cameriere.setLayoutX(153);
					Cameriere.setLayoutY(478);
					Thread.sleep(150);
					Cameriere.setLayoutX(161);
					Cameriere.setLayoutY(434);    /// E' ARRIVATO
					Thread.sleep(150);
					Cameriere.setLayoutX(153);
					Cameriere.setLayoutY(478);
					Thread.sleep(150);
					Cameriere.setLayoutX(161);
					Cameriere.setLayoutY(494);
					Thread.sleep(150);
					Cameriere.setLayoutX(172);
					Cameriere.setLayoutY(510);
					Thread.sleep(150);
					Cameriere.setLayoutX(198);
					Cameriere.setLayoutY(519);
					Thread.sleep(150);
					Cameriere.setLayoutX(218);
					Cameriere.setLayoutY(519);
					Thread.sleep(150);
					Cameriere.setLayoutX(238);
					Cameriere.setLayoutY(521);
					Thread.sleep(150);
					Cameriere.setLayoutX(264);
					Cameriere.setLayoutY(523);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(532);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(542);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(558);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(573);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(598);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(617);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(635);


				}else if(a.getNt()=="n.5"){

					testoNotizia.setText("IN PREPARAZIONE");
					nTavolo.setText("n.5");

					Thread.sleep(10000);

					File inputFile = new File("Ordinazione_Fila.txt");
					File tempFile = new File("fileTemp.txt");

					BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

					String lineToRemove = "n.5";
					String currentLine;

					while((currentLine = reader.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine = currentLine.trim();
					    if(trimmedLine.equals(lineToRemove)) continue;
					    writer.write(currentLine + System.getProperty("line.separator"));
					}
					writer.close();
					reader.close();
					inputFile.delete();
					tempFile.renameTo(inputFile);


					File inputFile2 = new File("antipasti.txt");
					File tempFile2 = new File("fileTemp2.txt");

					BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
					BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));

					String lineToRemove2 = "n.5";
					String currentLine2;

					while((currentLine2 = reader2.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine2 = currentLine2.trim();
					    if(trimmedLine2.endsWith(lineToRemove2)) continue;
					    writer2.write(currentLine2 + System.getProperty("line.separator"));
					}
					writer2.close();
					reader2.close();
					inputFile2.delete();
					tempFile2.renameTo(inputFile2);




					File inputFile3 = new File("primi.txt");
					File tempFile3 = new File("fileTemp3.txt");

					BufferedReader reader3 = new BufferedReader(new FileReader(inputFile3));
					BufferedWriter writer3 = new BufferedWriter(new FileWriter(tempFile3));

					String lineToRemove3 = "n.5";
					String currentLine3;

					while((currentLine3 = reader3.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine3 = currentLine3.trim();
					    if(trimmedLine3.endsWith(lineToRemove3)) continue;
					    writer3.write(currentLine3 + System.getProperty("line.separator"));
					}
					writer3.close();
					reader3.close();
					inputFile3.delete();
					tempFile3.renameTo(inputFile3);




					File inputFile4 = new File("secondi.txt");
					File tempFile4 = new File("fileTemp4.txt");

					BufferedReader reader4 = new BufferedReader(new FileReader(inputFile4));
					BufferedWriter writer4 = new BufferedWriter(new FileWriter(tempFile4));

					String lineToRemove4 = "n.5";
					String currentLine4;

					while((currentLine4 = reader4.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine4 = currentLine4.trim();
					    if(trimmedLine4.endsWith(lineToRemove4)) continue;
					    writer4.write(currentLine4 + System.getProperty("line.separator"));
					}
					writer4.close();
					reader4.close();
					inputFile4.delete();
					tempFile4.renameTo(inputFile4);



					File inputFile5 = new File("dessert.txt");
					File tempFile5 = new File("fileTemp5.txt");

					BufferedReader reader5 = new BufferedReader(new FileReader(inputFile5));
					BufferedWriter writer5 = new BufferedWriter(new FileWriter(tempFile5));

					String lineToRemove5 = "n.5";
					String currentLine5;

					while((currentLine5 = reader5.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine5 = currentLine5.trim();
					    if(trimmedLine5.endsWith(lineToRemove5)) continue;
					    writer5.write(currentLine5 + System.getProperty("line.separator"));
					}
					writer5.close();
					reader5.close();
					inputFile5.delete();
					tempFile5.renameTo(inputFile5);

					testoNotizia.setText("PIATTI IN ARRIVO");

					ordine_arrivo = a.getOrdine();

					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(667);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(604);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(577);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(558);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(538);
					Thread.sleep(150);
					Cameriere.setLayoutX(272);
					Cameriere.setLayoutY(525);
					Thread.sleep(150);
					Cameriere.setLayoutX(256);
					Cameriere.setLayoutY(515);
					Thread.sleep(150);
					Cameriere.setLayoutX(238);
					Cameriere.setLayoutY(505);
					Thread.sleep(150);
					Cameriere.setLayoutX(226);
					Cameriere.setLayoutY(494);
					Thread.sleep(150);
					Cameriere.setLayoutX(210);
					Cameriere.setLayoutY(477);
					Thread.sleep(150);
					Cameriere.setLayoutX(264);
					Cameriere.setLayoutY(523);
					Thread.sleep(150);
					Cameriere.setLayoutX(192);
					Cameriere.setLayoutY(457);
					Thread.sleep(150);
					Cameriere.setLayoutX(180);
					Cameriere.setLayoutY(421);
					Thread.sleep(150);
					Cameriere.setLayoutX(177);
					Cameriere.setLayoutY(385);
					Thread.sleep(150);
					Cameriere.setLayoutX(177);
					Cameriere.setLayoutY(357);
					Thread.sleep(150);
					Cameriere.setLayoutX(164);
					Cameriere.setLayoutY(333);
					Thread.sleep(150);
					Cameriere.setLayoutX(164);
					Cameriere.setLayoutY(283);
					Thread.sleep(150);
					Cameriere.setLayoutX(174);
					Cameriere.setLayoutY(315);
					Thread.sleep(150);
					Cameriere.setLayoutX(164);
					Cameriere.setLayoutY(260);
					Thread.sleep(150);
					Cameriere.setLayoutX(174);
					Cameriere.setLayoutY(223);
					Thread.sleep(150);
					Cameriere.setLayoutX(180);
					Cameriere.setLayoutY(197);
					Thread.sleep(150);
					Cameriere.setLayoutX(174);
					Cameriere.setLayoutY(223);
					Thread.sleep(150);
					Cameriere.setLayoutX(164);
					Cameriere.setLayoutY(260);
					Thread.sleep(150);
					Cameriere.setLayoutX(174);
					Cameriere.setLayoutY(315);
					Thread.sleep(150);
					Cameriere.setLayoutX(164);
					Cameriere.setLayoutY(283);
					Thread.sleep(150);
					Cameriere.setLayoutX(164);
					Cameriere.setLayoutY(333);
					Thread.sleep(150);
					Cameriere.setLayoutX(177);
					Cameriere.setLayoutY(357);
					Thread.sleep(150);
					Cameriere.setLayoutX(177);
					Cameriere.setLayoutY(385);
					Thread.sleep(150);
					Cameriere.setLayoutX(180);
					Cameriere.setLayoutY(421);
					Thread.sleep(150);
					Cameriere.setLayoutX(192);
					Cameriere.setLayoutY(457);
					Thread.sleep(150);
					Cameriere.setLayoutX(264);
					Cameriere.setLayoutY(523);
					Thread.sleep(150);
					Cameriere.setLayoutX(210);
					Cameriere.setLayoutY(477);
					Thread.sleep(150);
					Cameriere.setLayoutX(226);
					Cameriere.setLayoutY(494);
					Thread.sleep(150);
					Cameriere.setLayoutX(238);
					Cameriere.setLayoutY(505);
					Thread.sleep(150);
					Cameriere.setLayoutX(256);
					Cameriere.setLayoutY(515);
					Thread.sleep(150);
					Cameriere.setLayoutX(272);
					Cameriere.setLayoutY(525);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(538);
					Thread.sleep(150);
					Cameriere.setLayoutX(288);
					Cameriere.setLayoutY(558);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(577);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(604);
					Thread.sleep(150);
					Cameriere.setLayoutX(284);
					Cameriere.setLayoutY(667);
				}
				Thread.sleep(4);
			}catch (InterruptedException | IOException ex)
			{
				System.err.print("Interrupted Exception");
			}

			Platform.setImplicitExit(false);

			Platform.runLater(new Runnable(){

				@Override
				public void run(){
					Alert alert = new Alert(AlertType.INFORMATION, " " + scontrino + "\nPreferisci pagare col bancomat?", ButtonType.YES, ButtonType.NO);
		    		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
		    		alert.setTitle("Scontrino Fiscale");
		    		alert.show();
				}
			});


			testoNotizia.setText("");
			Cameriere.setVisible(false);
			nTavolo.setText("");
		}
	}
}