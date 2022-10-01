package dataStructures.linkedList;

public class LinkedList {
    public static void main(String[] args) {


        //Create instant of singlelinkedlist class
        SinglyLibkedList singlyLibkedList = new SinglyLibkedList();
        // using createsll method to create a link list
        singlyLibkedList.createSinglyLibkedList(5);
        System.out.println(singlyLibkedList.head.value);



    }
}
