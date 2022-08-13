package lab2;

public class Exercise7
{
    Exercise7(){
        System.out.println("Задание 7: --------------------------------------");
        String str = new String("Hello123**==ee");
        int Up =0, Low = 0, word = 0, digit = 0, digital =0;
        int another = 0;
        char[] array = str.toCharArray();
        for (char i:array) {
            if (Character.isAlphabetic(i))
                word++;
            if (Character.isUpperCase(i))
                Up++;
            else if (Character.isLowerCase(i))
                Low++;

            else if(Character.isDigit(i)) {
                digit++;
                if (i >= '0' && i <= '9')
                    digital++;
            }
            else another++;
        }
        System.out.println(str);
        System.out.println("количество букв " + word);
        System.out.println("строчные " + Low);
        System.out.println("прописные " + Up);
        System.out.println("количество арабских цифр "+ digital);
        System.out.println("количество не арабских цифр "+ (digit -  digital));
        System.out.println("количество других символов " + another);
        System.out.println("общее количество всех символов " + str.length());
    }
}
