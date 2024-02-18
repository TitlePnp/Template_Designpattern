package q1;

public class BasketballGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("Initialize basketball game...");
    }

    @Override
    protected void playing() {
        System.out.println("Playing basketball game...");
    }

    @Override
    protected void showResult() {
        System.out.println("Showing the results for the basketball game...");
    }
    
}
