package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionIterator {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        // List<Integer> l = new CopyOnWriteArrayList<>();
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        ListIterator<Integer> iterator = l.listIterator();
        int in = 0;
        while (iterator.hasNext()) {// if element is there.has.next element
            in++;
            Integer i = iterator.next();// return the found element in hasnext
            if (in > 2) {
                if (iterator.hasPrevious()) {
                    System.out.println("prev");
                }
            }
            l.add(4);// java.util.ConcurrentModificationException with next or preview
            // method
            System.out.println(i);
        }
    }
}
