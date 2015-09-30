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
         Integer[] v1 = {1,1,1,1,4,4,2,2,2,101,-4};
         String[] v2 = {"Victor", "Juan", "Juan","Pedro","Victor"};
         Histograma h = new Histograma(v1);
         Histograma h2 = new Histograma(v2);
         System.out.print(h.getHisto());
         System.out.print(h2.getHisto());
         

    }



}
