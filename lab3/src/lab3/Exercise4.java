package lab3;

import java.util.Scanner;

public class Exercise4 {
    int x1, x2, y1, y2;
    int r1, r2;

    Exercise4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты первой окружности");
        if (scan.hasNextInt()) x1 = scan.nextInt();
        if (scan.hasNextInt()) y1 = scan.nextInt();
        System.out.println("Введите радиус первой окружности");
        if (scan.hasNextInt()) r1 = scan.nextInt();
        System.out.println("Введите координаты второй окружности");
        if (scan.hasNextInt()) x2 = scan.nextInt();
        if (scan.hasNextInt()) y2 = scan.nextInt();
        System.out.println("Введите радиус второй окружности");
        if (scan.hasNextInt()) r2 = scan.nextInt();
    }

    String print() {
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        int r, R;
        if (r1 > r2) {
            r = r2;
            R = r1;
        } else if (r1 < r2) {
            r = r1;
            R = r2;
        } else if (distance == 0) {
            return ("Окружности совпадают");
        } else {
            r = r1;
            R = r2;
        }
        if (distance == r + R) {
            return ("Окружности пересекаются в 1 точке");
        }
        if (distance + r < R) {
            if (r == r1) {
                return ("1 окружность вложена во 2");
            } else {
                return ("2 окружность вложена в 1");
            }
        }
        if (distance < R + r) {
            return ("2 точки пересечения");
        }
        return ("Окружности не пересекаются и не совпадают");
    }
    // 0 - 0 точек пересечения
    // 1- Окружности пересекаются в 1 точке
    // 2 - 2 точки пересечения
    // 3 - Окружности совпадают
    // 10 - 1 окружность вложена во 2
    // 20 - 2 окружность вложена в 1
    // 30 - Окружности совпадают

    public int res() {
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        int r = r1, R = r2;
        if (r1 > r2) {
            r = r2;
            R = r1;
        }
        if (distance == 0) {
            if (r1 == r2)
                return 33;
            else if (r1 > r2)
                return 20; // 2 окружность вложена в 1
            else return 10; //1 окружность вложена во 2
        } else if (distance == r1 + r2) {
            if (distance + r < R) {
                if (r == r1) {
                    return 11; // 1 окружность вложена во 2
                } else
                    return 21; // 2 окружность вложена в 1
            } else return 41; // нет вложенности
        }
        if (distance < R + r)
            return 2;
        return 0;
    }
}

