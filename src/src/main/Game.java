package main;

public class Game {

    //calls gameWindow and gamePanel class
    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game() {
        //Initalizes gamePanel() and initalizes gameWindow while taking in
        // the parameter gamePanel()
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
    }

}
