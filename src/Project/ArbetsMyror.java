package Project;

public class ArbetsMyror extends Arbetare{




// constructure


    @Override
    public String getFullnamn() {
        return super.getFullnamn();
    }

    public ArbetsMyror(String name, String efternamn, int id /*String arbetstyp*/) {
        super(name, efternamn, id /*arbetstyp*/);
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
    public String getArbetstyp() {
        return super.getArbetstyp();
    }

    @Override
    public String getArbetare() {
        return super.getArbetare();
    }
}
