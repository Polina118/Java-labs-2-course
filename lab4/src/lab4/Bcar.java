package lab4;

public class Bcar extends Car{
    final int places;

    Bcar(){
        super();
        places = 20;
    }
    Bcar(String r,String b, T t, String c, Engine p, int n, int pl){
        super(r,b,t, c ,p, n);
        places = pl;
    }

    Bcar(String b, T t, String c, Engine p, int n, int pl){
        super(b, t, c, p, n);
        places = pl;
    }
}
