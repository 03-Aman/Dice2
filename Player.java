public class Player {
    private String name;
    private PlayerSheet playerSheet;
    private FacadeSheet facadeSheet;
    private ScoreManager scoreManager;

    public Player(String name) {
        this.name = name;
        this.playerSheet = new PlayerSheet();
        this.facadeSheet = new FacadeSheet();
        this.scoreManager = new ScoreManager();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return scoreManager.getScore();
    }

    public void takeTurn() {
        Dice dice = new Dice();
        int[] diceRolls = dice.roll();

        System.out.println(name + " rolled: " + dice.displayDice(diceRolls));

        // Choose tile based on dice and draw it
        Tile selectedTile = playerSheet.chooseTile(diceRolls);
        facadeSheet.placeTile(selectedTile);

        // Calculate score
        int points = scoreManager.calculateScore(facadeSheet);
        System.out.println(name + " scored " + points + " points, total score: " + scoreManager.getScore());

        // Unlock abilities
        playerSheet.unlockAbility(diceRolls);
    }
}
