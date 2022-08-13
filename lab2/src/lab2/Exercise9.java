package lab2;

public class Exercise9
{
    Exercise9()
    {
        System.out.println("Задание 9: --------------------------------------");
        String string = "dddasdasdffasdfghhasd";
        System.out.println(string);
        String sub = "dd";
        System.out.println(sub);
        int i=0, times =0;
        while(i < string.length())
        {
            int pos = string.indexOf(sub, i);
            if (pos < 0)
                break;
            //System.out.println(pos);
            times++;
            i = pos+1;
        }
        System.out.println(times);
    }
}
