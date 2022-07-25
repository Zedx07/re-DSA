import java.util.Scanner;
import java.util.LinkedList;

public class LinkedLists {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head = null;
    Node tail = null;

    public void addnode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int getCount() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void delete(int key) {
        Node temp = head, prev = null;

        if(temp!=null && temp.data ==key){
            head = temp.next;
            return;
        }

        while(temp!=null && temp.data!=key){
            prev = temp;
            temp = temp.next;
        }
           
        if(temp==null){
            return;
        }

        prev.next=temp.next;
        }

    

    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("The given LinkedList is empty");
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedLists ss = new LinkedLists();
        ss.addnode(2);
        ss.addnode(3);
        ss.addnode(44);
        ss.addnode(5);

        System.out.println("Functionalities:\n");
        System.out.println("1.Insert an element \n2.Display \n3.Delete an element \n4.Length of the List");
        System.out.println("\nEnter your choice:");
        int key = sc.nextInt();
        switch (key) {
            case 1:
                ss.addnode(2);
                ss.addnode(3);
                ss.addnode(44);
                ss.addnode(10);
                break;

            case 2:
                System.out.println("The elements in Singly LL are:");
                ss.display();
                break;

            case 3:
                ss.delete(3);
                ss.display();
                // ss.remove();
                break;

            case 4:
                System.out.println("\nThe length of LL is: " + ss.getCount());
                break;

            default:
                System.out.println("Exit");
                break;
        }

    }
}

// ptr.data = ptr.next.data;
// ptr.next = ptr.next.next;

//insert
//lenght
//delete
