 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack Implementation (LIFO)
class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed to Stack: " + data);
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is Empty. Cannot pop.");
            return;
        }
        int poppedValue = top.data;
        top = top.next;
        System.out.println("Popped from Stack: " + poppedValue);
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is Empty.");
            return;
        }
        System.out.print("Stack (Top to Bottom): ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to run Stack
public class StackMain {
    public static void main(String[] args) {
        System.out.println("--- Stack Operations ---");
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
    }
}