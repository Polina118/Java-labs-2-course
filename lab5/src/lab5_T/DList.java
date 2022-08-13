package lab5_T;

import java.util.ArrayList;

public class DList<T1, Iterable> {
    private ArrayList<T1> keys;
    private ArrayList<Iterable> values;
    private int count;
    private int size;

    public DList(int size){
        this.keys = new ArrayList<>(size);
        this.values = new ArrayList<>(size);
        this.size = size;
    }

    public int pushBack(T1 key, Iterable value){
        keys.add(key);
        values.add(value);
        count++;
        return keys.indexOf(key);
    }

    public int indexOf(T1 key){
        return keys.indexOf(key);
    }

    public Iterable remove(T1 key){
        int index = this.indexOf(key);
        return this.remove(index);
    }

    public Iterable remove(int index){
        keys.remove(index);
        return values.remove(index);
    }

    public Iterable getByIndex(int index){
        return values.get(index);
    }

    public T1 getKeyByIndex(int index){
        return keys.get(index);
    }

    public Iterable getByKey(T1 key){
        return values.get(keys.indexOf(key));
    }

    public int getCount(){
        return count;
    }

}

