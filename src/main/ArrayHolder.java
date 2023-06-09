package main;

import main.customExceptions.MyArrayDataException;
import main.customExceptions.MyArraySizeColException;
import main.customExceptions.MyArraySizeException;

public class ArrayHolder {
    private String[][] array;
    public static final Integer ROWS = 4;
    public static final Integer COLS = 4;

    public ArrayHolder() {
        this.array = new String[ROWS][COLS];
    }

    public void setArray(String[][] array) throws MyArraySizeException {
        int newRows = array.length;
        if (newRows > ROWS) {
            throw new MyArraySizeException("Incoming array size exceeded", "rows", newRows - ROWS);
        }
        for (int i = 0; i < array.length; i++) {
            int newCols = array[i].length;
            if (newCols > COLS) {
                throw new MyArraySizeColException("Incoming array size exceeded", "cols", newCols - COLS, i);
            }
        }
        this.array = array;
    }

    public int sumAll() throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Can not parse symbols", i, j);
                }
            }
        }
        return sum;
    }
}
