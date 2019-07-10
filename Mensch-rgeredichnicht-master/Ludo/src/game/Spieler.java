package game;

import java.io.PrintStream;


public class Spieler
{
  Kegel[] spieler;
  Kegel gelb;
  Kegel gruen;
  Kegel blau;
  Kegel schwarz;
  Kegel lila;
  Kegel rot;
  
  public Spieler()
  {
    spieler = new Kegel[6];
    gelb = new Kegel("/pictures/Yellow.jpg");
    gruen = new Kegel("/pictures/Green.jpg");
    blau = new Kegel("/pictures/Blue.jpg");
    schwarz = new Kegel("/pictures/Black.jpg");
    lila = new Kegel("/pictures/Purple.jpg");
    rot = new Kegel("/pictures/Red.jpg");
    
    setColor();
  }
  




  public void setColor()
  {
    spieler[0] = gelb;
    spieler[1] = gruen;
    spieler[2] = blau;
    spieler[3] = schwarz;
    spieler[4] = lila;
    spieler[5] = rot;
  }
  

  public Kegel getSpieler1bis6(int i)
  {
    if (i <= spieler.length)
    {
      return spieler[(i - 1)];
    }
    System.out.println("Spieler " + (i - 1) + " existiert nicht.");
    return null;
  }
}
