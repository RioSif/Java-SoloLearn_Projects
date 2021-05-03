import java.util.HashMap;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public String getWinner(HashMap<String, Integer> players) {
        int temp = 0;
        String winner = null;

        for (String key : players.keySet()) {
            if (players.get(key) > temp) {
                temp = players.get(key);
                winner = key;
            }
        }
        return winner;
    }
}