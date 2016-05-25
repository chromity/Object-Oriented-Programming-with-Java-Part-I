
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> list;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
        list = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }

    public void addPlayer(Player member) {
        if (this.size() == this.maxSize) {
            return;
        }

        list.add(member);
    }

    public void printPlayers() {
        for (Player member : list) {
            System.out.println(member);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.list.size();
    }

    public int goals() {
        int goals = 0;
        for (Player member : list) {
            goals += member.goals();
        }

        return goals;
    }
}
