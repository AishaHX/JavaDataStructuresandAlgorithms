package project2;
import Project.Arbetare;
import java.util.*;
import java.util.Collections;

public class PersonalRegister {
    public static void main(String[] args) {

        ArbetsMyror arb = new ArbetsMyror("oscar", "wikström", 165);
        //Console.WriteLine(arb.getArbetare());
        System.out.println(arb.getArbetare());

        // ArrayList
        ArrayList<ArbetareAbs> myList = new ArrayList<ArbetareAbs>();
        myList.add(new ArbetsMyror("Kristin", "Hane", 100));
        myList.add(new ArbetsMyror("Hans", "Jones", 83));
        myList.add(new ArbetsMyror("Rikard", "Land", 40)); // index 2
        myList.add(new ArbetsMyror("Hans", "Jernberg", 65));

        Iterator iterator = myList.iterator();
        System.out.println("Listan från Array Listan : ");
        System.out.println("*******************************************************************'");
        while (iterator.hasNext()) {
            ArbetareAbs arbeternaiArray = (ArbetareAbs) iterator.next();
            System.out.println(arbeternaiArray.getArbetare() + " ");
        } // end while


         // Binary Searching The ArrayList to find  specific Arbetare
        ArbetareAbs SearchArbetare = new ArbetsMyror("Rikard", "Land", 40);
        int index = Collections.binarySearch(myList, SearchArbetare, new SearchArbetare());
        System.out.println("Index of the searched key: " + index);



        // Queue Lista
     Queue<ArbetareAbs> queueArbetare = new LinkedList<ArbetareAbs>();
        queueArbetare.add(new OvrigaArbetare("Aisha", "Hassan", 209));
        queueArbetare.add(new OvrigaArbetare("Laza", "Gabriout", 260));
        queueArbetare.add(new OvrigaArbetare("Oscar", "Wikström", 230));
        queueArbetare.add(new ArbetsMyror("Alexander", "Nordström", 234));

        // Looping through elements in the list
        Iterator iteratorQueue = queueArbetare.iterator();
        System.out.println("Listan från Queue Listan : ");
        System.out.println("*******************************************************************'");
        while (iteratorQueue.hasNext()) {
            ArbetareAbs arbeternas = (ArbetareAbs) iteratorQueue.next();
            System.out.println(arbeternas.getArbetare() + " ");
        } // end while

       /* ArbetareAbs SearchKey = new ArbetsMyror("Aisha", "Hassan" , 209);
        int index = Collections.binarySearch(queueArbetare, SearchKey, new SearchArbetare());
        System.out.println("Index of the searched key: " + index);*/





    }

}

