import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class identifierController {
	
	 @FXML
	 private Button accueil;
	 
	 @FXML
	 private Button jeCreeCompte;

	 @FXML
	 public void retourAccueil(ActionEvent event) {
		    	
		 Main.set_Pane(0);

		    }
	 
	 @FXML
	 public void jeCreeCompte(ActionEvent event) {
		
		 Main.set_Pane(3);
	 }

}
