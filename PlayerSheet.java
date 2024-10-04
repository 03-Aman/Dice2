import java.util.Scanner;

public class PlayerSheet {
    private AbilityTrack abilityTrack;

    public PlayerSheet() {
        this.abilityTrack = new AbilityTrack();
    }

    public Tile chooseTile(int[] diceRolls) {
        // Simulated user selection of tile based on dice rolls
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a tile size based on dice (1-5): ");
        int size = scanner.nextInt();
        return new Tile(size);
    }

    public void unlockAbility(int[] diceRolls) {
        abilityTrack.unlockAbility(diceRolls);
    }
}
