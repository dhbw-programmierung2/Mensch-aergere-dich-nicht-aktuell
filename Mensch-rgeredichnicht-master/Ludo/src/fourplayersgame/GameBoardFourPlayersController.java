package fourplayersgame;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.SplitPane;

import java.util.ArrayList;
import java.util.Random;

import game.RollTheDice;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.TouchEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;

import javafx.scene.shape.Circle;
import launcher.LauncherController;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

/**
 * Diese Klasse enthält das Spielfeld für 4 Spieler
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 *
 */
public class GameBoardFourPlayersController {
	@FXML
	public SplitPane splitPane;
	public GridPane gridPaneLeft;
	public Circle crcBeginYellow1;
	public Circle crcBeginYellow2;
	public Circle crcBeginYellow3;
	public Circle crcBeginYellow4;
	public Circle crcBeginBlack3;
	public Circle crcBeginBlack1;
	public Circle crcBeginBlack4;
	public Circle crcBeginBlack2;
	public Circle crcBeginRed4;
	public Circle crcBeginRed3;
	public Circle crcBeginRed1;
	public Circle crcBeginRed2;
	public Circle crcBeginGreen1;
	public Circle crcBeginGreen2;
	public Circle crcBeginGreen3;
	public Circle crcBeginGreen4;
	public Circle crcField31;
	public Circle crcField30;
	public Circle crcField29;
	public Circle crcField32;
	public Circle crcAimBlack1;
	public Circle crcField28;
	public Circle crcField33;
	public Circle crcAimBlack2;
	public Circle crcField27;
	public Circle crcField34;
	public Circle crcAimBlack3;
	public Circle crcField26;
	public Circle crcField35;
	public Circle crcAimBlack4;
	public Circle crcField25;
	public Circle crcField36;
	public Circle crcField37;
	public Circle crcField38;
	public Circle crcField39;
	public Circle crcField40;
	public Circle crcField1;
	public Circle crcAimYellow1;
	public Circle crcField2;
	public Circle crcAimYellow2;
	public Circle crcField3;
	public Circle crcAimYellow3;
	public Circle crcAimYellow4;
	public Circle crcField4;
	public Circle crcField5;
	public Circle crcAimGreen4;
	public Circle crcField15;
	public Circle crcField6;
	public Circle crcAimGreen3;
	public Circle crcField14;
	public Circle crcField7;
	public Circle crcAimGreen2;
	public Circle crcField13;
	public Circle crcField8;
	public Circle crcAimGreen1;
	public Circle crcField12;
	public Circle crcField9;
	public Circle crcField10;
	public Circle crcField11;
	public Circle crcField24;
	public Circle crcField23;
	public Circle crcField22;
	public Circle crcField21;
	public Circle crcAimRed3;
	public Circle crcAimRed2;
	public Circle crcAimRed1;
	public Circle crcField20;
	public Circle crcField16;
	public Circle crcAimRed4;
	public Circle crcField17;
	public Circle crcField18;
	public Circle crcField19;
	public GridPane gridPaneRigth;
	public Button btnRollTheDice;
	public ImageView imgDice;
	public TextField txtPlayer1;
	public TextField txtPlayer2;
	public TextField txtPlayer3;
	public TextField txtPlayer4;
	public Button btnExitGame;

	/**
	 * Methode die das Spielfeld initialisiert
	 * 
	 * @param playerName Enthält die Namen der Spieler
	 * @param color Enthält die Farben der jeweiligen Spieler
	 * @param rival Enthält ob es sich um einen Computer oder Mensch handelt
	 * @param numberOfPlayers Enthält die Anzahl der Spieler
	 */
	public void initialize(ArrayList<String> playerName, ArrayList<String> color, ArrayList<String> rival, int numberOfPlayers) {
		
		// Zum Testen
		System.out.println(playerName);
		System.out.println(color);
		System.out.println(rival);
		System.out.println(numberOfPlayers);
		
		/*
		 * Anzeigen der Spielernamen und ihrer jeweiligen Farbe
		 */
		txtPlayer1.setText(playerName.get(0) + " - " + color.get(0));
		txtPlayer2.setText(playerName.get(1) + " - " + color.get(1));
		if(numberOfPlayers == 4) {
			txtPlayer3.setText(playerName.get(2) + " - " + color.get(2));
			txtPlayer4.setText(playerName.get(3) + " - " + color.get(3));
		}		
		

    //   imgDice.setImage(new Image ("/Dice1.png"));
		
		/*
		 * check ob Farbe Grün ausgewählt wurde.
		 * Definiert Basis für grün
		 */
		if(color.contains("Grün")) {
			
			crcBeginGreen1.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		     
			crcBeginGreen2.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
		    
			crcBeginGreen3.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
			
			crcField11.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
			
			populateGreen();
		}
		
		/*
		 * check ob Farbe Gelb ausgewählt wurde.
		 * Definiert Basis für Gelb
		 */
		if(color.contains("Gelb")) {
			
			crcBeginYellow1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
		  
			crcBeginYellow2.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			
			crcBeginYellow3.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			
			crcField1.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			
			populateYellow();
		}
		
		/*
		 * check ob Farbe Schwarz ausgewählt wurde.
		 * Definiert Basis für Schwarz
		 */
		if(color.contains("Schwarz")) {
			
			crcBeginBlack1.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		       
			crcBeginBlack2.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		      
			crcBeginBlack3.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		       
			crcField31.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
			
			populateBlack();
		}
		
		/*
		 * Check ob Farbe Rot ausgewählt wurde.
		 * Definiert Basis für Rot
		 */
		if(color.contains("Rot")) {
			
			crcBeginRed1.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
			crcBeginRed2.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));

			crcBeginRed3.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
		       
			crcField21.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
			
			populateRed();
		}
		
		
	}
	
	/*
	 * Setzt die roten Spielfiguren in die rote Basis
	 */
	public void populateRed() {
		Image im4 = new Image("/pictures/Red.jpg", false);
		crcBeginRed1.setFill(new ImagePattern(im4));
		crcBeginRed2.setFill(new ImagePattern(im4));
		crcBeginRed3.setFill(new ImagePattern(im4));
		
		crcField21.setFill(new ImagePattern(im4));
	}
	
	/*
	 * Setzt die schwarzen Spielfiguren in die schwarze Basis
	 */
	public void populateBlack() {
		Image im3 = new Image("/pictures/Black.jpg", false);
		crcBeginBlack1.setFill(new ImagePattern(im3));
		crcBeginBlack2.setFill(new ImagePattern(im3));
		crcBeginBlack3.setFill(new ImagePattern(im3));
		crcField31.setFill(new ImagePattern(im3));
	}
	
	/*
	 * Setzt die gelben Spielfiguren in die gelbe Basis
	 */
	public void populateYellow() {
		Image im2 = new Image("/pictures/Yellow.jpg", false);
		crcBeginYellow1.setFill(new ImagePattern(im2));
		crcBeginYellow2.setFill(new ImagePattern(im2));
		crcBeginYellow3.setFill(new ImagePattern(im2));
		crcField1.setFill(new ImagePattern(im2));
	}
	
	/*
	 * Setzt die grünen Spielfiguren in die grüne Basis
	 */
	public void populateGreen() {
		Image im1 = new Image("/pictures/Green.jpg", false);
		crcBeginGreen1.setFill(new ImagePattern(im1));
		crcBeginGreen2.setFill(new ImagePattern(im1));
		crcBeginGreen3.setFill(new ImagePattern(im1));
		crcField11.setFill(new ImagePattern(im1));
	}
	
	/*
	 *  Event Listener für 
	 */
	@FXML
	public void circleOnActionM(MouseEvent event) {
		// TODO Autogenerated
	}
	
	/*
	 *  Event Listener on Circle[#crcBeginYellow1].onTouchPressed
	 */
	@FXML
	public void circleOnActionT(TouchEvent event) {
		// TODO Autogenerated
	}
	
	/*
	 *  Event Listener für den Button Würfeln
	 *  Dieser ruft die Mehtode rollTheDice auf
	 */
	@FXML
	public void buttonRollTheDiceOnAction(ActionEvent event) {
		
		RollTheDice rtd = new RollTheDice();
		int value = rtd.rollTheDice();
		//lblPlayer.setText(String.valueOf(value));

		/*
		 * Bilder der sechs Würfel
		 */
		Image dice1 = new Image("/pictures/Dice1.png", false);
		Image dice2 = new Image("/pictures/Dice2.png", false);
		Image dice3 = new Image("/pictures/Dice3.png", false);
		Image dice4 = new Image("/pictures/Dice4.png", false);
		Image dice5 = new Image("/pictures/Dice5.png", false);
		Image dice6 = new Image("/pictures/Dice6.png", false);
		
		
		/*
		 * Ändern des Würfel bildes zu der gewürfelten Zahl
		 */
		switch (value) {
		case 1:
			imgDice.setImage(dice1);
			break;
		case 2:
			imgDice.setImage(dice2);
			break;
		case 3:
			imgDice.setImage(dice3);
			break;
		case 4:
			imgDice.setImage(dice4);
			break;
		case 5:
			imgDice.setImage(dice5);
			break;
		case 6:
			imgDice.setImage(dice6);
			break;
		default: imgDice.setImage(dice1);
			break;
		}
		/*
		 * Man darf nur einmal Würfeln und muss danach ziehen
		 */
		if (event.getSource()==btnRollTheDice) {
			
				btnRollTheDice.setDisable(true);
				if (/*spieler hat gezogen*/ 
						//circleOnActionM(event);
						true) {
					
					btnRollTheDice.setDisable(false);
				}
			
				
			}
	}
	
	/*
	 *  Event Listener für den Beenden Button.
	 *  Dieser Beendet das Programm
	 */
	@FXML
	public void buttonExitGameOnAction(ActionEvent event) {

		System.exit(0);
	}
}
