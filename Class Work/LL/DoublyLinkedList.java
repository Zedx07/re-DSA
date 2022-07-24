import java.util.Scanner;

public class DoublyLinkedList {

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

    public int getCount() {
        int counter = 0;
        Node current = head;

        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
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
            System.out.println("Deleted element: " + del.data);
            return;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The DLL is empty");
        }
        System.out.print("null <==> ");
        while (current != null) {
            System.out.print(current.data + " <==> ");
            current = current.next;
        }
        System.out.print("null ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList LL = new DoublyLinkedList();
        LL.addNode(3);
        LL.addNode(33);
        LL.addNode(333);
        LL.addNode(33333);
        LL.addNode(333333);
        LL.addNode(3333333);

        System.out.println("Functionalities:\n");
        System.out.println("1. Insert an element \n2. Display \n3. Delete an element \n4. Length of the List");
        System.out.println("\nEnter your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Insert the element");
                LL.addNode(3);
                LL.addNode(33);
                LL.addNode(333);
                break;

            case 2:
                System.out.println("Insert the element");
                LL.display();
                break;

            case 3:
                LL.deleteNode(5);
                System.out.print("Updated List: ");
                LL.display();
                break;

            case 4:
                System.out.println("The length of DLL is: " + LL.getCount());
                break;
            default:
                break;
        }
    }
}
