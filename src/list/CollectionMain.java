package list;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.text.html.HTMLDocument;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

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
        String     anElement  = "an element";
        Collection collection = new HashSet();

        collection.add(anElement);

        boolean didCollectionChange = collection.add(anElement);
        //boolean wasElementRemoved   = collection.remove(anElement);

        System.out.println(didCollectionChange);
        //System.out.println(wasElementRemoved);

        Iterator it = collection.iterator();
        while (((Iterator) it).hasNext()){
            System.out.println(it.next().toString());
        }
    }
}
