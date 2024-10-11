public class StackWithLinkedlist {

    private Node top; // Top of the stack

    // Node class (Inner class)
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize the stack
    public StackWithLinkedlist() {
        top = null; // Indicates that the stack is empty
    }

    // Push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // Point new node to the current top
        top = newNode; // Update top to the new node
        System.out.println(value + " pushed onto the stack");
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 when stack is empty
        } else {
            int poppedValue = top.data; // Get the top value
            top = top.next; // Move top to the next node
            return poppedValue; // Return the popped value
        }
    }

    // Peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return top.data; // Return the top value
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == null); // Stack is empty if top is null
    }

    // Main method to test the StackWithLinkedlist
    public static void main(String[] args) {
        StackWithLinkedlist stack = new StackWithLinkedlist();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}
