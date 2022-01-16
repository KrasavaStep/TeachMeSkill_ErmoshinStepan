package lesson2;

/**
 * создать 3 числа типа int, short, byte. Вывести на экран макс значение, мин значение и средее
 * maximum:
 * min
 */

public class Task1 {
    public static void main(String[] args) {
        int firstNumber = 3;
        short secondNumber = 6;
        byte thirdNumber = 21;

        int max, min, avg;

        max = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        min = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));

        if (firstNumber > min && firstNumber < max)
            avg = firstNumber;
        else if (secondNumber > min && secondNumber < max)
            avg = secondNumber;
        else avg = thirdNumber;

        System.out.println("Maximum: " + max +
                "\nMinimum: " + min +
                "\nAverage: " + avg);
    }
}
