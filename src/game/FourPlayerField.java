package game;

import java.util.HashMap;

public class FourPlayerField {
	public int[] feld= new int[40];
	public HashMap <Integer, Token>hm = new HashMap<>();
	
	public FourPlayerField() {
		feld = fillArray(feld);
		initializeMap();
		
	}
	public void initializeMap() {
		for(int i = 0; i<feld.length;i++) {
		hm.put(i,null);
		
		}
	}
	private int[] fillArray(int[] x) {
		
		for(int i = 0; i<x.length; i++) {
		
			x[i]=i;
			
		}
		return x; 
	}
}
