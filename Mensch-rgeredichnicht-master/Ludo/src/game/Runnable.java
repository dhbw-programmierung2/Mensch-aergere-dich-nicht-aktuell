package game;

import java.io.PrintStream;
import javafx.application.Application;
import javafx.stage.Stage;

public class Runnable extends Application
{
  RollTheDice rtd = new RollTheDice();
  Spieler spieler = new Spieler();
  
  public Runnable() {}
  
  public static void main(String[] args)
  {
    Runnable r = new Runnable();
    
    int zahl = r.rtd.rollTheDice();
    
    System.out.println(r.getKegelPositionSpieler(1, 1));
    r.move2(1, 1, zahl);
    System.out.println("Die Würfelzahl war " + zahl + "Die neue Position ist " + r.getKegelPositionSpieler(1, 1));
    zahl = r.rtd.rollTheDice();
    r.move2(1, 1, zahl);
    System.out.println("Die Würfelzahl war " + zahl + "Die neue Position ist " + r.getKegelPositionSpieler(1, 1));
  }
  





  public int getKegelPositionSpieler(int spieler, int kegel) { return this.spieler.getSpieler1bis6(spieler).getPosition(kegel); }
  
  public void move2(int spieler, int kegel, int wuerfelzahl) {
    int neueposition = getKegelPositionSpieler(spieler, kegel) + wuerfelzahl;
    
    this.spieler.getSpieler1bis6(spieler).setPosition(kegel, neueposition);
  }
  
  public void start(Stage arg0)
    throws Exception
  {}
}
