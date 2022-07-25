package Stack;

public class Stack {
    private int MAX; // Max size of Stack
    private int top;
    private int stackArr[]; // To store stack elements

    // constructor
    Stack(int vol) {
        stackArr = new int[vol];
        MAX = vol;
        top = -1; //
    }

    public boolean isFull() {
        return top == MAX - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Utility function to add an element `x` to the stack
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stackArr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    // Utility function to remove an element `x` from the stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stackArr[top--];
            System.out.println(24 + " removed from the stack");
            return x;
        }
    }

    // to get topmost element
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stackArr[top];
            return x;
        }
    }

    public int stackSize() {
        return top + 1;
    }

    public void display() {

        for (int i = top; i > -1; i--) {
            System.out.print(" " + stackArr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(24);
        // stack.display();
        stack.pop(); // removing the top element (2)
        // stack.pop(); // removing the top element (1)
        System.out.print("Stack -> [");
        stack.display();
        System.out.println(" ]");

        System.out.println("The top element is: " + stack.peek());
        System.out.println("The stack size is: " + stack.stackSize());

    }
}
