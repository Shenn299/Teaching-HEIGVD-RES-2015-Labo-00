
package ch.heigvd.res.lab00;

/**
 *
 * @author SEB
 */
public class Trumpet implements IInstrument {
   public String play() {
      return "pouet";      
   }
   
   public int getSoundVolume() {
      return 2;
   }
   
   public String getColor() {
      return "golden";
   }
   
}
