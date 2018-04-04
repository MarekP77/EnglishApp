package application;
	
import java.util.Optional;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
*
* @author Marek Pospíšil
*/

public class Aplikace extends Application {
	BorderPane border;
	private String slovo = "";
	Label spravne = new Label();
	Label spatne = new Label();
	Label nazev = new Label();
	Button hadej = new Button();
	private int spravneBody; 
	private int spatneBody;
	private int volba;
		
	@Override
    public void start(Stage primaryStage) throws Exception {
       
     
        border = new BorderPane();
        border.setCenter(hlavniPanel());
        border.setBottom(nastavLabel());
        border.setRight(body());
        border.setPadding(new Insets(10,20,20,10));
        Scene scene = new Scene(border, 1000,480);

        primaryStage.setTitle("Výuka Angliètiny pro Dìti"); 
        primaryStage.setScene(scene); 
        primaryStage.sizeToScene(); 
        primaryStage.show(); 
    }
	
	private HBox hlavniPanel() {
        HBox hlavniPanel = new HBox();
        hlavniPanel.setPrefWidth(200);
        hlavniPanel.setPrefHeight(200);
        VBox sloupec = new VBox();
        VBox sloupec2 = new VBox();
        VBox sloupec3 = new VBox();
        
      //Tlaèítko míè
        Image mic = new Image(getClass().getResourceAsStream("/zdroje/ball.jpg"),200 , 200, false, false);
        Button micTlacitko = new Button("");
        micTlacitko.setTooltip(new Tooltip("Míè"));
        micTlacitko.setUserData("Ball");
        micTlacitko.setGraphic(new ImageView(mic));
        
        micTlacitko.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
        if (slovo == "mic"){
                     spravneBody++; 
                     spravne.setText(" Správné Odpovìdi: "+ spravneBody);           
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setHeaderText("Správná odpovìï!");
         alert.setContentText("Chceš hádat znovu?");
            
             Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                hadej.fire();
            } else {
                nazev.setText("Klikni na tlaèítko hádej");
            }
        }
        
        else {
            spatneBody++; 
            spatne.setText(" Špatné Odpovìdi: "+ spatneBody);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("Špatná odpovìï");
            alert.setContentText("Zkus to znovu");
            alert.showAndWait();
        }}
        });
        
        sloupec.getChildren().addAll(micTlacitko);

        
 
        hlavniPanel.getChildren().addAll(sloupec, sloupec2, sloupec3); 


        return hlavniPanel;
		}
	
	private HBox nastavLabel(){
        HBox labelPanel = new HBox();

         hadej.setText("Hádej");

         nazev.setText("Klikni na tlaèítko hádej pro zahájení hry");
         
         hadej.setOnAction(new EventHandler<ActionEvent>() {

    
     @Override
     public void handle(ActionEvent event) {
         java.util.Random random = new java.util.Random();
        volba = random.nextInt(6)+1;
       if (volba == 1){
           slovo = "mic";
           nazev.setText("Ball");
       }
       
       if (volba == 2){
           slovo = "ptak";
           nazev.setText("Bird");
       }
       
       if (volba == 3){
           slovo = "auto";
           nazev.setText("Car");
       }
       
       if (volba == 4){
           slovo = "kocka";
           nazev.setText("Cat");
       }
       
       if (volba == 5){
           slovo = "hrnek";
           nazev.setText("Cup");
       }
       
       if (volba == 6){
           slovo = "telefon";
           nazev.setText("Phone");
       }
     }
   });
         labelPanel.getChildren().addAll(hadej, nazev);
         
         return labelPanel;
    }
	
	public HBox body(){
        HBox bodyPanel = new HBox();
        VBox sloupec = new VBox();
           spravne.setText(" Správné Odpovìdi: "+ spravneBody);
        spatne.setText(" Špatné Odpovìdi: "+ spatneBody);
        
        sloupec.getChildren().addAll(spravne, spatne);
        bodyPanel.getChildren().add(sloupec);
        return bodyPanel;
    }
    public static void main(String[] args) {
       launch(args);
   }
	
	}
        
        
	
	