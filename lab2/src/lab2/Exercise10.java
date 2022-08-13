package lab2;

public class Exercise10
{
    Exercise10()
    {
        System.out.println("Задание 10: -------------------------------------");
        String str = "abcd";
        System.out.println(str);
        char[] s = str.toCharArray();
        for (int i = 0; i< str.length(); i++) {
            int pos = i;
            for (int j =pos; j < str.length(); j++){
                System.out.print(s[j]);
            }
            for (int j = 0; j < pos; j++){
                System.out.print(s[j]);
            }
            System.out.println();
        }
    }
}
