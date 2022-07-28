class QueueDS {
    private int queue[];
    private int front, rear, size;

    public QueueDS(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = 0;
    }

    public void enQueue(int value) {
        if (rear == size) {
            System.out.println("Queue Overflow");
        } else {
            queue[rear] = value;
            System.out.println("The value is inserted!");
            rear++;
        }
    }

    public void deQueue() {
        if (front == rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("The value is deleted: " + queue[front]);
            front++;
            if (front == rear) {
                front = rear = 0;
            }
        }
    }

    public void displayQueue() {
        if (front == rear) {
            System.out.println("The queue is empty.");
        } else {
            System.out.print("\nThe queue element : ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + "\t");
            }
        }

    }

}

public class Queue {
    public static void main(String[] args) {
        QueueDS que = new QueueDS(5);
        que.enQueue(1);
        que.enQueue(2);
        que.enQueue(3);
        que.enQueue(4);
        que.enQueue(5);

        que.displayQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();

        que.displayQueue();

        que.enQueue(2);
        que.enQueue(3);
        que.displayQueue();

    }
}
