package lab4;

public class Scar extends Car{

    double water;

    Scar(){
        super();
    }
    Scar(String r,String b, T t, String c, Engine p, int n, double w){
        super(r,b,t, c ,p, n);
        water = w;}

    Scar(String b, T t, String c, Engine p, int n, double w){
        super(b, t, c, p, n);
        water = w;
    }

    @Override
    public void SetReg(String x) {
        String reg = "[АБВГДЕЖЗИКЛ]\\s\\d{3}\\s[АБВГДЕЖЗИКЛ]{2}\\s\\d{2,3}\\s"+ " FIRE";
        if (x.matches(reg))
            reg_plate = x;
    }

}
