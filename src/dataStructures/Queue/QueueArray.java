package dataStructures.Queue;

public class QueueArray {
    int [] arr;
    int topOfQueue;
    int beginninfOfQueue;

    public  QueueArray (int size){
        this.arr = new int[size]; //----------> 0(1)
        this.topOfQueue = -1; //----------> 0(1)
        this.beginninfOfQueue = -1;//----------> 0(1)

        System.out.println("The Queue is succesfully created with size of : " + size);

    } // end QueueArray con

    // check if it's full or empty
    public boolean isFull (){
        if (topOfQueue == arr.length-1){
            return true;
        } else {
            return false;
        }//end if

    } // end isFull

    // method if it's empty

    public boolean isEmpty (){

        if (topOfQueue == arr.length-1 ||(beginninfOfQueue == arr.length)){
            return true;

        }else {
            return false;
        } // end if
    } // end isEmpty

    //endque method -> adding elements into the queue

    public void endQueue (int value){
        // check if i'ts full or not

        if(isFull()){
            System.out.println("The Que is full");
        }else if(isEmpty()){
            // set the beginning to 0 , bcz it's empty , and it's -1
            beginninfOfQueue = 0;
            // increase the topOfQueue to 1
            topOfQueue++;
            // add the array what the top of the queue holds
            arr[topOfQueue] = value;
            System.out.println("Succesfully inserted " + value + " in the queue");
        }else {
            // but if it's not empty dont upddate in the begining ,
            topOfQueue++;
            // add the array what the top of the queue holds
            arr[topOfQueue] = value;
            System.out.println("Succesfully inserted " + value + " in the queue");


        } // end if

    } // end endQueue

    public int endQueue (){
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else {
            int result = arr[beginninfOfQueue];
            beginninfOfQueue++;
            if (beginninfOfQueue > topOfQueue){
                beginninfOfQueue = topOfQueue -1;

            }
            return result;

        }//end if


    } // end endQueue

    // peek looking
    public int peek (){
        if (!isEmpty()){
            return arr[beginninfOfQueue];
        }else {
            System.out.println("The Queue is empty");
            return -1;
        } //end if

    } //end peek






}
