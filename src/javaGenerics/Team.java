package javaGenerics;

import java.util.ArrayList;
// base class -> Type T -> Generics
public class Team  <T extends Player>{
    private String name;
    int played = 0;

    int won = 0;

    int lost = 0;

    int tied = 0;

    private ArrayList<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer (T player ){
        if (members.contains(player)){
            System.out.println(player.getName() + "is already on this team");
        } else {
            members.add(player);
            System.out.println(player.getName()+ "picked for team" + this.members);
        }// end if
        return true;

    } // end addPlayer

    // a method that returns the players on the team
    public int numPlayers () {
        return this.members.size();
    } // end numPlayers

    // a method returns the result

    public void matchResult (Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
        }else if (ourScore == theirScore ){
            tied++;

        } else {
            lost++;

        }// end if
        played++;
        if (opponent != null){
            opponent.matchResult(null, theirScore,ourScore);
        }// end if

    }//end matchResult

    // ranking

    public int ranking (){
        return (won * 2) +tied;
    } // end ranking
}
