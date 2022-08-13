package lab5_T;

import java.util.ArrayList;

public class GenericPairBag<First, Second>{
    private ArrayList<Pair<First, Second>> data;
    private int size;
    private int count;

    public GenericPairBag(int size){
        this.size = size;
        this.data = new ArrayList<>(size);
    }

    public final Pair<First, Second> insert(Pair<First, Second> pair){

        count++;
        if(count == size){
            return null;
        }
        data.add(pair);
        return pair;

    }

    public Pair<First, Second> getPair(int position){
        if(position >= count)
            return null;
        return data.get(position);
    }

    public Pair<First, Second> delete(){
        if(count == 0) return null;

        int position = (int)Math.round(Math.random()*(count-1));

        Pair<First, Second> out = data.get(position);
        data.remove(position);
        count--;

        return out;
    }

    public final int getCount(){
        return count;
    }

    public final int getSize(){
        return count;
    }


}
