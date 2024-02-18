package q1;

public class App {
    public static void main(String[] args) {
        Game basketballGame = new BasketballGame();
        Game footballGame = new FootballGame();
        footballGame.playGame();
        basketballGame.playGame();
    }
}
