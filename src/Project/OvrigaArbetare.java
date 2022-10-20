package Project;

import java.util.ArrayList;

public class OvrigaArbetare extends Arbetare{


    public OvrigaArbetare(String name, String efternamn, int id, String desscription) {
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
    public String getFullnamn() {
        return super.getFullnamn();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getArbetare() {
        return super.getArbetare();
    }


    @Override
    public String getDescription() {
        return "Ovriga";
    }
}
