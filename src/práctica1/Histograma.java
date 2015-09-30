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
public class Histograma<T> {
    private final T v[];

    public Histograma(T[] v) {
        this.v = v;
    }

    public T[] getV() {
        return v;
    }
    public HashMap<T,Integer>  getHisto(){
        HashMap <T,Integer> histo = new HashMap();
        for(int i = 0; i < v.length; i++){
            if(histo.get(v[i])== null){
               histo.put(v[i], 1);
            }else{
                histo.put(v[i],histo.get(v[i])+1);
            }
        }
        return histo;
    }
}
