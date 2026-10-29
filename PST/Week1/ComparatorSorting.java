import java.util.*;
class ComparatorSorting {
    static class Player { String name; int score; Player(String n,int s){name=n;score=s;} }
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>(Arrays.asList(
            new Player("amy",100), new Player("david",100), new Player("heraldo",50)));
        players.sort((a,b) -> a.score != b.score ? Integer.compare(b.score,a.score) : a.name.compareTo(b.name));
        for (Player p:players) System.out.println(p.name+" "+p.score);
    }
}
