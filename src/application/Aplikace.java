package application;
	
import java.util.Optional;
import javafx.application.Application;
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
* @author Marek Posp�il
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
        Scene scene = new Scene(border, 830,480);

        primaryStage.setTitle("V�uka Angli�tiny pro D�ti"); 
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
        
      //Tla��tko m��
        Image mic = new Image(getClass().getResourceAsStream("/zdroje/ball.jpg"),200 , 200, false, false);
        Button micTlacitko = new Button("");
        micTlacitko.setTooltip(new Tooltip("M��"));
        micTlacitko.setUserData("Ball");
        micTlacitko.setGraphic(new ImageView(mic));
        
        micTlacitko.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
        if (slovo == "mic"){
                     spravneBody++; 
                     spravne.setText(" Spr�vn� Odpov�di: "+ spravneBody);           
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setHeaderText("Spr�vn� odpov��!");
         alert.setContentText("Chce� h�dat znovu?");
            
             Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                hadej.fire();
            } else {
                nazev.setText("Klikni na tla��tko h�dej.");
            }
        }
        
        else {
            spatneBody++; 
            spatne.setText(" �patn� Odpov�di: "+ spatneBody);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("�patn� odpov��.");
            alert.setContentText("Zkus to znovu.");
            alert.showAndWait();
        }}
        });
        
      //Tla��tko pt�k
        Image ptak = new Image(getClass().getResourceAsStream("/zdroje/bird.jpg"),200 , 200, false, false);
        Button ptakTlacitko = new Button("");
        ptakTlacitko.setTooltip(new Tooltip("Pt�k"));
        ptakTlacitko.setUserData("Bird");
        ptakTlacitko.setGraphic(new ImageView(ptak));
        
        ptakTlacitko.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
        if (slovo == "ptak"){
                     spravneBody++; 
                     spravne.setText(" Spr�vn� Odpov�di: "+ spravneBody);           
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setHeaderText("Spr�vn� odpov��!");
         alert.setContentText("Chce� h�dat znovu?");
            
             Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                hadej.fire();
            } else {
                nazev.setText("Klikni na tla��tko h�dej.");
            }
        }
        
        else {
            spatneBody++; 
            spatne.setText(" �patn� Odpov�di: "+ spatneBody);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("�patn� odpov��.");
            alert.setContentText("Zkus to znovu.");
            alert.showAndWait();
        }}
        });
        
      //Tla��tko auto
        Image auto = new Image(getClass().getResourceAsStream("/zdroje/car.jpg"),200 , 200, false, false);
        Button autoTlacitko = new Button("");
        autoTlacitko.setTooltip(new Tooltip("Auto"));
        autoTlacitko.setUserData("Car");
        autoTlacitko.setGraphic(new ImageView(auto));
        
        autoTlacitko.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
        if (slovo == "auto"){
                     spravneBody++; 
                     spravne.setText(" Spr�vn� Odpov�di: "+ spravneBody);           
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setHeaderText("Spr�vn� odpov��!");
         alert.setContentText("Chce� h�dat znovu?");
            
             Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                hadej.fire();
            } else {
                nazev.setText("Klikni na tla��tko h�dej.");
            }
        }
        
        else {
            spatneBody++; 
            spatne.setText(" �patn� Odpov�di: "+ spatneBody);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("�patn� odpov��.");
            alert.setContentText("Zkus to znovu.");
            alert.showAndWait();
        }}
        });
        
      //Tla��tko ko�ka
        Image kocka = new Image(getClass().getResourceAsStream("/zdroje/cat.jpg"),200 , 200, false, false);
        Button kockaTlacitko = new Button("");
        kockaTlacitko.setTooltip(new Tooltip("Ko�ka"));
        kockaTlacitko.setUserData("Cat");
        kockaTlacitko.setGraphic(new ImageView(kocka));
        
        kockaTlacitko.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
        if (slovo == "kocka"){
                     spravneBody++; 
                     spravne.setText(" Spr�vn� Odpov�di: "+ spravneBody);           
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setHeaderText("Spr�vn� odpov��!");
         alert.setContentText("Chce� h�dat znovu?");
            
             Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                hadej.fire();
            } else {
                nazev.setText("Klikni na tla��tko h�dej.");
            }
        }
        
        else {
            spatneBody++; 
            spatne.setText(" �patn� Odpov�di: "+ spatneBody);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("�patn� odpov��.");
            alert.setContentText("Zkus to znovu.");
            alert.showAndWait();
        }}
        });
        
      //Tla��tko hrnek
        Image hrnek = new Image(getClass().getResourceAsStream("/zdroje/cup.jpg"),200 , 200, false, false);
        Button hrnekTlacitko = new Button("");
        hrnekTlacitko.setTooltip(new Tooltip("Hrnek"));
        hrnekTlacitko.setUserData("Cup");
        hrnekTlacitko.setGraphic(new ImageView(hrnek));
        
        hrnekTlacitko.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
        if (slovo == "hrnek"){
                     spravneBody++; 
                     spravne.setText(" Spr�vn� Odpov�di: "+ spravneBody);           
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setHeaderText("Spr�vn� odpov��!");
         alert.setContentText("Chce� h�dat znovu?");
            
             Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                hadej.fire();
            } else {
                nazev.setText("Klikni na tla��tko h�dej.");
            }
        }
        
        else {
            spatneBody++; 
            spatne.setText(" �patn� Odpov�di: "+ spatneBody);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("�patn� odpov��.");
            alert.setContentText("Zkus to znovu.");
            alert.showAndWait();
        }}
        });
        
      //Tla��tko telefon
        Image telefon = new Image(getClass().getResourceAsStream("/zdroje/phone.jpg"),200 , 200, false, false);
        Button telefonTlacitko = new Button("");
        telefonTlacitko.setTooltip(new Tooltip("Telefon"));
        telefonTlacitko.setUserData("Phone");
        telefonTlacitko.setGraphic(new ImageView(telefon));
        
        telefonTlacitko.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
        if (slovo == "telefon"){
                     spravneBody++; 
                     spravne.setText(" Spr�vn� Odpov�di: "+ spravneBody);           
         Alert alert = new Alert(AlertType.CONFIRMATION);
         alert.setHeaderText("Spr�vn� odpov��!");
         alert.setContentText("Chce� h�dat znovu?");
            
             Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                hadej.fire();
            } else {
                nazev.setText("Klikni na tla��tko h�dej.");
            }
        }
        
        else {
            spatneBody++; 
            spatne.setText(" �patn� Odpov�di: "+ spatneBody);
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText("�patn� odpov��.");
            alert.setContentText("Zkus to znovu.");
            alert.showAndWait();
        }}
        });
        
      sloupec.getChildren().addAll(micTlacitko, ptakTlacitko);
      sloupec2.getChildren().addAll(autoTlacitko, kockaTlacitko);
      sloupec3.getChildren().addAll(hrnekTlacitko, telefonTlacitko);
      hlavniPanel.getChildren().addAll(sloupec, sloupec2, sloupec3); 

        return hlavniPanel;
		}
	
	private HBox nastavLabel(){
        HBox labelPanel = new HBox();

         hadej.setText("H�dej");

         nazev.setText("   Klikni na tla��tko h�dej pro zah�jen� hry.");
         
         hadej.setOnAction(new EventHandler<ActionEvent>() {

    
     @Override
     public void handle(ActionEvent event) {
         java.util.Random random = new java.util.Random();
        volba = random.nextInt(6)+1;
       if (volba == 1){
           slovo = "mic";
           nazev.setText("  Ball");
       }
       
       if (volba == 2){
           slovo = "ptak";
           nazev.setText("  Bird");
       }
       
       if (volba == 3){
           slovo = "auto";
           nazev.setText("  Car");
       }
       
       if (volba == 4){
           slovo = "kocka";
           nazev.setText("  Cat");
       }
       
       if (volba == 5){
           slovo = "hrnek";
           nazev.setText("  Cup");
       }
       
       if (volba == 6){
           slovo = "telefon";
           nazev.setText("  Phone");
       }
     }
   });
         labelPanel.getChildren().addAll(hadej, nazev);
         
         return labelPanel;
    }
	
	public HBox body(){
        HBox bodyPanel = new HBox();
        VBox sloupec = new VBox();
           spravne.setText(" Spr�vn� Odpov�di: "+ spravneBody);
        spatne.setText(" �patn� Odpov�di: "+ spatneBody);
        
        sloupec.getChildren().addAll(spravne, spatne);
        bodyPanel.getChildren().add(sloupec);
        return bodyPanel;
    }
    public static void main(String[] args) {
       launch(args);
   }
	
}
        
        
	
	