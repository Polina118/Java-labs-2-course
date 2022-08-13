package lab2;

public class Exercise6 {
    Exercise6(){
        char str = '\u0400';
        for (int i=0; i < 16 ; i++){
            for (int j=0; j< 16 ; j++){
                System.out.print(str + " ");
                str++;
            }
            System.out.println();
        }
        System.out.println();
        char money = '\u20a0';
        for (int i=0; i < 2 ; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(money + " ");
                money++;
            }
            System.out.println();
        }
    }
}
