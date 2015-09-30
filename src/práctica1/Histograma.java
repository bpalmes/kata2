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
public class Histograma {
    private final int v[];

    public Histograma(int[] v) {
        this.v = v;
    }

    public int[] getV() {
        return v;
    }
    public HashMap<Integer,Integer>  getHisto(){
        HashMap <Integer,Integer> histo = new HashMap();
        for(int i = 0; i < v.length; i++){
            if(histo.get(v[i])== null){
               histo.put(v[i], 0);
            }else{
                histo.put(v[i],histo.get(v[i])+1);
            }
        }
        return histo;
    }
}
