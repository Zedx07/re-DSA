public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head, tail = null;

    public void pushNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void deleteN(int key) {
        Node curr = head, prev = null;
        if (head != null && curr.data == key) {
            head = curr.next;
            return;
        }

        while (curr.next != head && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }

    public void delete(int data) {
        Node list = head;
        if (list == null)
            return;

        if (list.data == data && list.next.data == list.data) {
            list.next = null;
            list = null;
            return;
        }

        if (list.data == data) {

            Node end = list;
            while (end.next.data != list.data) {
                end = end.next;
            }

            Node temp = list;
            list = list.next;
            temp.next = null;
            end.next = list;
            return;
        }

        Node temp = list;
        while (temp.next.data != data && temp.next.data != list.data) {
            temp = temp.next;
        }

        if (temp.next.data == list.data)
            return;

        Node del = temp.next;
        temp.next = temp.next.next;
        del.next = null;
    }

    public void display() {
        Node curr = head;
        if (head == null) {
            System.out.println("The given Linkedlist is empty.");
        }
        while (curr != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList LL = new CircularLinkedList();
        LL.pushNode(2);
        LL.pushNode(3);
        LL.pushNode(4);
        LL.pushNode(5);
        LL.pushNode(9);
        System.out.println("The elements in Linkedlist are: ");
        LL.display();

        System.out.println("\nAfter deletion: ");
        // LL.deleteN(5);
        LL.delete(9);
        LL.display();

    }
}
