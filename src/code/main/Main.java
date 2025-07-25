package code.main;

public class Main{
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame(){
        Game game = new Game();
        game.start();
    }
}