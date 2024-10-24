package LinkedList;

public class CustomLinkedList {

    CustomNode head;

    public void insert(Object obj) {
        CustomNode customNode = new CustomNode(obj);
        if (head == null) {
            head = customNode;
        } else {
            customNode.next = head;
            head = customNode;
            CustomNode cn = head;
            while (cn.next != null) {
                cn = cn.next;
            }
            cn.next = customNode;
        }

    }

    class CustomNode {
        Object data;
        CustomNode next;

        CustomNode(Object data) {
            this.data = data;
        };
    }

    @Override
    public String toString() {
        return "CustomLinkedList [head=" + head.data + "]";
    }

}
