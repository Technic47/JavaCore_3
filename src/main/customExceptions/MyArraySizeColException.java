package main.customExceptions;

public class MyArraySizeColException extends MyArraySizeException{
    private final int colNumber;

    public MyArraySizeColException(String message, String axis, int excess, int colNumber) {
        super(message, axis, excess);
        this.colNumber = colNumber;
    }

    public int getColNumber() {
        return colNumber;
    }
}
