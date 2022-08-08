
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class HomePageController implements Initializable  {

    
	@FXML
	private Button voirDetails;
	
	@FXML
	public void voirDetails(ActionEvent event) {
		Main.set_Pane(1);
	}

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		
	}
    

}
