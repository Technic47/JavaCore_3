package main;

import main.customExceptions.MyArrayDataException;
import main.customExceptions.MyArraySizeColException;
import main.customExceptions.MyArraySizeException;

//1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3 В методе main() вызвать полученный метод, обработать возможные исключения
//MyArraySizeException и MyArrayDataException и вывести результат расчета.
public class Starter {
    public static void main(String[] args) {
        String[][] newArray = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "3", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};
        ArrayHolder holder = new ArrayHolder();
        try {
            holder.setArray(newArray);
            System.out.printf("Sum is - %d", holder.sumAll());
        } catch (MyArraySizeColException e) {
            System.out.printf("%s in %s #%d by %d\n", e.getMessage(), e.getAxis(), e.getColNumber(), e.getExcess());
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            System.out.printf("%s in %s by %d\n", e.getMessage(), e.getAxis(), e.getExcess());
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.printf("%s in %d row and %d col\n", e.getMessage(), e.getRow(), e.getCol());
            e.printStackTrace();
        }
    }
}
