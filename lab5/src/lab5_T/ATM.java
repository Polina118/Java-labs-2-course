package lab5_T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ATM {

    ATM(ArrayList<Integer> coinValues) {
        this.coinValues = coinValues;
    }

    public DList<ArrayList<Integer>, ArrayList<Integer>> calculate(int value) {

        DList<ArrayList<Integer>, ArrayList<Integer>> log = new DList<ArrayList<Integer>, ArrayList<Integer>>(100);

        ArrayList<ArrayList<Integer>> combinations = calculate_rec(new ArrayList<Integer>(), value);
        ArrayList<ArrayList<Integer>> optimal = new ArrayList<>();

        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < combinations.size(); i++) {
            if (combinations.get(i).size() < minLength) {
                minLength = combinations.get(i).size();
            }
        }

        for (int i = 0; i < combinations.size(); i++) {
            if (combinations.get(i).size() == minLength) {
                optimal.add(combinations.get(i));
            }
        }

        for (int i = 0; i < optimal.size(); i++) {
            HashSet<Integer> currency = new HashSet<>();
            for (int j = 0; j < optimal.get(i).size(); j++) {
                currency.add(optimal.get(i).get(j));
            }

            log.pushBack(new ArrayList<Integer>(currency), optimal.get(i));
        }

        return log;
    }

    private ArrayList<ArrayList<Integer>> calculate_rec(ArrayList<Integer> previous, int value) {

        ArrayList<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < coinValues.size(); ++i) {
            if (value - coinValues.get(i) > 0) {
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                for (int j = 0; j < previous.size(); j++) {
                    tmp.add(previous.get(j));
                }
                tmp.add(coinValues.get(i));

                out.addAll(calculate_rec(tmp, value - coinValues.get(i)));
            } else if ((value - coinValues.get(i) == 0)) {
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                for (int j = 0; j < previous.size(); j++) {
                    tmp.add(previous.get(j));
                }
                tmp.add(coinValues.get(i));

                out.add(tmp);
            }
        }
        return out;
    }


    private ArrayList<ArrayList<Integer>> possibleWays;
    private ArrayList<Integer> coinValues;

    public static void main(String[] args) {

        Integer[] currency = new Integer[]{1, 2, 4, 9};

        ATM atm = new ATM(new ArrayList<Integer>(Arrays.asList(currency)));
        DList<ArrayList<Integer>, ArrayList<Integer>> out = atm.calculate(20);
        for (int i = 0; i < out.getCount(); i++) {
            for (int j = 0; j < out.getByIndex(i).size(); j++) {
                System.out.printf("%d ", out.getByIndex(i).get(j));
            }
            System.out.println();
        }

        for (int i = 0; i < out.getCount(); i++) {
            for (int j = 0; j < out.getKeyByIndex(i).size(); j++) {
                System.out.printf("%d ", out.getByIndex(i).get(j));
            }
            System.out.println();
        }

    }
}