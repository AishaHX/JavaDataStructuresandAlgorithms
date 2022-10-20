package Project;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLista {
    Queue<Arbetare> queueArbetare = new LinkedList<Arbetare>();


    public static void main(String[] args) {


        // ADIng : endque
        // Remove : dequeu
        // Adding Personal into the Queu

        Queue<Arbetare> queueArbetare = new LinkedList<Arbetare>();
        // Adding elements into the list
       queueArbetare.add(new Arbetare("Aisha" ,"Hassan" , 99, "Myror"));
        queueArbetare.add(new Arbetare("Laza" ,"Gabriout" , 90, "Ovriga"));
        queueArbetare.add(new Arbetare("Oscar" ,"Wikström" , 90, "Bee"));
        queueArbetare.add(new Arbetare("Alexander" ,"Nordström" , 80, "Bee"));

        // Looping through elements in the list
        Iterator iterator = queueArbetare.iterator();
        while (iterator.hasNext()){
            Arbetare element = (Arbetare) iterator.next();
            System.out.println(element.getArbetare() + " ");
        } // end while

        // removing

        /*Arbetare removedis = queueArbetare.remove();
        System.out.println(removedis.getArbetare());*/

        System.out.println("You're deleting first person on the list now, and person you deleted is : "+queueArbetare.poll().getArbetare());
        System.out.println("Now first person on the list is : " + queueArbetare.peek().getFullnamn());
        System.out.println("There are " + queueArbetare.size() + " " + "Elements on the list");


    } // end main





        //queuePersonal.poll();
    }
    //FIFO




