package game;

import java.util.Random;

import javafx.scene.image.Image;

/**
 * Diese Klasse ist f�r das W�rfel verantwortlich
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 */
public class RollTheDice {

	// Variable enth�lt die gew�rfelte Zahl
	public int cubeNumber;
	
	/*
	 * Diese Methode w�rfelt eine Zahl zwischen 1 und 6
	 */
	public void rollTheDice() {
		Random random = new Random();
		cubeNumber = random.nextInt(6)+1;
		
		/**if(cubeNumber == 1) {
			Image im = new Image("/GameBoardFourPlayers.Pictures/Dice1.png", true);
			imgDice.setImage(im);
		}
		else if(cubeNumber == 2) {
			Image im = new Image("/GameBoardFourPlayers.Pictures/Dice2.png", true);
			imgDice.setImage(im);
		}
		else if(cubeNumber == 3) {
			Image im = new Image("/GameBoardFourPlayers.Pictures/Dice3.png", true);
			imgDice.setImage(im);
		}
		else if(cubeNumber == 4) {
			Image im = new Image("/GameBoardFourPlayers.Pictures/Dice4.png", true);
			imgDice.setImage(im);
		}
		else if(cubeNumber == 5) {
			Image im = new Image("/GameBoardFourPlayers.Pictures/Dice5.png", true);
			imgDice.setImage(im);
		}
		else {
			Image im = new Image("/GameBoardFourPlayers.Pictures/Dice6.png", true);
			imgDice.setImage(im);
		}*/
	}
	

}
