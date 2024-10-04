import java.util.List;
import java.util.ArrayList;

public class GameManager {
    private List<Player> players;
    private int currentPlayerIndex;
    private boolean gameOver;

    public GameManager(int numPlayers) {
        players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(new Player("Player " + i));
        }
        currentPlayerIndex = 0;
        gameOver = false;
    }

    public void startGame() {
        while (!gameOver) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println("Current Player: " + currentPlayer.getName());

            currentPlayer.takeTurn();

            if (currentPlayer.getScore() >= 12) {
                System.out.println(currentPlayer.getName() + " triggered the last round!");
                gameOver = true;
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size(); // Move to next player
        }

        endGame();
    }

    private void endGame() {
        Player winner = players.get(0);
        for (Player player : players) {
            if (player.getScore() > winner.getScore()) {
                winner = player;
            }
        }
        System.out.println("The winner is " + winner.getName() + " with " + winner.getScore() + " points!");
    }
}
