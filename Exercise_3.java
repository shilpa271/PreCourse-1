import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            //Write your code here
            data=d;
            next=null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node= new Node(data);
        new_node.next=null;

        // If the Linked List is empty,
        if(list.head==null) {
            // then make the new node as head
            list.head = new_node;
        }

        // Else traverse till the last node
        Node last=list.head;
        while(last.next!=null){
            last=last.next;
        }
        // and insert the new_node there

        // Insert the new_node at last node
        last.next=new_node;
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node node = list.head;

        // Print the data at current node
        while (node != null) {

            // Go to next node
            System.out.println(node.data);
            node = node.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}