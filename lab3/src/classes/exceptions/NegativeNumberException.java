package classes.exceptions;

public class NegativeNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Число должно быть положительным!";
    }
}
