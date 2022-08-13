package lab4;

public class Ecar extends Car{
    int speed;

    Ecar(){
        super();
    }

    Ecar(String r,String b, T t, String c, Engine p, int n, int s){
        super(r,b,t, c ,p, n);
        speed = s;
    }

    Ecar(String b, T t, String c, Engine p, int n, int s){
        super(b, t, c, p, n);
        speed = s;
    }
}
