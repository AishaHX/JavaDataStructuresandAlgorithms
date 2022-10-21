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
       /*queueArbetare.add(new Arbetare("Aisha" ,"Hassan" , 99, "Myror"));

        queueArbetare.add(new Arbetare("Oscar" ,"Wikström" , 90, "Bee"));

        queueArbetare.add(new Arbetare("Alexander" ,"Nordström" , 80, "Bee"));*/
        queueArbetare.add(new OvrigaArbetare("jj" , "gvgd" , 89));

        queueArbetare.add(new ArbetsMyror("pelle", "svensson" ,88));



        // Search

        /*Arbetare value;
        public Arbetare Searach(queueArbetare,value){


            for (int i = 0; i < queueArbetare.size(); i++) {

            } /// end search

            return value.getArbetare();


        } // end search */



        /*public boolean search(queueArbetare.equals(), int x)
        {
            // Base case
            if (head == null)
                return false;

            // If key is present in current node,
            // return true
            if (head.data == x)
                return true;

            // Recur for remaining list
            return search(head.next, x);
        }*/


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




