package lab2;

public class Lab2 {

    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        Exercise2 ex2 = new Exercise2();
        double r = Double.parseDouble(args[0]);
        double R = Double.parseDouble(args[1]);
        double x = Double.parseDouble(args[2]);
        double y = Double.parseDouble(args[3]);
        Exercise3 ex3 = new Exercise3();
        Exercise4 ex4 = new Exercise4(r, R, x, y);
        Exercise5 ex5 = new Exercise5(r);
        Exercise6 ex6 = new Exercise6();
        Exercise7 ex7 = new Exercise7();
        Exercise9 ex9 = new Exercise9();
        Exercise10 ex10 = new Exercise10();
    }
}
