package lab2;

public class Exercise4 {
    Exercise4(double r , double R, double x, double y){
        System.out.println("Задание 4: --------------------------------------");
        System.out.println("r = " + r);

        System.out.println("R = " + R);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        double obj2= Math.pow(x,2) + Math.pow(y,2);
        double obj = Math.pow (obj2, 0.5);
        System.out.println("object = " + obj);
        if (obj <= r)
            System.out.println("Тревога");
        else if(obj <= R)
            System.out.println("обнаружен");
        else
            System.out.println("Не обнаружен");
    }
}
