package Project;

public class ArbetsMyror extends Arbetare{

String name;


// constructure


    public ArbetsMyror(String name, String efternamn, int id, String desscription) {
        super(name, efternamn, id, desscription);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getEfternamn() {
        return super.getEfternamn();
    }

    @Override
    public int getId() {
        return super.getId();
    }



    //method


    @Override
    public String getDescription() {
        return "Myror";
    }

    @Override
    public String getArbetare() {
        return name =  "Arbetaren's Full namn är :  " + getName() + getEfternamn() + "\n"+ " ID till användaren är : " + getId()+ "\n" + " Arbetaren är typen of : "+ getDescription() + isArbetareHasSkor();
    }
}
