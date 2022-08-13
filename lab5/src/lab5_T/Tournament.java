package lab5_T;

import java.util.Scanner;

public class Tournament {
    public void game(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter commands count: ");
        int count  = in.nextInt();

        if(!((count & (count-1)) == 0)){
            throw new java.util.InputMismatchException();
        }

        Bag firstBag = new Bag(count);
        GenericPairBag<String, String> secondBag = new GenericPairBag<String, String>(count);

        for(int i = 0; i < count; ++i){
            firstBag.insert(String.format("Command %d", i+1));
        }

        while (firstBag.getCount() != 1) {

            while (firstBag.getCount() != 0) {
                String firstCommandName = (String) firstBag.delete();
                String secondCommandName = (String) firstBag.delete();
                secondBag.insert(Pair.make_pair(firstCommandName, secondCommandName));
            }

            while (secondBag.getCount() != 0) {
                Pair<String, String> deleted = secondBag.delete();
                String firstCommandName = deleted.first;
                String secondCommandName = deleted.second;

                System.out.printf("First command is %s\n", firstCommandName);
                System.out.printf("Second one is %s\n", secondCommandName);
                System.out.printf("Who would win? (1/2): ");

                int choice = in.nextInt();

                if(choice == 1) {
                    firstBag.insert(firstCommandName);
                }else if(choice == 2){
                    firstBag.insert(secondCommandName);
                }else{
                    throw new java.util.InputMismatchException();
                }
            }
        }

        System.out.printf("The winner is %s", firstBag.getObject());

    }
}
