package lab5_T;

public class GPairBag<First, Second>
{
    public GPairBag(int size){
        this.bag = new PairBag(size);
    }

    public Pair<First, Second> insert(Pair<First, Second> pair){
        return (Pair<First, Second>)this.bag.insert(pair);
    }

    public Pair<First, Second> getObject(){
        return (Pair<First, Second>)this.bag.getObject();
    }

    public Pair<First, Second> delete(){
        return (Pair<First, Second>)this.bag.delete();
    }

    private PairBag bag;
}
