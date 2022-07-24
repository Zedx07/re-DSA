package Stack;

public class Stack {
    private int cap;
    private int top;
    private int stackArr[];

    Stack(int vol) {
        stackArr = new int[vol];
        cap = vol;
        top = -1;
    }

    public boolean isFull() {
        return top == cap - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Error! cannot push an element as the stack is full");
            // System.exit(0);
        }
        stackArr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Error! cannot pop an element as the stack is empty");
            System.exit(1);
        }

        return stackArr[top--];
        // return stackArr[top--];
        // System.out.println("top element " + value);

    }

    public void display() {
        for (int i = 0; i < stackArr.length; i++) {
            System.out.println(stackArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack ST = new Stack(4);
        ST.push(0);
        ST.push(1);
        ST.push(2);
        ST.push(3);
        System.out.println("After push: STACK -> ");
        ST.display();

        ST.pop();
        // ST.pop();
        System.out.println("After pop: STACK -> ");
        ST.display();

    }
}
