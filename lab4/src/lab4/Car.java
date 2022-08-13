package lab4;

public class Car {
    protected String reg_plate;// = "А 000 АА 00 RUS"; // регистрационный знак
    protected String brand = "Lada"; //марка
    protected T type = T.car;
    protected String color = "black";
    protected Engine engine_power; // мощность двигателя
    protected int num_wheels = 6;
    public boolean Good = true;

    Car(){}
    Car(String r,String b, T t, String c, Engine p, int n){
        reg_plate = r;
        brand = b;
        type = t;
        color = c;
        engine_power = p;
        num_wheels = n;
    }
    Car(String b, T t, String c, Engine p, int n){
        brand = b;
        type = t;
        color = c;
        engine_power = p;
        num_wheels = n;
    }

    public  void SetReg(String x){
        String reg = "[АВЕКМНОРСТУХ]\\s\\d{3}\\s[АВЕКМНОРСТУХ]{2}\\s\\d{2,3}\\s" + "RUS";
        if (x.matches(reg))
            reg_plate = x;
    }
    void SetColor(String c){
        color = c;
    }
    void SetPower(Engine p){
        engine_power = p;
    }

    public int getNum_wheels() {
        return num_wheels;
    }

    public T getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
    public Engine getEngine_power(){return engine_power;}

    public String getReg_plate() {
        return reg_plate;
    }

    public void display(){
        System.out.println(brand + " " + type + " " + Good);
    }
}

