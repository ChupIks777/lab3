package Classes.Exceptions;

public class NegativeNumberException extends Exception {
    @Override
    public String getMessage(){
        return "Число должно быть положительным!";
    }
}
