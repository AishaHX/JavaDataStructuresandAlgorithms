package dataStructures.linkedList;

public class SinglyLibkedList {

    /*
     * How to create Singly Linked List
     * 1. Create Head and Tail , intialize it with null
     * 2. Then Create a blank Node and assign a value to it and reference to null
     * 3. Link Head and Tail with the Node
     *
     * */


    // This has type Node , and point the Node
    public Node head;
    public Node tail;
    // The size of a the nodes we have in singleList
    public int size;

// a method that creates LinkedList
    public Node createSinglyLinkedList (int nodeValue){
        //initialize head with type of node
        head = new Node();

        // creating instant av node
        Node node = new Node();

       // bcz we have 1 node , setting node.next to null
        node.next = null;
    // node values that comes from the prameter
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        // return head reference
        return head;



    } // end createSinglyLinkedList


}
