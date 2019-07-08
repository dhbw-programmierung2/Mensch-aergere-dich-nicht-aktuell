package game;

import launcher.LauncherController;


/**
 * Diese Klasse ist zust�ndig zu regeln, welcher Spieler anf�ngt 
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 *
 */
public class Beginning {
	
	/*
	 * Jeder Spieler bekommt einen Wurf.
	 * Derjenige mit der h�chsten Zahl darf beginnen
	 */
	public static void ersterZug() {
		
		/*
		 * Anzal wie oft in diser Runde gew�rfelt wird
		 */
		int durchlauf = LauncherController.numberOfPlayers;
		
		/*
		 * Array in denen die Werte jedes W�rfelzugs gespeichert werden
		 */
		int[] test = new int[6];
		
		/*
		 * Anzahl der Durchl�ufe w�rfeln
		 */
		for (int i = 0; i <= durchlauf; i++) {
			
			RollTheDice rtd = new RollTheDice();
			int x = rtd.rollTheDice();		
			
			test[i] = x;
			
		}
        
		/*
		 * H�chste gew�rfelte Zahl ermitteln
		 */
        int max = test[0]; 
       
        for (int i = 1; i < test.length; i++) 
            if (test[i] > max) 
                max = test[i]; 
       
       
        /*
         * Checken an welcher Position die h�chste Zahl war
         * Wird dem Spieler zugewiesen
         */
        if (test[0] == max) {
			/*
			 * Spieler 1 f�ngt an
			 */
		}
        else if (test[1] == max) {
			/*
			 * Spieler 2 f�ngt an
			 */
		}
        else if (test[2] == max) {
			/*
			 * Spieler 3 f�ngt an
			 */
		}
        else if (test[3] == max) {
        	/*
        	 * Spieler 4 f�ngt an
        	 */
        }
        else if (test[4] == max) {
        	/*
        	 * Spieler 5 f�ngt an
        	 */
        }
        else if (test[5] == max) {
        	/*
        	 * Spieler 6 f�ngt an
        	 */
        
		}
	}
}
		
			
		
	

