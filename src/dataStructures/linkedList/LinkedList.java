package dataStructures.linkedList;

public class LinkedList {
    public static void main(String[] args) {


        //Create instant of singlelinkedlist class
        SinglyLibkedList singlyLibkedList = new SinglyLibkedList();
        // using createsll method to create a link list
        singlyLibkedList.createSinglyLinkedList(5);
        //printing out the singlyLibkedList i created
        System.out.println(singlyLibkedList.head.value);

        singlyLibkedList.insertLinkedList(6,0);
        System.out.println(singlyLibkedList.head.value);



    }
}
