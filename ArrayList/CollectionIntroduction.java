package ArrayList;

import java.util.ArrayList;
import java.util.List;

class CollectionIntroduction {
    public static void main(String[] args) throws Exception {
        // what is the need for collection framework
        int[] a = { 1, 2, 3, 4 };
        // System.out.println(a.length);
        int[] a1 = new int[4]; // only 4 elements,0 to 3 index
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        // System.out.println(a1.length);

        List<Integer> li = new ArrayList<>(5);
        li.add(1);
        li.add(2);
        li.add(1, 3);
        li.remove(1);
        System.out.println(li);
        // a[4] = 12;
        // a1[4] = 13;// Index 4 out of bounds for length 4
        /*
         * 1.array can not grow dynamically
         * 2.only int value in int array
         * hence, java created collection framework.
         * framework - group of classes and interfaces, enum etc..
         */

        CustomArrayList l = new CustomArrayList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        // whenever remove(delete) operation happening left shift, and it returns the
        // value of the index

        System.out.println(l.toString());
        System.out.println(l.size());
        // System.out.println(l.get(0));
        System.out.println(l.fastRemove(2));
        System.out.println(l.toString());
        System.out.println(l.size());
    }
}