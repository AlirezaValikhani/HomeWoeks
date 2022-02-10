package exerciseFour;

import java.util.ArrayList;

public class MyMap<K,V> {
    private ArrayList<Entry<K,V>> entries = new ArrayList<>();


    public void put(K k, V v){
        Entry<K,V> i = new Entry<>(k,v);
        entries.add(i);
    }

    public Boolean containsKey(K k){
        for (Entry e:entries) {
            if(e.getKey().equals(k)){
                return true;
            }else return false;
        }
        return false;
    }

    public Boolean isEmpty(){
        return entries.isEmpty();
    }

    public void showValues(){
        for (Entry e:entries) {
            System.out.println(e.getValue());
        }
    }

    public void replace(K key,V newValue){
        for (Entry e:entries) {
            if (e.getKey().equals(key)) {
                entries.remove(e);
                Entry<K,V> e2 = new Entry<>(key,newValue);
                entries.add(e2);
            }
        }
    }
}
