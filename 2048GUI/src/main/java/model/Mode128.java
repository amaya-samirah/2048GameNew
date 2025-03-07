package model;



/**
 * This is the 128 game mode
 * @author Amaya Shabazz
 */

public class Mode128 implements GameMode {
    private GameBoard board;
    private final int win = 128;

    public Mode128(GameBoard board) {
        this.board = board;
    }

    @Override
    public boolean hasWon(int[][] board) {
        boolean won = false;

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (board[y][x] == win) {
                    won = true;
                }
            }
        }
        return won;
    }
}
