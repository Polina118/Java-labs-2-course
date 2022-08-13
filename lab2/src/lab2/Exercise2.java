package lab2;

import java.util.Scanner;

public class Exercise2 {
    Scanner sc;
    int[] mas;
    int res = 1, num = 0;
    Exercise2() {
        sc = new Scanner(System.in);
        System.out.println("Задание 2: --------------------------------------");
        System.out.println("Элементы массива");
        mas = new int[]{-1, -2, -4, 2, 2,
                2, 2, 2, 2, 2,
                2, 2, 1, 3, 5,
                7, 8, 9, 0, 20};
        for(int i =0; i < 20 ; i++) {
            System.out.print(mas[i] + " " );
        }
        System.out.println();
        for(int i =0; i < 20 ; i++)
            if (mas[i] < 0) {
                res *= mas[i];
                num++;
            }
        double n = 1./num;
        if (res <0)
            System.out.println(-Math.pow(-res, n));
        else
            System.out.println(Math.pow(res, n));
    }
}
