public class DLL_Insertion {
    class Node {
        Node prev;
        Node next;
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
    
        public void display() {
            Node curr = head;
            if (curr == null) {
                System.out.println("The given DoublyLL is empty");
            }
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        
    }
    
    public static void main(String[] args) {
        DLL_Insertion DLL = new DLL_Insertion();
        DLL.addNode(5);
        DLL.addNode(15);
        DLL.addNode(25);
        DLL.addNode(35);
        DLL.addNode(45);

        DLL.display();

    }

}
