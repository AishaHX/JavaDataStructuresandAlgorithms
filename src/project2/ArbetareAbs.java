package project2;

public abstract class ArbetareAbs {
    private String name;
    private String efternamn;
    private int id;

    public ArbetareAbs(String name, String efternamn, int id) {
        this.name = name;
        this.efternamn = efternamn;
        this.id = id;
    }

    public  String getName(){
        return name;
    }

    public  String getEfternamn(){
        return efternamn;
    }

    public int getId(){
        return id;

    }

    public abstract String getArbetare();

}
