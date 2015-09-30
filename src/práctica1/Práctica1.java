/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1;
import java.util.HashMap;
/**
 *
 * @author usuario
 */
public class Práctica1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
         int[] v1 = {1,1,1,1,4,4,2,2,2,101,-4};
        // HashMap hm <Integer, Integer> = new HashMap();
         Histograma h = new Histograma(v1);
         System.out.print(h.getHisto());

    }



}
