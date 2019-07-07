package game;


public class Runnable {

	FourPlayerField fpf= new FourPlayerField();
	
	
	
	public void move(Token t,int zahl) {
		try {
		fpf.hm.containsKey(t.getPosition()) ;
			int wanderung = t.getPosition()+zahl;
			fpf.hm.remove(t.getPosition());
			fpf.hm.put(wanderung,t);
			t.setPosition(wanderung);
			
			
		}catch(IndexOutOfBoundsException e) {
		System.out.println("Jetzt ist der Token im Ziel");
	}

	}
}
