 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue Implementation (FIFO)
class LinkedListQueue {
    private Node front;
    private Node rear;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued to Queue: " + data);
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty. Cannot dequeue.");
            return;
        }
        int dequeuedValue = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued from Queue: " + dequeuedValue);
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.print("Queue (Front to Rear): ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to run Queue
public class QueueMain {
    public static void main(String[] args) {
        System.out.println("--- Queue Operations ---");
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}