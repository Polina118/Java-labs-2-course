package lab5_T;

public class Bag {
    private Object[] data;
    private int size;
    private int count;

    public Bag(int size){
        data = new Object[size];
        this.size = size;
    }

    public final Object insert(Object object){
        if(count == size){
            return null;
        }
        count++;
        int position = (int)Math.round(Math.random()*(size-1));
        while (data[position] != null){
            position = (int)Math.round(Math.random()*(size-1));
        }
        data[position] = object;
        return object;

    }

    public Object getObject(){
        int position = (int)Math.round(Math.random()*(size-1));
        while (data[position] == null){
            position = (int)Math.round(Math.random()*(size-1));
        }
        return data[position];
    }

    public Object delete(){
        if(count == 0) return null;
        int position = (int)Math.round(Math.random()*(size-1));
        while (data[position] == null){
            position = (int)Math.round(Math.random()*(size-1));
        }
        Object out = data[position];
        data[position] = null;
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
