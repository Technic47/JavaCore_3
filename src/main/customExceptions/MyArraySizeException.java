package main.customExceptions;

public class MyArraySizeException extends Exception {
    private final String axis;
    private final int excess;


    public MyArraySizeException(String message, String axis, int excess) {
        super(message);
        this.axis = axis;
        this.excess = excess;
    }

    public String getAxis() {
        return axis;
    }

    public int getExcess() {
        return excess;
    }
}
