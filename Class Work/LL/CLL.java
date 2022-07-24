public class CLL {
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

        while (head != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
    }

    public void display() {
        Node curr = head;
        if (head == null) {
            System.out.println("The given Linkedlist is empty.");
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LL_Insertion LL = new LL_Insertion();
        LL.insertNode(2);
        LL.insertNode(3);
        LL.insertNode(4);
        LL.insertNode(5);
        LL.insertNode(4);
        System.out.println("The elements in Linkedlist are: ");
        LL.display();

        System.out.println("\nAfter deletion: ");

        LL.display();

    }
}
