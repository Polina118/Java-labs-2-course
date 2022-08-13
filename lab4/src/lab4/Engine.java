package lab4;

class Engine {
    protected int ser_number;
    protected int power;
    protected double volume;
    protected double consumption;
    protected String type_fuel;
    protected int num_cyldrs;

    Engine(){}

    Engine(int snum, int p, double v, double c, String t, int numc){
        ser_number=snum;
        power =p;
        volume = v;
        consumption = c;
        type_fuel = t;
        num_cyldrs = numc;
    }

    int GetSnum(){return ser_number;}

    int GetPower(){return power;}

    double GetVolume(){return volume;}

    double GetCosumption(){return consumption;}

    String GetTypeFuel(){return type_fuel;}

    int GetNCyldrs(){return num_cyldrs;}
}
