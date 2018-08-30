package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;


/**
 * performance test of ArrayList and LinkedList
 */
public class PerformanceTest {
    public static ArrayList<Integer> preList() {
        ArrayList<Integer> arrayList = new ArrayList<>(100001);
        for (int i = 1; i < 100001; i++) {
            arrayList.add(new Integer(i));
        }
        return arrayList;
    }

    public static void arrayRemove() {
        ArrayList<Integer> arrayList = preList();
        Long start = System.currentTimeMillis();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        Long end = System.currentTimeMillis();
        System.out.println("普通删除消耗时间" + (end - start));
    }

    public static void arrayCopy() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList = preList();
        Long start = System.currentTimeMillis();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 != 0) {
                arrayList1.add(new Integer(i));
            }

        }
        Long end = System.currentTimeMillis();

        System.out.println("第二种方法空间换时间" + (end - start));
    }

    public static void linkedRemove() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 100001; i++) {
            linkedList.add(new Integer(i));
        }
        Long start = System.currentTimeMillis();
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        Long end = System.currentTimeMillis();
        System.out.println("linkedlist删除消耗时间" + (end - start));
    }

    public static void main(String[] args) {
        arrayRemove();
        arrayCopy();
        linkedRemove();
    }
}
