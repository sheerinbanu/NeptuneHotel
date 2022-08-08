
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

	public class RoomDetailController {

	    @FXML Button accueil;
	    @FXML Button reserver;

	   
	   @FXML
	   public void retourAccueil(ActionEvent event) {
		   Main.set_Pane(0);
	   }
	    
	    
	    
	   @FXML
	   public void reserver(ActionEvent event) {
		    	
		  Main.set_Pane(2);  	

		}

	}

