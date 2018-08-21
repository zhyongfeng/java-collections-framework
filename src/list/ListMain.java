package list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println("\nIteration #1");

        for (Integer i:numbers
             ) {
            System.out.println(i);
        }

        System.out.println("\nIteration #2");

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }

    }
}
