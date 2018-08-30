package collections;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/*add() adds the given element to the collection,
and returns true if the Collection changed as a result of calling
the add() method.
A Set for instance may not have changed.
If the Set already contained that element,
it is not added again. On the other hand, if you called add() on a List
 and the List already contained that element,
 the element would then exist twice in the List.
 */
public class CollectionMain {
    public static void main(String[] args) {
        String anElement = "an element";
        Collection collection = new HashSet();

        collection.add(anElement);

        boolean didCollectionChange = collection.add(anElement);
        //boolean wasElementRemoved   = collection.remove(anElement);

        System.out.println(didCollectionChange);
        //System.out.println(wasElementRemoved);

        Iterator it = collection.iterator();
        while (((Iterator) it).hasNext()) {
            System.out.println(it.next().toString());
        }


        Collection colA = new ArrayList();
        ((ArrayList) colA).add("A");
        ((ArrayList) colA).add("B");
        ((ArrayList) colA).add("C");

        Collection colB = new ArrayList();
        ((ArrayList) colB).add(1);
        ((ArrayList) colB).add(2);
        ((ArrayList) colB).add(3);

        Collection target = new ArrayList();

        target.addAll(colA);     //target now contains [A,B,C]
        System.out.println(target);
        target.addAll(colB);     //target now contains [A,B,C,1,2,3]
        System.out.println(target);
        target.retainAll(colB);  //target now contains [1,2,3]
        System.out.println(target);
        target.removeAll(colA);  //nothing happens - already removed
        System.out.println(target);
        target.removeAll(colB);  //target is now empty.
        System.out.println(target);


        Collection collection2 = new HashSet();
        boolean containsElement = collection2.contains("an element");

        //return true if both the collections are empty
        Collection elements = new HashSet();
        boolean containsAll = collection2.containsAll(elements);

        System.out.println(containsElement);
        System.out.println(containsAll);

    }
}
