package game;

import launcher.LauncherController;


/**
 * Diese Klasse ist zuständig zu regeln, welcher Spieler anfängt 
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 *
 */
public class Beginning {
	
	/*
	 * Jeder Spieler bekommt einen Wurf.
	 * Derjenige mit der höchsten Zahl darf beginnen
	 */
	public static void ersterZug() {
		
		/*
		 * Anzal wie oft in diser Runde gewürfelt wird
		 */
		int durchlauf = LauncherController.numberOfPlayers;
		
		/*
		 * Array in denen die Werte jedes Würfelzugs gespeichert werden
		 */
		int[] test = new int[6];
		
		/*
		 * Anzahl der Durchläufe würfeln
		 */
		for (int i = 0; i <= durchlauf; i++) {
			
			RollTheDice rtd = new RollTheDice();
			int x = rtd.rollTheDice();		
			
			test[i] = x;
			
		}
        
		/*
		 * Höchste gewürfelte Zahl ermitteln
		 */
        int max = test[0]; 
       
        for (int i = 1; i < test.length; i++) 
            if (test[i] > max) 
                max = test[i]; 
       
       
        /*
         * Checken an welcher Position die höchste Zahl war
         * Wird dem Spieler zugewiesen
         */
        if (test[0] == max) {
			/*
			 * Spieler 1 fängt an
			 */
		}
        else if (test[1] == max) {
			/*
			 * Spieler 2 fängt an
			 */
		}
        else if (test[2] == max) {
			/*
			 * Spieler 3 fängt an
			 */
		}
        else if (test[3] == max) {
        	/*
        	 * Spieler 4 fängt an
        	 */
        }
        else if (test[4] == max) {
        	/*
        	 * Spieler 5 fängt an
        	 */
        }
        else if (test[5] == max) {
        	/*
        	 * Spieler 6 fängt an
        	 */
        
		}
	}
}
		
			
		
	

