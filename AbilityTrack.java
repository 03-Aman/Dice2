public class AbilityTrack {
    private int[] track;

    public AbilityTrack() {
        this.track = new int[5];  // Simulated ability track with 5 slots
    }

    public void unlockAbility(int[] diceRolls) {
        for (int color : diceRolls) {
            if (color < track.length) {
                track[color]++;
                if (track[color] >= 5) {
                    System.out.println("Ability unlocked for color " + color);
                }
            }
        }
    }
}
