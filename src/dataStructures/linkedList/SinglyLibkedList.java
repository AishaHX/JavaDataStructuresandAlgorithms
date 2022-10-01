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

    // Insert Method SingleLinkedList
    public void insertLinkedList(int nodeValue, int location){
        // creating a node value
        Node node = new Node();
        // getting the node value from the prameter
        node.value = nodeValue;
        // check if the linklist is created or not
        if (head == null){
            // if it's not created , create a sinle list with the parameter value
            createSinglyLinkedList(nodeValue);
            return;
            //but if it's create -> set the new created to head , and the head to the next node
        } else if (location == 0){
            // the new node is referencing the head
            head.next = head;
            // the head will refrences to the node
            head = node;
            //check if the location parameter is greater than the size , then insert it at the end of the list
        }else if (location >= size){
            // the last node refrences to null , if the the above node is the last node,
            //then next refrence of the node has to be null
            node.next = null;
            // in tail we have the last node , and accesing tail.next = accessing last nodes refrence
            // setting last nodes refrence to the new node
            tail.next = node;
            // tail refrencing the node we created
            tail = node;

        } else{
            // inserting at any given location
            // start looping from the head
            Node tempNode = head;
            //looping variable
            int index = 0;
            // loop until we reach specified node
            while (index < location -1){
                tempNode = tempNode.next;
                index++;

            } // end while
        // when we found the location we looking , then insert the node there
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;

        }// end if
        // increase the size
        size++;



    } // end insertLinkedList




}
