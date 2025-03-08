package model;

public class Game {
    
    private UserList users;
    private GameManager manager;
    private User currUser;
    private int gameMode;

    public Game(UserList users) {
        this.users = users;
    }

    public void play() {
        this.manager  = new GameManager(currUser.getBestScore());
        manager.run(gameMode);
    }

    public void move(int direction) {
        manager.moveBlocks(direction);
    }

    public void setUpGame(int mode) {
        this.manager  = new GameManager(currUser.getBestScore());
        manager.setBoard();

        gameMode = mode;
        manager.setMode(mode);
    }

    public int getBoard(int yPos, int xPos) {
        return manager.getBoard(yPos, xPos);
    }

    public boolean logIn(String userName, String password) {
        if (!users.hasUser(userName, password)) {
            return false;
        }
        currUser = users.getUser(userName, password);
        return true;
    }

    public int getCurrScore() {
        return manager.getCurrScore();
    }

    public boolean hasWon() {
        return manager.hasWon();
    }

    public boolean hasLost() {
        return manager.hasLost();
    }

    public User getCurrUser() {
        return currUser;
    }

    public void logOut() {
        users.saveUsers();
    }
}
