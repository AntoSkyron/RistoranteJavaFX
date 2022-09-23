import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class LineaChefController {

    @FXML
    private Text nome_chef;

    @FXML
    private Text settore;

    @FXML
    private TextArea lista;


    public void SettaggioTesti(String nome, String sett , String elenco){
    	nome_chef.setText(nome);
    	settore.setText(sett);
    	lista.setText(elenco);
    }







}
