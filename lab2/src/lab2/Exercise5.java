package lab2;

public class Exercise5 {
    Exercise5(double d1)
    {
        int d = (int) d1;
        System.out.println("Задание 5: --------------------------------------");
        System.out.println("Целое десятичное число " + d);
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toOctalString(d));
        System.out.println(Integer.toHexString(d));
    }
}
