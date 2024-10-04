public class FacadeSheet {
    private static final int ROWS = 5;
    private static final int COLS = 5;
    private char[][] grid;

    public FacadeSheet() {
        grid = new char[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = ' ';  // Empty grid
            }
        }
    }

    public void placeTile(Tile tile) {
        // Simulated tile placement logic
        System.out.println("Placed a tile of size " + tile.getSize());
    }

    // You can add methods for checking rows, columns, etc.
}
