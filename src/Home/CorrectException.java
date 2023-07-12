package Home;

public class CorrectException extends Throwable {
    String correct;
    public CorrectException(String cor) {
        correct=cor;
    }
}
