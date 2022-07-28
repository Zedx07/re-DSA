class PriorityQueueDS {
    private int queue[][];
    private int front, rear, size;

    public PriorityQueueDS(int size) {
        this.size = size;
        queue = new int[size][2];
        front = rear = 0;
    }

    public void enQueue(int value, int priority) {

        if (rear == size) {
            System.out.println("Queue Overflow");
        } else {
            queue[rear][0] = value;
            queue[rear][1] = priority;
            System.out.println("The value is inserted!");
            rear++;
        }
    }

    private int getMaxPriority() {
        int max = front;
        for (int i = front + 1; i < rear; i++) {
            if (queue[max][1] < queue[i][1]) {
                max = i;
            }
        }
        return max;
    }

    private void arrangeQueue(int start) {
        for (int i = start; i > front; i--) {
            queue[i][0] = queue[i - 1][0];
            queue[i][1] = queue[i - 1][1];
        }
    }

    public void deQueue() {
        if (front == rear) {
            System.out.println("Queue Underflow");
        } else {
            int MP = getMaxPriority();
            System.out.println("\nThe value is deleted: " + queue[MP][0]);
            arrangeQueue(MP);
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
                System.out.print(queue[i][0] + ":" + queue[i][1] + "\t");
            }
        }

    }

}

public class PriorityQueue {
    public static void main(String[] args) {
        PriorityQueueDS que = new PriorityQueueDS(5);
        que.enQueue(10, 1);
        que.enQueue(29, 0);
        que.enQueue(33, 2);
        que.enQueue(23, 5);
        que.enQueue(521, 4);

        que.displayQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();
        que.deQueue();

        que.displayQueue();

        que.enQueue(2, 4);
        que.enQueue(3, 5);
        que.displayQueue();

    }
}
