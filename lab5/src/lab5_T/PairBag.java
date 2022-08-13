package lab5_T;

public class PairBag {

    public PairBag(int size){
        this.bag = new Bag(size);
    }

    public Pair insert(Pair pair){
        return (Pair)this.bag.insert(pair);
    }

    public Object getObject(){
        return (Pair)this.bag.getObject();

    }

    public Object delete(){
        return (Pair)this.bag.delete();
    }

    private Bag bag;
}
