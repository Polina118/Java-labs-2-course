package lab3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;
import static java.lang.Math.exp;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Задание 4 ---------------------------------------");
//        //Exercise4 exercise4 = new Exercise4();
//       // System.out.println(exercise4.res());
//        System.out.println("Задание 5 ---------------------------------------");
//        Exercise5 exercise5 = new Exercise5();
//        System.out.println(exercise5.Print());
//        System.out.println("Задание 8 ---------------------------------------");
//        Polinom();
        System.out.println("Задание 9,10 ------------------------------------");
        Exercise10("Мои номера 220-30-40 и 8904-378-16-61 не считая служебных");
    }

    public static void Exercise1() {
        float pi = 3.14159f;
        String X = "x", SIN = "sin(x)", FUN ="x*log(x)" ;
        System.out.printf("%10s", X);
        System.out.printf("%15s", SIN);
        System.out.printf("%15s", FUN);
        System.out.println();
        for (float x = pi / 15; x <= pi + pi / 15; x += pi / 15) {
            float fun1 = (float) sin(x);
            float fun2 = (float) (exp(x) / (x * log(x)));
            System.out.printf("%10.5f", x); // 10 позиций, 5
            System.out.printf("%15.7f", fun1); // 15 позиций, 7
            System.out.printf("%15.7f%n", fun2);
        }
    }

    public static void Mas() {
        int n = 5;
        int[][] mas = {
                {1, -3, 4, 5, 3, 6, 7, -246, 35, 62, -56},
                {34, 4567, -344, 734, 6},
                {1},
                {34, 5, 42, 356, 4567, -344, 734, -6},
                {34, -5}
        };
        int minn = mas[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] <= minn)
                    minn = mas[i][j];
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("наибольший отрицательный элемент массива: " + minn);
    }

    public static void Matrica() {
        int[][] mas = {{1, 2, 4}, {3, -4, 5}, {2, 1, -6}};
        System.out.println("Старая матрица: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(mas[i][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < 3; i++)
            Arrays.sort(mas[i]);

        System.out.println("Новая матрица: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double Exercise6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter begin: ");
        double begin = sc.nextDouble();
        System.out.println("Enter end: ");
        double end = sc.nextDouble();
        int n = 100;
        double step = (end - begin) / n;
        double[] args = new double[n+1];
        double[] funct = new double[n+1];
        args[0] = begin;
        funct[0] = exp(begin) - Math.pow(begin, 3);
        for (int i=1; i<=n; i++){
            double x = args[i-1] + step;
            double y = exp(x) - Math.pow(x, 3);
            args[i]  = x;
            funct[i] = y;
        }
        return Integral(args, funct);
    }
    public static double Integral(double[] x, double[] y){
        int n = x.length;
        double result = 0;
        for(int i=0; i<n-1; i++)
            result += (y[i]*(x[i+1]-x[i]));
        return result;
    }

    public static void Polinom(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите cтепень Полинома: ");
        int n = scan.nextInt();
        double [] k = new double[n + 1];
        System.out.println("Введите значения коэффициентов");
        for (int i = 0; i < n + 1; i++){
            System.out.print("coef[" + i + "]= ");
            k[i] = scan.nextDouble();
        }
        double x = 0.3, P = k[k.length - 1] * x + k[k.length - 2];
        for(int i = k.length - 3; i >= 0; i--){
            P = P * x + k[i];
        }
        System.out.println(P);
    }

    public static void Exercise9(String str){
        System.out.println(str);
        String reg = "(\\+7|8)[\\s\\-]{0,1}((\\d{3}[\\s\\-]{0,1}\\d{3}[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2})|([(]\\d{3}[)]" +
                "[\\s\\-]{0,1}\\d{3}[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2}))";
        String reg2 = "(2|3)[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2}";
//        String reg3 = "[reg+reg2|reg|reg2]\s";
//        Pattern r= Pattern.compile(reg|reg2);
        String[] words = str.split(" ");
        for(String w : words){
            if(w.matches(reg) || w.matches(reg2))
                System.out.println(w);
        }
    }

    public static void Exercise10(String str){
        String reg = "(\\+7|8)[\\s\\-]{0,1}((\\d{3}[\\s\\-]{0,1}\\d{3}[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2})|([(]\\d{3}[)]" +
                "[\\s\\-]{0,1}\\d{3}[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2}))" +
                "|(2|3)[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2}[\\s\\-]{0,1}\\d{2}";
        Pattern p = Pattern.compile(reg);
        System.out.println(str);
        Matcher m = p.matcher(str);
        int begin, end;
        while(m.find()) {
            begin = m.start();
            end = m.end();
            System.out.println(str.substring(begin, end));
        }
    }

}
