package Project;


import java.util.ArrayList;
import java.util.Scanner;

public class Arbetare  extends Arbetsgivare{
    private String name;
    private String efternamn;
    private int id;
    private String arbetstyp;

    //private String arbetstyp;
    // Composition -> creating array list of type arbetsMyrors classen
    //public TyperAvArbetare typerAvArbetares;
    //public  ArrayList<TyperAvArbetare> typerAvArbetares;
    //public TyperAvArbetare typerAvArbetare;
    //public String desscription;
    //String typerAvArbetare;

    /*public ArrayList<TyperAvArbetare> getTyperAvArbetares() {
        return typerAvArbetares;
    }*/

//isArbetareHasSkor();


    //CON

    public Arbetare(String name, String efternamn, int id/*String arbetstyp*/) {
        this.name = name;
        this.efternamn = efternamn;
        this.id = id;
        //this.arbetstyp = arbetstyp;
    }






    /*public TyperAvArbetare getTyperAvArbetare() {
        return typerAvArbetare;
    }
*/



    // get namn
    public String getName() {
        return name;
    }
    public String getEfternamn() {
        return efternamn;
    }

    // get Full namne

    public String getFullnamn (){

        return getName() + " " + getEfternamn();
    } //

    // get id
   public int getId(){
        return id;
   }//


    // Metod HasSkyddskor
    public static boolean isArbetareHasSkor (){
        int villDuharSkyddSkor;
        System.out.println("Vill du skkyd Skor , svara 1 för ja eller  0 för nej Tack!");
        Scanner scanner = new Scanner(System.in);
        villDuharSkyddSkor = scanner.nextInt();
        if (villDuharSkyddSkor == 1 ){
            System.out.println("Tack ! du har skor nu");
            return true;
        } else {
            System.out.println("Tack ! du har  inga skor nu");
            return false;
        }
    }

    // Get arbetare Typ
    /*public String getArbetstyp() {
        return arbetstyp;
    }*/


    /*public String TypOfArbetare (){
        return "Arbetaren har ingen Typ";
    } //*/

    public  String getDescription() {
        return "is Arbetare ";
    }

    public String getArbetstyp() {
        return arbetstyp;
    }

    // gett Arbetare information
    public String getArbetare (){
        return name =  "Arbetaren's Full namn är :  " +getFullnamn() + "\n"+ " ID till användaren är : " + getId()+ "\n" + " Arbetaren är typen of : "+ getDescription() + " ,"+ isArbetareHasSkor();

    }





}
