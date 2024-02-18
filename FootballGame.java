package q1;

public class FootballGame extends Game  {

    @Override
    protected void initialize() {
        System.out.println("Initialize football game...");
    }

    @Override
    protected void playing() {
        System.out.println("Playing football game...");
    }

    @Override
    protected void showResult() {
        System.out.println("Showing the results for the football game...");
    }
}