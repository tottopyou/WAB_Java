// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

import java.util.Comparator;

public class SortedPQ<K, V> extends AbstractPriorityQueue<K, V> {
    
    private LinkedPositionalList<Entry<K, V>> list =new LinkedPositionalList<>();
    
    //konstruktor
    public SortedPQ() {super();}
    public SortedPQ(Comparator<K> comp){super(comp);}
    
    public int size() {return list.size();}
    
    public Entry<K, V> removeMin(){
        if (list.isEmpty()) return null;
        return (Entry<K, V>) list.remove(list.first());
    }

    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K,V> newest = new PQEntry<>(key, value);

        list.addLast(newest);

        return newest;
    }
    
    public Entry<K, V> min() {
        if (list.isEmpty()) return null;
        return (Entry<K, V>) list.first().getElement();
    }

    public void printKeys() {
        System.out.println("Priority Queue Keys:");
        for (Entry<K, V> entry : list) {
            System.out.println(entry.getKey());
        }
    }

    public int take_min(){
        Position<Entry<K, V>> firstPosition = list.first();
        Entry<K, V> firstEntry = firstPosition.getElement();
        int min = (int) firstEntry.getKey();
        for (Entry<K, V> entry : list) {
            int curent_value = (int) entry.getKey();
            if (min > curent_value){
                min = (int) entry.getKey();
            }
        }
        return min;
    }


    public static void main(String[] args) {
        SortedPQ<Integer, String> pq = new SortedPQ<>();

        Integer[] data = {49, 58, 45, 81, 95, 26, 36, 75, 55, 55};

        for (Integer num : data) {
            pq.insert(num, "Value " + num);
        }
        pq.printKeys();

        System.out.println("The min value is: " + pq.take_min());
    }
}