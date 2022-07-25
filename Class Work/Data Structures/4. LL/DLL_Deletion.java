// import java.util.Scanner;

public class DLL_Deletion {

    class Node {
        Node prev, next;
        int data;

        public Node(int data) {
            this.data = data;
        }

    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    // del -> node to be deleted
    // key -> index of node to be deleted
    public void deleteNode(int key) {

        if (head == null) {
            System.out.println("The list is empty");
            return;
        } else {

            Node del = head;

            for (int i = 0; i < key; i++) {
                del = del.next;
            }
            if (del == head) {
                head = del.next;

            }

            if (del.next != null) {
                del.next.prev = del.prev;

            }

            if (del.prev != null) {
                del.prev.next = del.next;

            }
            return;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The DLL is empty");
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DLL_Deletion LL = new DLL_Deletion();
        LL.addNode(0);
        LL.addNode(1);
        LL.addNode(2);
        LL.addNode(3);
        LL.addNode(4);
        LL.addNode(5);
        LL.addNode(6);

        LL.deleteNode(6);
        LL.display();

    }
}
