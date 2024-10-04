import java.util.Random;

public class Dice {
    private static final int NUM_DICE = 5;
    private static final int NUM_COLORS = 6; // 5 colors + 1 wild (white)

    public int[] roll() {
        Random random = new Random();
        int[] diceRolls = new int[NUM_DICE];
        for (int i = 0; i < NUM_DICE; i++) {
            diceRolls[i] = random.nextInt(NUM_COLORS);  // Rolling between 0-5
        }
        return diceRolls;
    }

    public String displayDice(int[] diceRolls) {
        StringBuilder sb = new StringBuilder();
        for (int roll : diceRolls) {
            sb.append(roll).append(" ");
        }
        return sb.toString().trim();
    }
}
