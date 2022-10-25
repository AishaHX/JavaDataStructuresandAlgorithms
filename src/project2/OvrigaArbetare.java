package project2;

import java.util.Scanner;

public class OvrigaArbetare extends ArbetareAbs implements IArabetare{
    String info;
    public OvrigaArbetare(String name, String efternamn, int id) {
        super(name, efternamn, id);
    }

    @Override
    public String getArbetare() {
        return info = "Arbetaren's Full namn är :  " + getName() + " " + getEfternamn() + "\n" + " ID till användaren är : " + getId() + "\n" + " Arbetaren är typen of : " + getDescription() + "\n" + isArbetareHasSkor();

    }

    @Override
    public String getDescription() {
        return "Ovriga Arbetare";
    }

    @Override
    public boolean isArbetareHasSkor() {
        int villDuharSkyddSkor;
        System.out.println("Vill du skkyd Skor , svara 1 för jaa eller  0 för nej Tack!");
        Scanner scanner = new Scanner(System.in);
        villDuharSkyddSkor = scanner.nextInt();
        if (villDuharSkyddSkor == 1) {
            System.out.println("Tack ! du har skor nu");
            return true;
        } else {
            System.out.println("Tack ! du har  inga skor nu");
            return false;

        }
    }


}
