public class Linkedlist {

    private Node head; // Head of the linked list

    // Node class (Inner class)
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public Linkedlist() {
        head = null; // Initially, the list is empty
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node with given data
    public void deleteNode(int data) {
        if (head == null) {
            return; // List is empty
        }
        if (head.data == data) {
            head = head.next; // Remove head node
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next; // Bypass the node to delete
        }
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Insert elements
        list.insertAtEnd(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        
        // Print the list
        System.out.print("Linked List: ");
        list.printList(); // Output: 5 20 10 30

        // Delete an element
        list.deleteNode(10);
        System.out.print("After deleting 10: ");
        list.printList(); // Output: 5 20 30
        
        // Delete head
        list.deleteNode(5);
        System.out.print("After deleting head (5): ");
        list.printList(); // Output: 20 30
    }
}
