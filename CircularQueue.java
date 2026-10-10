public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    // Insertion operation (Enqueue)
    public void insert(int value) {
        // Check if the queue is full
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue is Full. Cannot insert " + value);
            return;
        }
        
        // If queue is empty, initialize front
        if (front == -1) {
            front = 0;
        }
        
        // Circular increment for rear and insert the value
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        System.out.println("Inserted: " + value);
    }

    // Deletion operation (Dequeue)
    public void delete() {
        // Check if the queue is empty
        if (front == -1) {
            System.out.println("Queue is Empty. Cannot delete.");
            return;
        }
        
        int deletedValue = queue[front];
        System.out.println("Deleted: " + deletedValue);
        
        // Check if it was the only element in the queue
        if (front == rear) {
            front = -1;
            rear = -1; // Reset to empty state
        } else {
            // Circular increment for front
            front = (front + 1) % capacity;
        }
    }

    // Helper method to display the queue using a while loop
    public void display() {
        if (front == -1) {
            System.out.println("Queue is Empty.");
            return;
        }
        
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        System.out.println("--- Insertion ---");
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        cq.insert(50);
        
        // Attempting to insert when full
        cq.insert(60); 
        cq.display();

        System.out.println("--- Deletion ---");
        cq.delete();
        cq.delete();
        cq.display();

        System.out.println("--- Circular Insertion ---");
        // Inserting into the freed spaces at the start of the array
        cq.insert(70);
        cq.insert(80);
        cq.display();
    }
}