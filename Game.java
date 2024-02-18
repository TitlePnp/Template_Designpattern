package q1;

public abstract class Game {
    protected abstract void initialize();
    protected abstract void playing();
    protected abstract void showResult();

    public final void playGame() {
        initialize();
        playing();
        showResult();
    }
}
