public class DLL {
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

    public void display(){
        Node current = head;
        if(current == null){
            System.out.println("The DLL is empty");
        }

        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    
    public static void main(String[] args) {
        DLL LL = new DLL();
        LL.addNode(3);
        LL.addNode(33);
        LL.addNode(333);
        LL.addNode(33333);
        LL.addNode(333333);
        LL.addNode(3333333);

        LL.display();

    }
}
