public class LL_Insertion {

    public class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

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
        System.out.println("The elements in Linkedlist are: ");
        LL.display();
    }

    public void deleteNode(int i) {
    }
}