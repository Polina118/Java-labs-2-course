package lab4;

public class Test
{
    public static void main(String[] args) {
//        System.out.println("Задание 1 -------------------------------------------------");
//        Car car = new Car();
//        Car bus = new Car("Toyota", T.bus,"yellow",new Engine(),8);
//        Car truck = new Car("mers",T.truck,"white",new Engine(),8);
//        car.SetReg("| 325 РО 345 RUS");
//        System.out.println(car.getReg_plate());

        System.out.println("Задание 2 -------------------------------------------------");
//        Complex z1 = new Complex();
//        z1.PrintA();
//        Complex z2 =  new Complex(3,4);
//        Complex z3 = z2.conjugate(); //комплексно сопряженное
//        Complex z4 = z3.Sum(z2);
//        z4.PrintA();
//        z2.equals(z3);
//        z2.PrintT();
//        System.out.println("Задание 2-3 -------------------------------------------------");
//        Complex_user z1 = new Complex_user(2.6, 7.3);
//        Complex_user z2 = new Complex_user(4, 1.4);
//        z1.printAlgebraic();
//        z2.printComplexSopr();
//        z2.printTrigonom();
//        System.out.println(z1.equ(z2));
//        System.out.println(z1.equ(z1));
//        Complex_user z3 = new Complex_user().add(z1, z2);
//        z3.printAlgebraic();
//        Complex_user z4 = new Complex_user().sub(z1, z2);
//        z4.printAlgebraic();
//        Complex_user z5 = new Complex_user().div(z2, z3);
//        z5.printAlgebraic();
//        Complex_user z6 = new Complex_user().mul(z3, z1);
//        z6.printAlgebraic();
//        ComplexPerem cTest = new ComplexPerem();
//        cTest.expZ(z1);
//        Complex_user z7 = new Complex_user(2.6, 0);
//        double d = 0.1;
//        double testD1 = z1.operationWithDouble(d, "+", 1);
//        double testD2 = z7.operationWithDouble(d, "+", 1);
//        System.out.println(testD2);
//        System.out.println("-----------------ComplPerem-------------");
//        Complex_user z8 = new Complex_user(1,-1);
//        Complex_user z9 = new Complex_user(1,-1);
//        Complex_user z10 = new Complex_user(1,-1);
//        Complex_user z11 = new Complex_user(1,-1);
//        Complex_user z12 = new Complex_user(1,-1);
//        Complex_user z14 = new Complex_user(1,-1);
//        Complex_user z15 = new Complex_user(1,-1);
//        Complex_user z16 = new Complex_user(1,-1);
//        Complex_user z17 = new Complex_user(1,-1);
//        z8.printAlgebraic();
//        z8 = ComplexPerem.expZ(z8);
//        z8.printAlgebraic();
//        z9 = ComplexPerem.sinZ(z9);
//        z9.printAlgebraic();
//        z10 = ComplexPerem.cosZ(z10);
//        z10.printAlgebraic();
//        z11 = ComplexPerem.tanZ(z11);
//        z11.printAlgebraic();
//        z12 = ComplexPerem.arcTanZ(z12);
//        z12.printAlgebraic();
//        z14 = ComplexPerem.shZ(z14);
//        z14.printAlgebraic();
//        z15 = ComplexPerem.chZ(z15);
//        z15.printAlgebraic();
//        z16 = ComplexPerem.thZ(z16);
//        z16.printAlgebraic();
//        z17 = ComplexPerem.cthZ(z17);
//        z17.printAlgebraic();
//        z17 = ComplexPerem.eIX(4);
//        z17.printAlgebraic();

        System.out.println("Задание 4 -------------------------------------------------");
//        Engine engine = new Engine(123,450,30.5,5.6,"type",2);
//        bus.SetPower(engine);
//        System.out.println(bus.getEngine_power().power);

        System.out.println("Задание 5 -------------------------------------------------");
//        Ecar c = new Ecar();
//        Bcar b = new Bcar();
//        Tcar t = new Tcar();
//        Scar s = new Scar();

        System.out.println("Задание 7 -------------------------------------------------");//-
//        AutoBase autoBase = new AutoBase(10);
//        autoBase.AddBase(car);
//        autoBase.AddBase(bus);
//        autoBase.AddBase(truck);
//        autoBase.isGood(s);
//        c.Good = false;
//        autoBase.isGood(c);
//        autoBase.AddVoyage(b);
//        autoBase.AddVoyage(t);
//        autoBase.display();
//        System.out.println();
//        autoBase.ReturnFromVoyage(t);
//        autoBase.ReturnFromRepair(c);
//        autoBase.display();

        System.out.println("Задание 8-9 -------------------------------------------------");
        Line line1 = new Line(Line.COLOR.RED, "x^2", new Func() {
            public double F(double x_temp) {
                return x_temp * x_temp;
            }
        });
        Line line2 = new Line(Line.COLOR.BLUE, "x", new Func() {
            public double F(double x_temp) {
                return x_temp;
            }
        });
        Line line3 = new Line(Line.COLOR.GREEN, "2^x", new Func() {
            public double F(double x_temp) {
                return Math.pow(2.0D, x_temp);
            }
        });
        graphic field1 = new graphic(10, 10, -10, 10, -5, 10);
        field1.AddLine(line1);
        field1.AddLine(line2);
        field1.AddLine(line3);
        field1.AddLine(line3);
        field1.printInfo();
        field1.RemoveLastLine();
        Line line4 = new Line();
        field1.AddLine(line4);
        field1.setFunc(3, "cos(x)", new Func() {
            public double F(double x_temp) {
                return Math.cos(x_temp);
            }
        });
        field1.setScaleOX(15);
        field1.setScaleOX(20);
        field1.setLineColor(Line.COLOR.BROWN, 2);
        field1.printInfo();
    }
}
