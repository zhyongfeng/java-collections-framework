package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println("\nIteration #1");

        for (Integer i : numbers) {
            System.out.println(i);
        }

        System.out.println("\nIteration #2");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\nIteration #3");

        // iterator
        List<String> values = new ArrayList<String>();
        values.add("hello, ");
        values.add("this ");
        values.add("is ");
        values.add("a list");

        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            String next = String.valueOf(iterator.next());
            System.out.println(next);
        }

        // removing items (careful!)
        // this is very slow, especially you have a big arraylist
        // as arraylist moves all the other items below index 0.
        numbers.remove(0);

        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("a");
        stringList1.add("b");
        stringList1.add("c");

        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("a");
        stringList2.add("b");
        stringList2.add("d");

        //note: if it's a list of Integer, retainAll will make it empty, due to Integer is an object
        System.out.println(stringList1.retainAll(stringList2));

        Iterator it = stringList1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }


    }
}
