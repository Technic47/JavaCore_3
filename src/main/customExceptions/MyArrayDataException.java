package main.customExceptions;

public class MyArrayDataException extends Exception{
    private final int row;
    private final int col;

    public MyArrayDataException(String message, int row, int col) {
        super(message);
        this.row = row + 1;
        this.col = col + 1;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
