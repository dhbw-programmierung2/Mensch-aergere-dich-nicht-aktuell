package game;

import java.util.HashMap;
import javafx.scene.image.Image;

public class FourPlayerField
{
  public int[] feld = new int[40];
  public HashMap<Integer, Image> hm = new HashMap();
  



  public FourPlayerField()
  {
    feld = fillArray(feld);
    initializeMap();
  }
  
  public void initializeMap() {
    for (int i = 0; i < feld.length; i++) {
      hm.put(Integer.valueOf(i), null);
    }
  }
  
  private int[] fillArray(int[] x)
  {
    for (int i = 0; i < x.length; i++)
    {
      x[i] = i;
    }
    
    return x;
  }
}
