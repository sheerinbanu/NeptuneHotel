


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import img.ConnecteurDataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProfilController {

    @FXML
    private Button accueil;
    
    @FXML
    private Button valider;
    
    @FXML
    private TextField nom;
    
    @FXML
    private TextField prenom;
    
    @FXML
    private TextField email;
    
    @FXML
    private TextField adresse;
    
    @FXML
    private TextField tel;
    
    @FXML
    private Label nomLabel;
    
    
    @FXML
    void valider(ActionEvent event) throws SQLException{

    	ConnecteurDataBase connecteurDB = new ConnecteurDataBase();
    	Connection connection = connecteurDB.getConnection();
    	
    	String sql = "INSERT INTO clients (adresse,tel,nom,prenom,email) VALUES('"+adresse.getText()+"','"+Integer.parseInt(tel.getText())+"','"+nom.getText()+"','"+prenom.getText()+"','"+email.getText()+"')";
    	java.sql.Statement statement = connection.createStatement();
    	 statement.executeUpdate(sql);
    	
    	
    	
    	//nomLabel.setText();
    }
    
    

   

   

    @FXML
    void retourAccueil(ActionEvent event) {

    	 Main.set_Pane(0);
    }

}
