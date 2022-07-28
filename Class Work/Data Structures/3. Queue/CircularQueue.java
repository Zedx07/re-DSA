class CircularQueueDS {
    private int queue[];
    private int front, rear, size, noOfEle;

    public CircularQueueDS(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = 0;
        noOfEle = 0;
    }

    public void enQueue(int value) {
        if (((rear == front) && (front != 0)) || rear > size) {
            System.out.println("\nQueue Overflow");
        } else {
            if ((rear == size) && (front > 0)) {
                rear = 0;
            }
            queue[rear] = value;
            System.out.println("\nThe value is inserted!");
            rear++;
            // if (rear == size && front > 0) {
            // rear = 0;
            // }
        }
        noOfEle++;
        // System.out.println("Front: " + front + " Rear: " + rear);
    }

    public void deQueue() {
        if (front == rear) {
            System.out.println("\nQueue Underflow");
        } else {
            System.out.println("\nThe value is deleted: " + queue[front]);
            front++;
            if (front == rear) {
                front = rear = 0;
            }
            if (front == size && rear > 0) {
                rear = 0;
            }
        }
        noOfEle--;
        // System.out.println("Front: " + front + " Rear: " + rear);
    }

    public void displayQueue() {
        int i = front;

        if (front == rear && front == 0) {
            System.out.println("\nThe queue is empty.");
        } else {
            System.out.print("\nThe queue element : ");

            // combine the conditions
            for (int n = 0; n < noOfEle; n++) {
                System.out.print(queue[i] + "\t");
                i++;
                if (i == size) {
                    i = 0;
                }
            }
        }

    }

}

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueueDS cir_que = new CircularQueueDS(5);
        cir_que.enQueue(1);
        cir_que.enQueue(2);
        cir_que.enQueue(3);
        cir_que.enQueue(4);
        cir_que.enQueue(5);
        cir_que.displayQueue();

        cir_que.deQueue();
        cir_que.deQueue();
        cir_que.displayQueue();

        cir_que.enQueue(9);
        cir_que.enQueue(8);
        cir_que.displayQueue();

    }
}
