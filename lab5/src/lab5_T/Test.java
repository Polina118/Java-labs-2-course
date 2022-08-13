package lab5_T;

public class Test {

        public static void main(String[] args) {
            /////////////////// 1 задание ///////////////////
            Pair<String, Integer> acc1 = new Pair<>("first", 100);
            Pair<String, Integer> acc2 = new Pair<>("second", 200);
            Pair<String, Integer> acc3 = new Pair<>("third", 300);
//        System.out.println(acc1.getType1() + " " + acc1.getType2());
//        Pair.makepair().Show();
//        System.out.println("--------------------------------------------------");

            /////////////////// 2 задание ///////////////////
//        Bag bag = new Bag(10);
//        bag.Add(1);
//        bag.Add("second");
//        bag.Add(3.45);
//        bag.Add(true);
//        bag.Add(5);
//        bag.Print();
//        System.out.println("deleted "+ bag.Delete());
//        bag.Print();
//        System.out.println(bag.Size());
//        System.out.println("--------------------------------------------------");

            /////////////////// 3 задание ///////////////////
//        PairBag pairBag = new PairBag(10);
//        pairBag.Add(new Pair<>("second", 200));
//        pairBag.Add(new Pair<>(2.33, true));
//        pairBag.Add(new Pair<>('a', 11));
//        pairBag.Add(new Pair<>("first", 0));
//        pairBag.Print();
//        System.out.println("вывод по позиции: " + pairBag.getPair(0));
//        System.out.println("deleted "+ pairBag.Delete().getType1());
//        pairBag.Print();
//        System.out.println("--------------------------------------------------");

            /////////////////// 4 задание ///////////////////
            GPairBag<Integer, String> gPairBag = new GPairBag<>(10);

//        System.out.println("--------------------------------------------------");

            /////////////////// 5 задание //////////////////
//        GenericPairBag<Pair<String,Integer>> gpbag = new GenericPairBag<>();
//        gpbag.Add(acc1);
//        gpbag.Add(acc2);
//        gpbag.Add(acc3);
//        //gpbag.Print();
//        gpbag.Delete();
//        //System.out.println(gpbag.Size());
//        //gpbag.Print();

            /////////////////// 6 задание ///////////////////
            //Tournament t = new Tournament();
            //t.game();

            /////////////////// 7 задание ///////////////////
            DList<Integer, int[]> dList = new DList<>(10);
    /////////////////// 9 задание ///////////////////
            Hashfunction<String> hash = new PersonHF();

            Table<String, Person> map = new Table<>(10, hash);
            Person[] people = {
                    new Person("Ivanov", "Ivan", 23),
                    new Person("Petrov", "Petr", 30),
                    new Person("Ser", "Sergey", 19),
            };

            String[] key = new String[people.length];
            for (int i = 0; i < people.length; i++) {
                key[i] = people[i].surname;
            }

            for (int i = 0; i < key.length; i++)
                map.add(key[i], people[i]);

            System.out.println("size : " + map.size());
            System.out.println(map.remove(key[0]).surname);
            System.out.println(map.get("Ser").name);
            System.out.println("size : " + map.size());
            System.out.println("empty : " + map.isEmpty());

    }
}
