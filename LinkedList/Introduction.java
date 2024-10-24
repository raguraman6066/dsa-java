package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Introduction {
    public static void main(String[] args) {
        // all methods we can access from list class..using parent reference
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        System.out.println(linkedList);

        CustomLinkedList list = new CustomLinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
    }
}
