package javaGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      /*ArrayList <Integer>items = new ArrayList <Integer>();
        items.add(1);
        items.add(2);
        //items.add("Aisha");
        items.add(3);
        printDouble(items);*/

        // Generic classes -> players ,teams

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer Pat = new BaseballPlayer("Pat");
        SoccerPlayer Beckham = new SoccerPlayer("Beckham");

        Team <FootballPlayer> adelaideCrows = new Team <>("adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(Pat);
        //adelaideCrows.addPlayer(Beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team <BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(Pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(Beckham);

    }
    /*private static void printDouble (ArrayList<Integer> n){
        for (int i : n){
            System.out.println(i * 2);

        } // end for
    } // end printDouble*/
}
