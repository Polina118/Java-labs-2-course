package lab5_T;

public class Pair<First, Second>{
    public First first;
    public Second second;

    public Pair(){}
    public Pair(Pair<First, Second> pair){
        this.first = pair.first;
        this.second = pair.second;
    }


    public Pair(First first, Second second){
        this.first = first;
        this.second = second;
    }

    public static <First, Second> Pair make_pair(First first, Second second){
        return new Pair(first, second);
    }
}
