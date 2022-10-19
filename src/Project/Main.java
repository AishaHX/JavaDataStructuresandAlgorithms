package Project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

TyperAvArbetare typerAvArbetare = new TyperAvArbetare();
        // building 2 types of Arbetare using composition
        // Arbets Myror
        ArrayList<TyperAvArbetare> TypMyror = new ArrayList<TyperAvArbetare>();
       // TyperAvArbetare ArbetsMyror = new TyperAvArbetare();
           // Ovriga arbetare
       // TyperAvArbetare TypOvriga = new TyperAvArbetare();
        TyperAvArbetare typerAvArbetare1 = new TyperAvArbetare();
        Arbetare arbetare1 = new Arbetare("Aisha " , "Hassan",44 , typerAvArbetare1.getDescription());

        ArbetsMyror arbetare44 = new ArbetsMyror("ola" , "hans" , 88 , ArbetsMyror.getDescription());
        System.out.println(arbetare1.getArbetare());
        System.out.println(arbetare44.getArbetare());

       /* ArbetsMyror arbetsMyror1 = new ArbetsMyror("oscar" , "wikström" , 22 , ArbetsMyror );
        Arbetare arbetare2 = new Arbetare("laza " , "G" ,33, ArbetsMyror);
        Arbetare arbetare5 = new Arbetare("Alex", "Nord" ,111,TypMyror);*/




        /*System.out.println(arbetare2.getArbetare());
        System.out.println(arbetsMyror1.getArbetare());
        System.out.println(arbetare1.getArbetare());*/


        // Queue

       /* PersonalLista personalQueue = new PersonalLista();
       personalQueue.enQueue(arbetsMyror1);

        personalQueue.show();*/






    }
}
