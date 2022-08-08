
import javafx.application.Application;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application  {
	
	static AnchorPane root;
	
	static List<AnchorPane> anchor = new ArrayList<AnchorPane>();
	
	private static int idx_cur=0;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Neptune Hotel");
		    root = (AnchorPane)FXMLLoader.load(getClass().getResource("anchor.fxml"));
		    
		    anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("HomePage.fxml")));
		    anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("RoomDetail.fxml")));
		    anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("Identifier.fxml")));
		    anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("Profil.fxml")));
		    
		    root.getChildren().add(anchor.get(0));
								
			Scene scene = new Scene(root,600,400);																						
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static AnchorPane get_Pane(int idx)
	{
		return anchor.get(idx);
	}
	
	public static void set_Pane(int idx)
	{
		root.getChildren().remove(anchor.get(idx_cur));
		root.getChildren().add(anchor.get(idx));
		idx_cur = idx;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}

