package dataStructures.Queue;

public class Main {
    public static void main(String[] args) {
        // creating QueueArray
        QueueArray newQueueArray = new QueueArray(3);

        // inserting elements
        newQueueArray.endQueue(1);
        newQueueArray.endQueue(2);
        newQueueArray.endQueue(3);


        // look if its empty or not
        boolean result = newQueueArray.isFull();
        System.out.println(result);

        // checks if its empty

        boolean isEmpty = newQueueArray.isEmpty();
        System.out.println(isEmpty);










    }
}
