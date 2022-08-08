

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProfilController {

    @FXML
    private Button accueil;

   

   

    @FXML
    void retourAccueil(ActionEvent event) {

    	 Main.set_Pane(0);
    }

}
